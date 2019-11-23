package myevaluator.views;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import com.google.gson.Gson;

import myevaluator.libs.CourseSelected;
import myevaluator.libs.GetAnswers;
import myevaluator.libs.GetCoursesResponse;
import myevaluator.libs.LoginResponse;
import myevaluator.libs.Request;
import myevaluator.models.Credentials;

import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RandomReviewMenu extends JFrame {

  JFrame frame;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {

          AdminCourses window = new AdminCourses();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public RandomReviewMenu() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {

    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(94, 18, 282, 188);
    frame.getContentPane().add(scrollPane);

    JList list = new JList(getCourses().toArray());
    scrollPane.setViewportView(list);

    JButton btnSetFeedback = new JButton("Set Feedback");
    btnSetFeedback.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String CoursesSelected = list.getSelectedValue().toString();
        System.out.println(CoursesSelected);
        Request r = new Request();

        Gson g = new Gson();
        String json = g.toJson(new CourseSelected(CoursesSelected));
        StringBuilder s = r.SendRequest(
            "http://0.0.0.0:80/get_courses", "GET", json);
        Gson g2 = new Gson();
        GetAnswers log = g2.fromJson(s.toString(), GetAnswers.class);
      }
    });
    btnSetFeedback.setBounds(181, 217, 117, 23);
    frame.getContentPane().add(btnSetFeedback);

  }

  public ArrayList<String> getCourses() {

    Request r = new Request();
    String data = r.SendRequest("http://0.0.0.0:80/get_courses", "GET","").toString();
        
    Gson g = new Gson();
    GetCoursesResponse response = g.fromJson(data, GetCoursesResponse.class);

    return response.getCourses();

  }
}

package myevaluator.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;

import myevaluator.libs.RandomAnswer;
import myevaluator.libs.Request;
import myevaluator.models.CurrentUser;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CourseRandomReview extends JFrame {

  private JPanel contentPane;
  private JTextField Randomtxt;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          CourseRandomReview frame = new CourseRandomReview();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public CourseRandomReview() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    
    Randomtxt = new JTextField();
    Randomtxt.setColumns(10);
    
    JLabel lblNewLabel = new JLabel("Set Review");
    
    JButton btnSubmit = new JButton("Submit");
    btnSubmit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String Random=Randomtxt.getText();
        Request r1 = new Request();

        Gson g11 = new Gson();
        String json1 = g11.toJson(new RandomAnswer(Random));
        r1.SendRequest("http://0.0.0.0:80/get_answers", "GET",json1);
      }
    });
    GroupLayout gl_contentPane = new GroupLayout(contentPane);
    gl_contentPane.setHorizontalGroup(
      gl_contentPane.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_contentPane.createSequentialGroup()
          .addGap(0)
          .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
              .addGap(179)
              .addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGap(113))
            .addGroup(gl_contentPane.createSequentialGroup()
              .addGap(62)
              .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addComponent(Randomtxt, GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addGroup(gl_contentPane.createSequentialGroup()
                  .addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                  .addGap(201)))))
          .addGap(65))
    );
    gl_contentPane.setVerticalGroup(
      gl_contentPane.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_contentPane.createSequentialGroup()
          .addGap(18)
          .addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
          .addPreferredGap(ComponentPlacement.RELATED)
          .addComponent(Randomtxt, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
          .addGap(32)
          .addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
          .addGap(20))
    );
    contentPane.setLayout(gl_contentPane);
  }
}

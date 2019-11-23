package myevaluator.views;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import com.google.gson.Gson;

import myevaluator.libs.GetCoursesResponse;
import myevaluator.libs.Request;

import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentReviewCourses extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					StudentReviewCourses window = new StudentReviewCourses();
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
	public StudentReviewCourses() {
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
		
		JButton btnNewButton = new JButton("SetFeedBack");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(181, 218, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		
	
	}
	
	public ArrayList<String> getCourses() {
		
		Request r = new Request();
		String data = r.SendRequest("http://0.0.0.0:80/get_courses_for_student", "GET","").toString();
		Gson g = new Gson();
		GetCoursesResponse response = g.fromJson(data, GetCoursesResponse.class);
		
		
		return response.getCourses();
		
	}
}

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

public class AdminCourses extends JFrame{

	private JFrame frame;

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
	public AdminCourses() {
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
		
		
	
	}
	
	public ArrayList<String> getCourses() {
		
		Request r = new Request();
		String data = r.SendRequest("http://0.0.0.0:80/get_courses", "GET","").toString();
		Gson g = new Gson();
		GetCoursesResponse response = g.fromJson(data, GetCoursesResponse.class);
		
		
		return response.getCourses();
		
	}
}

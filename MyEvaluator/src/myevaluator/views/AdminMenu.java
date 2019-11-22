package myevaluator.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu frame = new AdminMenu();
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
	public AdminMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Menu");
		lblNewLabel.setFont(new Font("Seravek", Font.PLAIN, 16));
		lblNewLabel.setBounds(179, 23, 111, 16);
		contentPane.add(lblNewLabel);
		
		JButton addUser = new JButton("Add User");
		addUser.setBounds(109, 71, 239, 29);
		contentPane.add(addUser);
		
		JButton facultydashboard = new JButton("Get Analysis Based on Professors");
		facultydashboard.setBounds(109, 118, 245, 29);
		contentPane.add(facultydashboard);
		
		JButton btnGetAnalysisBased = new JButton("Get Analysis Based on Courses");
		btnGetAnalysisBased.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminCourses a = new AdminCourses();
				a.setVisible(true);
				System.out.println("ttttt");
			}
		});
		btnGetAnalysisBased.setBounds(109, 163, 245, 29);
		contentPane.add(btnGetAnalysisBased);
	}
}

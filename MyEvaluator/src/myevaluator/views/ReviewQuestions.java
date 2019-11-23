package myevaluator.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;

import myevaluator.libs.FullReviewAnswers;
import myevaluator.libs.RandomAnswer;
import myevaluator.libs.Request;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReviewQuestions extends JFrame {

	private JPanel contentPane;
	private JTextField welltxt;
	private JTextField textField_2;
	private JTextField wrongtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReviewQuestions frame = new ReviewQuestions();
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
	public ReviewQuestions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("What went well?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

		welltxt = new JTextField();
		welltxt.setColumns(10);

		JLabel lblWhatWentWrong = new JLabel("What went wrong?");
		lblWhatWentWrong.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel improvedtxt = new JLabel("What could be improved?");
		improvedtxt.setFont(new Font("Tahoma", Font.PLAIN, 15));

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		wrongtxt = new JTextField();
		wrongtxt.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String well=welltxt.getText();
				String wrong=wrongtxt.getText();
				String improved=textField_2.getText();
				Request r1 = new Request();

				Gson g11 = new Gson();
				String json1 = g11.toJson(new FullReviewAnswers(well,wrong,improved));
				r1.SendRequest("http://0.0.0.0:80/get_answers", "GET",json1);
			}

		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
										.addGap(220))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(welltxt, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
										.addGap(46))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblWhatWentWrong, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(290))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(wrongtxt, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
										.addGap(46))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(improvedtxt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(247))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup()
														.addGap(301)
														.addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
										.addGap(46))))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(welltxt, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
						.addGap(17)
						.addComponent(lblWhatWentWrong)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(wrongtxt, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(improvedtxt)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(5))
				);
		contentPane.setLayout(gl_contentPane);
	}
}

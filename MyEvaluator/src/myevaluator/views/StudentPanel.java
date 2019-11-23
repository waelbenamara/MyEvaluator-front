package myevaluator.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class StudentPanel extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          StudentPanel frame = new StudentPanel();
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
  public StudentPanel() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBackground(Color.BLACK);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    
    JButton btnNewButton = new JButton("Full Review");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	  FullReviewCoursesList fr = new FullReviewCoursesList();
    	  fr.main(null);
    	  
      }
    });
    
    JButton btnRandomReview = new JButton("Random Review");
    btnRandomReview.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		RandomReviewMenu rr = new RandomReviewMenu();
    		rr.main(null);
    	}
    });
    GroupLayout gl_contentPane = new GroupLayout(contentPane);
    gl_contentPane.setHorizontalGroup(
      gl_contentPane.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_contentPane.createSequentialGroup()
          .addGap(142)
          .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRandomReview, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
          .addGap(136))
    );
    gl_contentPane.setVerticalGroup(
      gl_contentPane.createParallelGroup(Alignment.LEADING)
        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
          .addGap(73)
          .addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
          .addGap(39)
          .addComponent(btnRandomReview, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
          .addGap(71))
    );
    contentPane.setLayout(gl_contentPane);
  }

}

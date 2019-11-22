package myevaluator.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;

import myevaluator.libs.LoginResponse;
import myevaluator.libs.Request;
import myevaluator.models.Credentials;

import java.awt.GridLayout;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {
  private JTextField textField;
  private JTextField email;
  private JPasswordField passwordField;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Login frame = new Login();
          
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
  public Login() {
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
    
    JPanel panel = new JPanel();
    panel.setBackground(Color.BLACK);
    getContentPane().add(panel);
    panel.setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Email");
    lblNewLabel.setForeground(Color.WHITE);
    lblNewLabel.setBounds(112, 99, 61, 16);
    panel.add(lblNewLabel);
    
    JLabel lblPassword = new JLabel("Password");
    lblPassword.setForeground(Color.WHITE);
    lblPassword.setBounds(112, 139, 61, 16);
    panel.add(lblPassword);
    
    email = new JTextField();
    email.setBounds(185, 94, 130, 26);
    panel.add(email);
    email.setColumns(10);
    
    JButton btnNewButton = new JButton("Login");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String mail = email.getText();
        String password = passwordField.getText();
        Request r = new Request();
        
        Gson g = new Gson();
        String json = g.toJson(new Credentials(mail,password));
        StringBuilder s = r.SendRequest("http://0.0.0.0:80/login","GET", json);
        System.out.println(s.toString());
        Gson g2 = new Gson();
        LoginResponse log = g2.fromJson(s.toString(),LoginResponse.class);
   
        
        
        if(log.getResponse().equals("200") && log.getType().equals("Professor")) {
        	System.out.print("Professor");
        } else if(log.getResponse().equals("200") && log.getType().equals("Student")) {
        	System.out.println("Student");
        } else if(log.getResponse().equals("200") && log.getType().equals("Faculty")) {
        	System.out.println("Faculty");
        }else {
        	System.out.println("Login errors");
        }
        	
        
       
      }
    });
    btnNewButton.setBounds(170, 198, 117, 29);
    panel.add(btnNewButton);
    
    JLabel lblNewLabel_1 = new JLabel("Welcome to MyEvaluator");
    lblNewLabel_1.setFont(new Font("Sinhala Sangam MN", Font.PLAIN, 28));
    lblNewLabel_1.setForeground(Color.WHITE);
    lblNewLabel_1.setBounds(77, 16, 296, 42);
    panel.add(lblNewLabel_1);
    
    passwordField = new JPasswordField();
    passwordField.setBounds(185, 134, 130, 26);
    panel.add(passwordField);
    
   
    
  }
}

package myevaluator.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
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

public class Login extends JFrame {
  private JTextField textField;

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
    
    JLabel lblNewLabel = new JLabel("Validate Account");
    lblNewLabel.setForeground(Color.WHITE);
    lblNewLabel.setBounds(59, 6, 116, 16);
    panel.add(lblNewLabel);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Professor", "Student", "Faculty"}));
    comboBox.setBounds(48, 99, 127, 27);
    panel.add(comboBox);
    
    JButton btnValid = new JButton("Validate");
    btnValid.setBounds(48, 192, 127, 29);
    panel.add(btnValid);
    
    JPanel panel_1 = new JPanel();
    panel_1.setBackground(Color.WHITE);
    getContentPane().add(panel_1);
    panel_1.setLayout(null);
    
    JLabel Login = new JLabel("Login");
    Login.setForeground(Color.BLACK);
    Login.setBounds(89, 6, 44, 16);
    panel_1.add(Login);
    
    JButton btnLogin = new JButton("Login");
    btnLogin.setBounds(55, 194, 127, 29);
    panel_1.add(btnLogin);
    
    textField = new JTextField();
    textField.setBounds(52, 99, 130, 26);
    panel_1.add(textField);
    textField.setColumns(10);
    
    
    
    
  }
}

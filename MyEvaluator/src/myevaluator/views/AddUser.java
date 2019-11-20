package myevaluator.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.google.gson.Gson;

import myevaluator.libs.MyRadioButtonCourses;
import myevaluator.libs.MyRadioButtonGroups;
import myevaluator.libs.Request;
import myevaluator.models.Professor;

public class AddUser {

  private JFrame frame;
  private JTextField textName;
  private JTextField textLastName;
  private JTextField textEmail;
  

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          AddUser window = new AddUser();
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
  public AddUser() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 700, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
    
    JPanel panel = new JPanel();
    panel.setBackground(Color.BLACK);
    frame.getContentPane().add(panel);
    panel.setLayout(null);
    
    MyRadioButtonCourses rdbtnNewRadioButton = new MyRadioButtonCourses("CS102");
    rdbtnNewRadioButton.setForeground(Color.WHITE);
    rdbtnNewRadioButton.setBounds(29, 57, 72, 23);
    panel.add(rdbtnNewRadioButton);
    
    MyRadioButtonCourses radioButton = new MyRadioButtonCourses("CS102");
    radioButton.setForeground(Color.WHITE);
    radioButton.setBounds(29, 92, 72, 23);
    panel.add(radioButton);
    
    MyRadioButtonCourses radioButton_1 = new MyRadioButtonCourses("CS102");
    radioButton_1.setForeground(Color.WHITE);
    radioButton_1.setBounds(29, 127, 72, 23);
    panel.add(radioButton_1);
    
    MyRadioButtonCourses radioButton_2 = new MyRadioButtonCourses("CS102");
    radioButton_2.setForeground(Color.WHITE);
    radioButton_2.setBounds(29, 162, 72, 23);
    panel.add(radioButton_2);
    
    MyRadioButtonCourses radioButton_3 = new MyRadioButtonCourses("CS102");
    radioButton_3.setForeground(Color.WHITE);
    radioButton_3.setBounds(29, 197, 72, 23);
    panel.add(radioButton_3);
    
    MyRadioButtonCourses radioButton_4 = new MyRadioButtonCourses("CS102");
    radioButton_4.setForeground(Color.WHITE);
    radioButton_4.setBounds(29, 232, 72, 23);
    panel.add(radioButton_4);
    
    MyRadioButtonCourses radioButton_5 = new MyRadioButtonCourses("CS102");
    radioButton_5.setForeground(Color.WHITE);
    radioButton_5.setBounds(29, 267, 72, 23);
    panel.add(radioButton_5);
    
    MyRadioButtonCourses radioButton_6 = new MyRadioButtonCourses("CS102");
    radioButton_6.setForeground(Color.WHITE);
    radioButton_6.setBounds(29, 302, 72, 23);
    panel.add(radioButton_6);
    
    MyRadioButtonCourses radioButton_7 = new MyRadioButtonCourses("CS102");
    radioButton_7.setForeground(Color.WHITE);
    radioButton_7.setBounds(29, 337, 72, 23);
    panel.add(radioButton_7);
    
    MyRadioButtonCourses radioButton_8 = new MyRadioButtonCourses("CS102");
    radioButton_8.setForeground(Color.WHITE);
    radioButton_8.setBounds(29, 22, 72, 23);
    panel.add(radioButton_8);
    
    MyRadioButtonCourses radioButton_9 = new MyRadioButtonCourses("CS102");
    radioButton_9.setForeground(Color.WHITE);
    radioButton_9.setBounds(132, 22, 72, 23);
    panel.add(radioButton_9);
    
    MyRadioButtonCourses radioButton_10 = new MyRadioButtonCourses("CS102");
    radioButton_10.setForeground(Color.WHITE);
    radioButton_10.setBounds(240, 22, 72, 23);
    panel.add(radioButton_10);
    
    MyRadioButtonCourses radioButton_11 = new MyRadioButtonCourses("CS102");
    radioButton_11.setForeground(Color.WHITE);
    radioButton_11.setBounds(132, 57, 72, 23);
    panel.add(radioButton_11);
    
    MyRadioButtonCourses radioButton_12 = new MyRadioButtonCourses("CS102");
    radioButton_12.setForeground(Color.WHITE);
    radioButton_12.setBounds(240, 57, 72, 23);
    panel.add(radioButton_12);
    
    MyRadioButtonCourses radioButton_13 = new MyRadioButtonCourses("CS102");
    radioButton_13.setForeground(Color.WHITE);
    radioButton_13.setBounds(132, 92, 72, 23);
    panel.add(radioButton_13);
    
    
    MyRadioButtonCourses radioButton_14 = new MyRadioButtonCourses("CS102");
    radioButton_14.setForeground(Color.WHITE);
    radioButton_14.setBounds(240, 92, 72, 23);
    panel.add(radioButton_14);
    
    MyRadioButtonCourses radioButton_15 = new MyRadioButtonCourses("CS102");
    radioButton_15.setForeground(Color.WHITE);
    radioButton_15.setBounds(132, 127, 72, 23);
    panel.add(radioButton_15);
    
    MyRadioButtonCourses radioButton_16 = new MyRadioButtonCourses("CS102");
    radioButton_16.setForeground(Color.WHITE);
    radioButton_16.setBounds(132, 162, 72, 23);
    panel.add(radioButton_16);
    
    MyRadioButtonCourses radioButton_17 = new MyRadioButtonCourses("CS102");
    radioButton_17.setForeground(Color.WHITE);
    radioButton_17.setBounds(132, 197, 72, 23);
    panel.add(radioButton_17);
    
    MyRadioButtonCourses radioButton_18 = new MyRadioButtonCourses("CS102");
    radioButton_18.setForeground(Color.WHITE);
    radioButton_18.setBounds(132, 232, 72, 23);
    panel.add(radioButton_18);
    
    MyRadioButtonCourses radioButton_19 = new MyRadioButtonCourses("CS102");
    radioButton_19.setForeground(Color.WHITE);
    radioButton_19.setBounds(132, 267, 72, 23);
    panel.add(radioButton_19);
    
    MyRadioButtonCourses radioButton_20 = new MyRadioButtonCourses("CS102");
    radioButton_20.setForeground(Color.WHITE);
    radioButton_20.setBounds(132, 302, 72, 23);
    panel.add(radioButton_20);
    
    MyRadioButtonCourses radioButton_21 = new MyRadioButtonCourses("CS102");
    radioButton_21.setForeground(Color.WHITE);
    radioButton_21.setBounds(132, 337, 72, 23);
    panel.add(radioButton_21);
    
    MyRadioButtonCourses radioButton_22 = new MyRadioButtonCourses("CS102");
    radioButton_22.setForeground(Color.WHITE);
    radioButton_22.setBounds(240, 127, 72, 23);
    panel.add(radioButton_22);
    
    MyRadioButtonCourses radioButton_23 = new MyRadioButtonCourses("CS102");
    radioButton_23.setForeground(Color.WHITE);
    radioButton_23.setBounds(240, 162, 72, 23);
    panel.add(radioButton_23);
    
    MyRadioButtonCourses radioButton_24 = new MyRadioButtonCourses("CS102");
    radioButton_24.setForeground(Color.WHITE);
    radioButton_24.setBounds(240, 197, 72, 23);
    panel.add(radioButton_24);
    
    MyRadioButtonCourses radioButton_25 = new MyRadioButtonCourses("CS102");
    radioButton_25.setForeground(Color.WHITE);
    radioButton_25.setBounds(240, 232, 72, 23);
    panel.add(radioButton_25);
    
    MyRadioButtonCourses radioButton_26 = new MyRadioButtonCourses("CS102");
    radioButton_26.setForeground(Color.WHITE);
    radioButton_26.setBounds(240, 267, 72, 23);
    panel.add(radioButton_26);
    
    MyRadioButtonCourses radioButton_27 = new MyRadioButtonCourses("CS102");
    radioButton_27.setForeground(Color.WHITE);
    radioButton_27.setBounds(240, 302, 72, 23);
    panel.add(radioButton_27);
    
    MyRadioButtonCourses radioButton_28 = new MyRadioButtonCourses("CS102");
    radioButton_28.setForeground(Color.WHITE);
    radioButton_28.setBounds(240, 337, 72, 23);
    panel.add(radioButton_28);
    
    Box horizontalBox = Box.createHorizontalBox();
    horizontalBox.setForeground(Color.WHITE);
    horizontalBox.setBackground(Color.WHITE);
    horizontalBox.setBounds(71, 430, 117, -28);
    panel.add(horizontalBox);
    
    JLabel lblNewLabel = new JLabel("Courses");
    lblNewLabel.setForeground(Color.WHITE);
    lblNewLabel.setBounds(40, 6, 61, 16);
    panel.add(lblNewLabel);
    
    JLabel lblGroups = new JLabel("Groups");
    lblGroups.setForeground(Color.WHITE);
    lblGroups.setBounds(40, 368, 61, 16);
    panel.add(lblGroups);
    
    MyRadioButtonGroups rdbtnF = new MyRadioButtonGroups("F1");
    rdbtnF.setForeground(Color.WHITE);
    rdbtnF.setBounds(18, 396, 61, 23);
    panel.add(rdbtnF);
    
    MyRadioButtonGroups rdbtnF_1 = new MyRadioButtonGroups("F2");
    rdbtnF_1.setForeground(Color.WHITE);
    rdbtnF_1.setBounds(91, 396, 61, 23);
    panel.add(rdbtnF_1);
    
    MyRadioButtonGroups rdbtnF_2 = new MyRadioButtonGroups("F3");
    rdbtnF_2.setForeground(Color.WHITE);
    rdbtnF_2.setBounds(164, 396, 61, 23);
    panel.add(rdbtnF_2);
    
    MyRadioButtonGroups rdbtnF_3 = new MyRadioButtonGroups("F4");
    rdbtnF_3.setForeground(Color.WHITE);
    rdbtnF_3.setBounds(240, 396, 47, 23);
    panel.add(rdbtnF_3);
    
    MyRadioButtonGroups rdbtnS = new MyRadioButtonGroups("S1");
    rdbtnS.setForeground(Color.WHITE);
    rdbtnS.setBounds(18, 430, 61, 23);
    panel.add(rdbtnS);
    
    MyRadioButtonGroups rdbtnS_1 = new MyRadioButtonGroups("S2");
    rdbtnS_1.setForeground(Color.WHITE);
    rdbtnS_1.setBounds(127, 430, 61, 23);
    panel.add(rdbtnS_1);
    
    MyRadioButtonGroups rdbtnS_2 = new MyRadioButtonGroups("S3");
    rdbtnS_2.setForeground(Color.WHITE);
    rdbtnS_2.setBounds(240, 430, 61, 23);
    panel.add(rdbtnS_2);
    
    MyRadioButtonGroups rdbtnSe = new MyRadioButtonGroups("SE-J");
    rdbtnSe.setForeground(Color.WHITE);
    rdbtnSe.setBounds(18, 472, 61, 23);
    panel.add(rdbtnSe);
    
    MyRadioButtonGroups rdbtnCsj = new MyRadioButtonGroups("CS-J");
    rdbtnCsj.setForeground(Color.WHITE);
    rdbtnCsj.setBounds(127, 472, 61, 23);
    panel.add(rdbtnCsj);
    
    MyRadioButtonGroups rdbtnRej = new MyRadioButtonGroups("RE-J");
    rdbtnRej.setForeground(Color.WHITE);
    rdbtnRej.setBounds(240, 472, 61, 23);
    panel.add(rdbtnRej);
    
   
    
    JPanel panel_1 = new JPanel();
    frame.getContentPane().add(panel_1);
    panel_1.setLayout(null);
    
    textName = new JTextField();
    textName.setBounds(111, 53, 201, 26);
    panel_1.add(textName);
    textName.setColumns(10);
    
    JLabel lblName = new JLabel("Name");
    lblName.setBounds(26, 58, 61, 16);
    panel_1.add(lblName);
    
    textLastName = new JTextField();
    textLastName.setBounds(111, 99, 201, 26);
    panel_1.add(textLastName);
    textLastName.setColumns(10);
    
    JLabel lblLastname = new JLabel("LastName");
    lblLastname.setBounds(24, 104, 75, 16);
    panel_1.add(lblLastname);
    
    JLabel lblEmail = new JLabel("Email");
    lblEmail.setBounds(26, 150, 75, 16);
    panel_1.add(lblEmail);
    
    textEmail = new JTextField();
    textEmail.setBounds(111, 145, 201, 26);
    panel_1.add(textEmail);
    textEmail.setColumns(10);
    
    JLabel lblType = new JLabel("Type");
    lblType.setBounds(26, 207, 75, 16);
    panel_1.add(lblType);
    
    JComboBox typeBox = new JComboBox();
    typeBox.setModel(new DefaultComboBoxModel(new String[] {"Professor", "Student", "Faculty"}));
    typeBox.setBounds(111, 207, 195, 27);
    panel_1.add(typeBox);
    
    JButton btnAddUser = new JButton("Add User");
    btnAddUser.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String name = textName.getText();
        String lastname = textLastName.getText();
        String email = textEmail.getText();
        String type = (String) typeBox.getModel().getElementAt(typeBox.getSelectedIndex()) ;
        System.out.println(type);
        Professor p = new Professor(name,lastname,email,type);
        
        Gson g = new Gson();
        String json = g.toJson(p);
        System.out.println(json);
        Request r = new Request();
        r.SendRequest("http://0.0.0.0:80/add_user", "POST", json);
       
       
          
        
      }
    });
    btnAddUser.setBounds(131, 339, 117, 29);
    panel_1.add(btnAddUser);
  }
}

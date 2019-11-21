package myevaluator.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.google.gson.Gson;

import myevaluator.libs.MyRadioButtonCourses;
import myevaluator.libs.MyRadioButtonGroups;
import myevaluator.libs.Request;
import myevaluator.models.User;
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
    frame.setBounds(200, 100, 900, 900);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
    
    JPanel panel = new JPanel();
    panel.setForeground(Color.BLACK);
    panel.setBackground(Color.BLACK);
    frame.getContentPane().add(panel);
    panel.setLayout(null);
    
    MyRadioButtonCourses rdbtnNewRadioButton = new MyRadioButtonCourses("CS101");
    rdbtnNewRadioButton.setForeground(Color.BLACK);
    rdbtnNewRadioButton.setBounds(29, 76, 83, 23);
    panel.add(rdbtnNewRadioButton);
    
    MyRadioButtonCourses radioButton = new MyRadioButtonCourses("CS102");
    radioButton.setForeground(Color.BLACK);
    radioButton.setBounds(29, 113, 83, 23);
    panel.add(radioButton);
    
    MyRadioButtonCourses radioButton_1 = new MyRadioButtonCourses("CS261");
    radioButton_1.setForeground(Color.BLACK);
    radioButton_1.setBounds(29, 147, 83, 23);
    panel.add(radioButton_1);
    
    MyRadioButtonCourses radioButton_2 = new MyRadioButtonCourses("MATH141");
    radioButton_2.setForeground(Color.BLACK);
    radioButton_2.setBounds(29, 178, 83, 23);
    panel.add(radioButton_2);
    
    MyRadioButtonCourses radioButton_3 = new MyRadioButtonCourses("ECO171");
    radioButton_3.setForeground(Color.BLACK);
    radioButton_3.setBounds(29, 209, 83, 23);
    panel.add(radioButton_3);
    
    MyRadioButtonCourses radioButton_4 = new MyRadioButtonCourses("ENG111");
    radioButton_4.setForeground(Color.BLACK);
    radioButton_4.setBounds(29, 242, 83, 23);
    panel.add(radioButton_4);
    
    MyRadioButtonCourses radioButton_5 = new MyRadioButtonCourses("ECE251");
    radioButton_5.setForeground(Color.BLACK);
    radioButton_5.setBounds(29, 277, 83, 23);
    panel.add(radioButton_5);
    
    MyRadioButtonCourses radioButton_6 = new MyRadioButtonCourses("COM205");
    radioButton_6.setForeground(Color.BLACK);
    radioButton_6.setBounds(29, 312, 83, 23);
    panel.add(radioButton_6);
    
    MyRadioButtonCourses radioButton_7 = new MyRadioButtonCourses("MATH241");
    radioButton_7.setForeground(Color.BLACK);
    radioButton_7.setBounds(29, 349, 83, 23);
    panel.add(radioButton_7);
    
    MyRadioButtonCourses radioButton_8 = new MyRadioButtonCourses("MATH341");
    radioButton_8.setForeground(Color.BLACK);
    radioButton_8.setBounds(29, 45, 83, 23);
    panel.add(radioButton_8);
    
    MyRadioButtonCourses radioButton_9 = new MyRadioButtonCourses("PHYS152");
    radioButton_9.setForeground(Color.BLACK);
    radioButton_9.setBounds(132, 45, 83, 23);
    panel.add(radioButton_9);
    
    MyRadioButtonCourses radioButton_10 = new MyRadioButtonCourses("CS261");
    radioButton_10.setForeground(Color.BLACK);
    radioButton_10.setBounds(240, 45, 83, 23);
    panel.add(radioButton_10);
    
    MyRadioButtonCourses radioButton_11 = new MyRadioButtonCourses("ENG121");
    radioButton_11.setForeground(Color.BLACK);
    radioButton_11.setBounds(132, 76, 83, 23);
    panel.add(radioButton_11);
    
    MyRadioButtonCourses radioButton_12 = new MyRadioButtonCourses("ISS196");
    radioButton_12.setForeground(Color.BLACK);
    radioButton_12.setBounds(240, 76, 83, 23);
    panel.add(radioButton_12);
    
    MyRadioButtonCourses radioButton_13 = new MyRadioButtonCourses("ISS197");
    radioButton_13.setForeground(Color.BLACK);
    radioButton_13.setBounds(132, 113, 83, 23);
    panel.add(radioButton_13);
    
    
    MyRadioButtonCourses radioButton_14 = new MyRadioButtonCourses("MATH243");
    radioButton_14.setForeground(Color.BLACK);
    radioButton_14.setBounds(240, 113, 83, 23);
    panel.add(radioButton_14);
    
    MyRadioButtonCourses radioButton_15 = new MyRadioButtonCourses("MATH244");
    radioButton_15.setForeground(Color.BLACK);
    radioButton_15.setBounds(132, 147, 83, 23);
    panel.add(radioButton_15);
    
    MyRadioButtonCourses radioButton_16 = new MyRadioButtonCourses("PSY101");
    radioButton_16.setForeground(Color.BLACK);
    radioButton_16.setBounds(132, 178, 83, 23);
    panel.add(radioButton_16);
    
    MyRadioButtonCourses radioButton_17 = new MyRadioButtonCourses(" CS341");
    radioButton_17.setForeground(Color.BLACK);
    radioButton_17.setBounds(132, 209, 83, 23);
    panel.add(radioButton_17);
    
    MyRadioButtonCourses radioButton_18 = new MyRadioButtonCourses("CS303");
    radioButton_18.setForeground(Color.BLACK);
    radioButton_18.setBounds(132, 242, 83, 23);
    panel.add(radioButton_18);
    
    MyRadioButtonCourses radioButton_19 = new MyRadioButtonCourses("MATH441");
    radioButton_19.setForeground(Color.BLACK);
    radioButton_19.setBounds(132, 277, 83, 23);
    panel.add(radioButton_19);
    
    MyRadioButtonCourses radioButton_20 = new MyRadioButtonCourses("ECE371");
    radioButton_20.setForeground(Color.BLACK);
    radioButton_20.setBounds(132, 312, 83, 23);
    panel.add(radioButton_20);
    
    MyRadioButtonCourses radioButton_21 = new MyRadioButtonCourses("CS303");
    radioButton_21.setForeground(Color.BLACK);
    radioButton_21.setBounds(132, 349, 83, 23);
    panel.add(radioButton_21);
    
    MyRadioButtonCourses radioButton_22 = new MyRadioButtonCourses("CS321");
    radioButton_22.setForeground(Color.BLACK);
    radioButton_22.setBounds(240, 147, 83, 23);
    panel.add(radioButton_22);
    
    MyRadioButtonCourses radioButton_23 = new MyRadioButtonCourses("GOV101");
    radioButton_23.setForeground(Color.BLACK);
    radioButton_23.setBounds(240, 178, 83, 23);
    panel.add(radioButton_23);
    
    MyRadioButtonCourses radioButton_24 = new MyRadioButtonCourses("ME310");
    radioButton_24.setForeground(Color.BLACK);
    radioButton_24.setBounds(240, 209, 83, 23);
    panel.add(radioButton_24);
    
    MyRadioButtonCourses radioButton_25 = new MyRadioButtonCourses("ME350");
    radioButton_25.setForeground(Color.BLACK);
    radioButton_25.setBounds(240, 242, 83, 23);
    panel.add(radioButton_25);
    
    MyRadioButtonCourses radioButton_26 = new MyRadioButtonCourses("CHEM262");
    radioButton_26.setForeground(Color.BLACK);
    radioButton_26.setBounds(240, 277, 83, 23);
    panel.add(radioButton_26);
    
    MyRadioButtonCourses radioButton_27 = new MyRadioButtonCourses("MATH348");
    radioButton_27.setForeground(Color.BLACK);
    radioButton_27.setBounds(240, 312, 83, 23);
    panel.add(radioButton_27);
    
    MyRadioButtonCourses radioButton_28 = new MyRadioButtonCourses("CS420");
    radioButton_28.setForeground(Color.BLACK);
    radioButton_28.setBounds(240, 349, 83, 23);
    panel.add(radioButton_28);
    
    Box horizontalBox = Box.createHorizontalBox();
    horizontalBox.setForeground(Color.WHITE);
    horizontalBox.setBackground(Color.WHITE);
    horizontalBox.setBounds(71, 430, 117, -28);
    panel.add(horizontalBox);
    
    JLabel lblNewLabel = new JLabel("Courses");
    lblNewLabel.setForeground(Color.WHITE);
    lblNewLabel.setBounds(18, 11, 61, 16);
    panel.add(lblNewLabel);
    
    JLabel lblGroups = new JLabel("Groups");
    lblGroups.setForeground(Color.WHITE);
    lblGroups.setBounds(18, 386, 61, 16);
    panel.add(lblGroups);
    
    MyRadioButtonGroups rdbtnF = new MyRadioButtonGroups("F1");
    rdbtnF.setForeground(Color.BLACK);
    rdbtnF.setBounds(29, 419, 61, 23);
    panel.add(rdbtnF);
    
    MyRadioButtonGroups rdbtnF_1 = new MyRadioButtonGroups("F2");
    rdbtnF_1.setForeground(Color.BLACK);
    rdbtnF_1.setBounds(108, 419, 61, 23);
    panel.add(rdbtnF_1);
    
    MyRadioButtonGroups rdbtnF_2 = new MyRadioButtonGroups("F3");
    rdbtnF_2.setForeground(Color.BLACK);
    rdbtnF_2.setBounds(187, 419, 61, 23);
    panel.add(rdbtnF_2);
    
    MyRadioButtonGroups rdbtnF_3 = new MyRadioButtonGroups("F4");
    rdbtnF_3.setForeground(Color.BLACK);
    rdbtnF_3.setBounds(265, 419, 47, 23);
    panel.add(rdbtnF_3);
    
    MyRadioButtonGroups rdbtnS = new MyRadioButtonGroups("S1");
    rdbtnS.setForeground(Color.BLACK);
    rdbtnS.setBounds(29, 460, 61, 23);
    panel.add(rdbtnS);
    
    MyRadioButtonGroups rdbtnS_1 = new MyRadioButtonGroups("S2");
    rdbtnS_1.setForeground(Color.BLACK);
    rdbtnS_1.setBounds(108, 460, 61, 23);
    panel.add(rdbtnS_1);    
    MyRadioButtonGroups rdbtnS_2 = new MyRadioButtonGroups("S3");
    rdbtnS_2.setForeground(Color.BLACK);
    rdbtnS_2.setBounds(187, 460, 61, 23);
    panel.add(rdbtnS_2);
    
    MyRadioButtonGroups rdbtnSe = new MyRadioButtonGroups("SE-J");
    rdbtnSe.setForeground(Color.BLACK);
    rdbtnSe.setBounds(29, 500, 61, 23);
    panel.add(rdbtnSe);
    
    MyRadioButtonGroups rdbtnCsj = new MyRadioButtonGroups("CS-J");
    rdbtnCsj.setForeground(Color.BLACK);
    rdbtnCsj.setBounds(108, 500, 61, 23);
    panel.add(rdbtnCsj);
    
    MyRadioButtonGroups rdbtnRej = new MyRadioButtonGroups("RE-J");
    rdbtnRej.setForeground(Color.BLACK);
    rdbtnRej.setBounds(187, 500, 61, 23);
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
  
        ArrayList<String> temp = new ArrayList<String>();
        ArrayList<String> temp1 = new ArrayList<String>();
        for (JRadioButton i:MyRadioButtonCourses.getCourses()) {
           if(i.isSelected()!=false) {
           String courses=i.getText();
           temp.add(courses);
           }
           }
        for (JRadioButton j:MyRadioButtonGroups.getGroups()) {
          if(j.isSelected()!=false) {
          String groups=j.getText();
          temp1.add(groups);
          }
          }
        Gson g1 = new Gson();
        String json1 = g1.toJson(new User(name,lastname,email,type,temp,temp1));
        System.out.println(json1);
       Request r1 = new Request();
        r1.SendRequest("http://0.0.0.0:80/add_user", "POST", json1);
      }
    });
    btnAddUser.setBounds(131, 339, 117, 29);
    panel_1.add(btnAddUser);
  }
}

package myevaluator.libs;

import java.util.ArrayList;

import javax.swing.JRadioButton;


public class MyRadioButtonCourses extends JRadioButton{
  
  private static ArrayList<JRadioButton> courses = new ArrayList<JRadioButton>();

  
  public MyRadioButtonCourses(String name) {
   super(name);
   courses.add(this);
   
  }
  


}

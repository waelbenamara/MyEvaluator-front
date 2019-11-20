package myevaluator.libs;

import java.util.ArrayList;

import javax.swing.JRadioButton;


public class MyRadioButtonCourses extends JRadioButton{
  
  private static ArrayList<JRadioButton> courses = new ArrayList<JRadioButton>();

  
  public static ArrayList<JRadioButton> getCourses() {
    return courses;
  }


  public static void setCourses(ArrayList<JRadioButton> courses) {
    MyRadioButtonCourses.courses = courses;
  }


  public MyRadioButtonCourses(String name) {
   super(name);
   courses.add(this);

   
  }
  


}

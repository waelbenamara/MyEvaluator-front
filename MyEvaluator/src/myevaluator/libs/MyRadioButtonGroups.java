package myevaluator.libs;

import java.util.ArrayList;

import javax.swing.JRadioButton;

public class MyRadioButtonGroups  extends JRadioButton{
    
    
    private static ArrayList<JRadioButton> groups = new ArrayList<JRadioButton>();
    
    public MyRadioButtonGroups(String name) {
     super(name);
     groups.add(this);
     
    }

    public static ArrayList<JRadioButton> getGroups() {
      return groups;
    }

    public static void setGroups(ArrayList<JRadioButton> groups) {
      MyRadioButtonGroups.groups = groups;
    }
    


}

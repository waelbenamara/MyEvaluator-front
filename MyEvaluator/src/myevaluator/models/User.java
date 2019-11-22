package myevaluator.models;

import java.util.ArrayList;



public class User {
  private String Name;
  private String LastName;
  private String Email;
  private String type;
  private String password;
  public User(String name, String lastName, String email, String type, String password, ArrayList<String> coursesSelected,
		ArrayList<String> groupsSelected) {
	super();
	Name = name;
	LastName = lastName;
	Email = email;
	this.type = type;
	this.password = password;
	this.coursesSelected = coursesSelected;
	this.groupsSelected = groupsSelected;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User(String name, String lastName, String email, String type,
      ArrayList<String> coursesSelected, ArrayList<String> groupsSelected) {
    super();
    Name = name;
    LastName = lastName;
    Email = email;
    this.type = type;
    this.coursesSelected = coursesSelected;
    this.groupsSelected = groupsSelected;
  }
  private  ArrayList<String> coursesSelected = new ArrayList<String>();
  private  ArrayList<String> groupsSelected = new ArrayList<String>();
  public ArrayList<String> getCoursesSelected() {
    return coursesSelected;
  }
  public void setCoursesSelected(ArrayList<String> coursesSelected) {
    this.coursesSelected = coursesSelected;
  }
  public ArrayList<String> getGroupsSelected() {
    return groupsSelected;
  }
  public void setGroupsSelected(ArrayList<String> groupsSelected) {
    this.groupsSelected = groupsSelected;
  }
  public String getName() {
    return Name;
  }
  public void setName(String name) {
    Name = name;
  }
  public String getEmail() {
    return Email;
  }
  public void setEmail(String email) {
    Email = email;
  }
  public String getLastName() {
    return LastName;
  }
  public void setLastName(String lastName) {
    LastName = lastName;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
}

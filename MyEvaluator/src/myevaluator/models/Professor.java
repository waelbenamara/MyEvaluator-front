package myevaluator.models;

public class Professor {

  private String name;
  private String lastname;
  private String email;
  private String type;
  
  public Professor(String name, String lastname, String email, String type) {
    super();
    this.name = name;
    this.lastname = lastname;
    this.email = email;
    this.type = type;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  
}

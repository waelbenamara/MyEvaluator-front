package myevaluator.libs;

public class LoginResponse {
  
  private String response;
  
  private String type;
  
  private int id ; 

  public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getResponse() {
    return response;
  }

  public void setResponse(String status) {
    this.response = status;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  

}

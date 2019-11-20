package myevaluator.libs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Request {
public StringBuilder  SendRequest(String url,String method,String json) {
  try {
    URL url1 = new URL (url);
    HttpURLConnection con = (HttpURLConnection)url1.openConnection();
    con.setRequestMethod(method);
    con.setRequestProperty("Content-Type", "application/json; utf-8");
    con.setRequestProperty("Accept", "application/json");
    con.setDoOutput(true);
    String jsonInputString = json;
    try(OutputStream os = con.getOutputStream()) {
      byte[] input = jsonInputString.getBytes("utf-8");
      os.write(input, 0, input.length);           
  }
   
    try(BufferedReader br = new BufferedReader(
        new InputStreamReader(con.getInputStream(), "utf-8"))) {
      StringBuilder response = new StringBuilder();
          String responseLine = null;
          while ((responseLine = br.readLine()) != null) {
              response.append(responseLine.trim());
          }
          return response;
      }
}catch(Exception e1) {
      System.out.println(e1);
    }
  return null;

 
}
}


package myevaluator.libs;

public class FullReviewAnswers {
  private String well;
  private String wrong;
  private String improved;
  public String getWell() {
    return well;
  }
  public FullReviewAnswers(String well, String wrong, String improved) {
    super();
    this.well = well;
    this.wrong = wrong;
    this.improved = improved;
  }
  public void setWell(String well) {
    this.well = well;
  }
  public String getWrong() {
    return wrong;
  }
  public void setWrong(String wrong) {
    this.wrong = wrong;
  }
  public String getImproved() {
    return improved;
  }
  public void setImproved(String improved) {
    this.improved = improved;
  }
}

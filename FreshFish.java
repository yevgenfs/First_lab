package main.java.ua.lviv.IoT.fish;

public class FreshFish extends FishProducts {

  private int experiationDate;
  private InWhichStatus inWhichStatus;

  public FreshFish() {}

  public void cut() {
    if (inWhichStatus == InWhichStatus.CUTED) {
      System.out.println("It was Cuted before"); 
    } else {
      inWhichStatus = InWhichStatus.CUTED;
    }
 
  }

  public int getExperiationDate() {
    return experiationDate;
  }

  public void setExperiationDate(int experiationDate) {
    this.experiationDate = experiationDate;
  }

  public InWhichStatus getInWhichStatus() {
    return inWhichStatus;
  }

  public void setInWhichStatus(InWhichStatus inWhichStatus) {
    this.inWhichStatus = inWhichStatus;
  }


}

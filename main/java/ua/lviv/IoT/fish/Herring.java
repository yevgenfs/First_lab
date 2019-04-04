package ua.lviv.IoT.fish;

public class Herring extends FishProducts {
  private int experiationDate;
  private int quantiti;
 

  public Herring() {} 

  public String getHeaders() {
    return super.getHeaders() + "," + "experiationDate" + "quantiti";
  }
  
  public String toCSv() {
    return super.toCSv() + "," + experiationDate + quantiti;
  }


  public int getExperiationDate() {
    return experiationDate;
  }

  public void setExperiationDate(int experiationDate) {
    this.experiationDate = experiationDate;
  }

  public int getQuantiti() {
    return quantiti;
  }

  public void setQuantiti(int quantiti) {
    this.quantiti = quantiti;
  }
 
}

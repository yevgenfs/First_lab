package ua.lviv.IoT.fish;

public class ColdFish extends FishProducts {
  private int temperature;
  
  public ColdFish() {}

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }
  
  public String getHeaders() {
    return super.getHeaders() + "," + "temperature";
  }
  
  public String toCSv() {
    return super.toCSv() + "," + temperature;
  }

}

package ua.lviv.IoT.fish;

public class ColdFish extends FishProducts {
	 private int temperature;

	public ColdFish(KindOfFish kindOfFish, int price, Import imports, boolean keepingStorageConditon,
			String fromWhichCountry, QualityOfFish qualityOfFish, String nameOfwfsh, double weight, int temperature) {
		super(kindOfFish, price, imports, keepingStorageConditon, fromWhichCountry, qualityOfFish, nameOfwfsh, weight);
		this.temperature = temperature;
	}

	
	
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	 

}

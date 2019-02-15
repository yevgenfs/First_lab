package ua.lviv.IoT.fish;

public class Herring extends FishProducts {
 private int experiationDate ;
 private int quantiti  ;
 



 
public Herring(KindOfFish kindOfFish, int price, Import imports, boolean keepingStorageConditon,
		String fromWhichCountry, QualityOfFish qualityOfFish, String nameOfwfsh, double weight, int experiationDate,
		int quantiti) {
	super(kindOfFish, price, imports, keepingStorageConditon, fromWhichCountry, qualityOfFish, nameOfwfsh, weight);
	this.experiationDate = experiationDate;
	this.quantiti = quantiti;
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

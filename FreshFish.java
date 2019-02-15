package ua.lviv.IoT.fish;

public class FreshFish extends FishProducts {
	
	private int experiationDate ;
	private InWhichStatus inWhichStatus;

	public FreshFish(KindOfFish kindOfFish, int price, Import imports, boolean keepingStorageConditon,
			String fromWhichCountry, QualityOfFish qualityOfFish, String nameOfwfsh, double weight, int experiationDate,
			InWhichStatus inWhichStatus) {
		super(kindOfFish, price, imports, keepingStorageConditon, fromWhichCountry, qualityOfFish, nameOfwfsh, weight);
		this.experiationDate = experiationDate;
		this.inWhichStatus = inWhichStatus;
	}
	
	
	
	public void cut ()
	{
		 if(this.inWhichStatus ==  InWhichStatus.CUTED)
		 {
		  System.out.println ("It was Cuted before");
		 }
		 
	   this.inWhichStatus =  InWhichStatus.CUTED;
 
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

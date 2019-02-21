package manager;

import java.util.List;
import ua.lviv.IoT.fish.FishProducts;
import ua.lviv.IoT.fish.KindOfFish;


public interface IFishSearchAndSort {

	public List<FishProducts> priceAndKindOfSort( List<FishProducts> fishList, int hight,int low,KindOfFish kindOfFish);
	
	public List<FishProducts> nameIncrese ( List<FishProducts> fish);
	
	public  List<FishProducts> nameDecrese (List<FishProducts> fish);
	
	public List<FishProducts> weightDecrese( List<FishProducts> fish);
	
	public  List<FishProducts> weightIncrese(List<FishProducts> fish);
	
}

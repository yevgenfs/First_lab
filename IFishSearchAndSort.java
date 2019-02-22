package manager;

import java.util.List;

import ua.lviv.IoT.fish.FishProducts;
import ua.lviv.IoT.fish.KindOfFish;


public interface IFishSearchAndSort {

  List<FishProducts> priceAndKindOfSort(List<FishProducts> fishList, int hight,int low,
        KindOfFish kindOfFish);

  

  List<FishProducts> nameSort(List<FishProducts> fish,boolean incrise);

  List<FishProducts> weightSort(List<FishProducts> fish,boolean incrise);
  
  

}

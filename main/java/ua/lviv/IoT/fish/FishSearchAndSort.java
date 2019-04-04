package ua.lviv.IoT.fish;

import java.util.Collections;
import java.util.List;

import ua.lviv.IoT.managers.IFishSearchAndSort;

public   class FishSearchAndSort extends FishProductsWriter implements IFishSearchAndSort  {

 
  public List<FishProducts> priceAndKindOfSort(List<FishProducts> fishList, int hight,int low,
      KindOfFish kindOfFish) {
    for (int i = 0;i < fishList.size();i++) {
      if  (! (fishList.get(i).getPrice() < hight && fishList.get(i).getPrice() > low
          && fishList.get(i).getKindOfFish() == kindOfFish)) {
        fishList.remove(i);
      }
    }
    return fishList;
  }
  
  public List<FishProducts> nameSort(List<FishProducts> fish,boolean incrise) {
    fish.sort((o1, o2) -> o1.getNameOfFish().compareTo(o2.getNameOfFish()));
    if (incrise == true) {
      Collections.reverse(fish);
      fish.forEach(s -> System.out.println(s));
      return fish;
    } else {
      fish.forEach(s -> System.out.println(s));
      System.out.println("s");
      return fish;
    }
  }
  
  

  public List<FishProducts> weightSort(List<FishProducts> fish,boolean incrise) {
    fish.sort((FishProducts o1, FishProducts o2) -> (int)o1.getWeight() - (int)o2.getWeight());
    if (incrise == true) {
      Collections.reverse(fish);
      fish.forEach(s -> System.out.println(s));
      return fish;
    } else {
      fish.forEach(s -> System.out.println(s));
      System.out.println("s");
      return fish;
    }
    
    
  }


}




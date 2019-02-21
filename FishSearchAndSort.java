package main.java.ua.lviv.IoT.fish;

import java.util.List;
import main.java.manager.IFishSearchAndSort;

public   class FishSearchAndSort implements IFishSearchAndSort  {

 
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
  
  public List<FishProducts> nameDecrese(List<FishProducts> fish) {
    fish.sort((FishProducts o1, FishProducts o2) -> o1.getNameOfFish()
         .compareTo(o2.getNameOfFish()));
    fish.sort((o1, o2) -> o1.getNameOfFish().compareTo(o2.getNameOfFish()));
    fish.forEach(s -> System.out.println(s));
    System.out.println("s");
    return fish;
  }
  
  public  List<FishProducts> nameIncrese(List<FishProducts> fish) {
    fish.sort((FishProducts o1, FishProducts o2) -> o2.getNameOfFish()
        .compareTo(o1.getNameOfFish()));
    fish.sort((o1, o2) -> o2.getNameOfFish().compareTo(o1.getNameOfFish()));
    fish.forEach(s -> System.out.println(s));
    System.out.println("s");
    return fish;
  }

  public List<FishProducts> weightDecrese(List<FishProducts> fish) {
    fish.sort((FishProducts o1, FishProducts o2) -> (int)o1.getWeight() - (int)o2.getWeight());
    fish.forEach(s -> System.out.println(s));
    System.out.println("s");
    return fish;
  }

  public  List<FishProducts> weightIncrese(List<FishProducts> fish) {
    fish.sort((FishProducts o1, FishProducts o2) -> (int)o2.getWeight() - (int)o1.getWeight());
    for (int i = 0;i < fish.size();i++) {
      System.out.println(fish.get(i));
    }
    System.out.println("s");
    return fish;
  }
}




package main.java.ua.lviv.IoT.fish;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    FishProducts fish1 = new  FishProducts(KindOfFish.FRESHFISH,15,Import.IMPORT,true,"England",
        QualityOfFish.WELLQUALITY,"a",54);
    FishProducts fish2 = new  FishProducts(KindOfFish.FRESHFISH,20,Import.IMPORT,true,"England",
        QualityOfFish.WORSTQUALITY,"b",48);
    FishProducts fish3 = new  FishProducts(KindOfFish.FRESHFISH,30,Import.IMPORT,true,"England",
         QualityOfFish.MIDLEQUALITY,"c",50);
    FishProducts fish4 = new  FishProducts(KindOfFish.COLDFISH,20,Import.IMPORT,true,"England",
         QualityOfFish.WELLQUALITY,"ras",50);
    FishProducts fish5 = new  FishProducts(KindOfFish.COLDFISH,20,Import.IMPORT,true,"England",
         QualityOfFish.WELLQUALITY,"ras",50);
    List<FishProducts> fishList =  new ArrayList<FishProducts>();
    fishList.add(fish1);
    fishList.add(fish2);
    fishList.add(fish3);
    fishList.add(fish4);
    fishList.add(fish5);

    for (int i = 0;i < fishList.size();i++) {

      fishList.get(i).priceAndKindOfSort(fishList,21,10,KindOfFish.FRESHFISH);
      System.out.println(fishList.get(i).toString());
    }

    System.out.println("S");
    fishList.get(0).weightIncrese(fishList);
    fishList.get(0).weightDecrese(fishList);
    fishList.get(0).nameDecrese(fishList);
    fishList.get(0).nameIncrese(fishList);
  }
}

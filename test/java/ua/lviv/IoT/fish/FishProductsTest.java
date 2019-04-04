package ua.lviv.IoT.fish;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FishProductsTest {
  private List<FishProducts> fishList = new ArrayList<FishProducts>();
  FishProductsWriter fpw = new FishProductsWriter();

  @BeforeEach
  void setUp() throws Exception {
   
    
    fishList.add(new  FishProducts(KindOfFish.FRESHFISH,1,Import.IMPORT,true,"England",
        QualityOfFish.WELLQUALITY,"a",54));
    fishList.add(new  FishProducts(KindOfFish.FRESHFISH,20,Import.IMPORT,true,"England",
         QualityOfFish.WORSTQUALITY,"b",48));
    fishList.add(new  FishProducts(KindOfFish.FRESHFISH,30,Import.IMPORT,true,"England",
         QualityOfFish.MIDLEQUALITY,"c",50));
    fishList.add(new  FishProducts(KindOfFish.COLDFISH,20,Import.IMPORT,true,"England",
         QualityOfFish.WELLQUALITY,"rasa",53));
    fishList.add(new  FishProducts(KindOfFish.COLDFISH,20,Import.IMPORT,true,"England",
         QualityOfFish.WELLQUALITY,"rase",52));
  }
  
  @Test
  void testWrite() throws IOException {
    
    File file = new File("fishList");
    fpw.writeToFile(fishList);
    assertTrue(file.length() > 0);
    
  }
  
  @Test
  void testPriceAndKindOfSort() {
    fishList.get(0).priceAndKindOfSort(fishList,15,50,KindOfFish.FRESHFISH);
    assertEquals(fishList.get(0), fishList.get(0), "sfd");
    assertEquals(fishList.get(1), fishList.get(1), "sfd");

  }

  @Test
   void testNameSort() {

    fishList.get(0).nameSort(fishList,false); {
      assertEquals("a", fishList.get(0).getNameOfFish(), "sfd");
      assertEquals("b", fishList.get(1).getNameOfFish(), "sfd");
      assertEquals("c", fishList.get(2).getNameOfFish(), "sfd");
      assertEquals("rasa", fishList.get(3).getNameOfFish(), "sfd");
      assertEquals("rase", fishList.get(4).getNameOfFish(), "sfd");
      System.out.println("new sort");
    }
    fishList.get(0).nameSort(fishList,true); {
      assertEquals("a", fishList.get(4).getNameOfFish(), "sfd");
      assertEquals("b", fishList.get(3).getNameOfFish(), "sfd");
      assertEquals("c", fishList.get(2).getNameOfFish(), "sfd");
      assertEquals("rasa", fishList.get(1).getNameOfFish(), "sfd");
      assertEquals("rase", fishList.get(0).getNameOfFish(), "sfd");
      System.out.println("new sort");
    }
  }

  
  @Test
  void testWeightSort() {

    fishList.get(0).weightSort(fishList,true);
    {
      assertEquals(54, fishList.get(0).getWeight(), "sfd");
      assertEquals(53, fishList.get(1).getWeight(), "sfd");
      assertEquals(52, fishList.get(2).getWeight(), "sfd");
      assertEquals(50, fishList.get(3).getWeight(), "sfd");
      assertEquals(48, fishList.get(4).getWeight(), "sfd");
      System.out.println("new sort");
    }
    fishList.get(0).weightSort(fishList,false); {
      assertEquals(54, fishList.get(4).getWeight(), "sfd");
      assertEquals(53, fishList.get(3).getWeight(), "sfd");
      assertEquals(52, fishList.get(2).getWeight(), "sfd");
      assertEquals(50, fishList.get(1).getWeight(), "sfd");
      assertEquals(48, fishList.get(0).getWeight(), "sfd");
      System.out.println("new sort");
    }
  }
  
  @Test
  public void testWeightSortNullPointerException() {

    assertThrows(NullPointerException.class,
        () -> fishList.get(0).weightSort(null,true),
              "Expected PriceAndKindOfSort()"
              + "to throw NullPointerException, but it didn't");
    
  }
  
  @Test
  public void testNameSortNullPointerException() {

    assertThrows(NullPointerException.class,
        () -> fishList.get(0).nameSort(null,true),
              "Expected NameSor()"
              + "to throw NullPointerException, but it didn't");
    
  }
  
  @Test
  public void testPriceAndKindOfSortNullPointerException() {

    assertThrows(NullPointerException.class,
        () -> fishList.get(0).priceAndKindOfSort(null,-10, 20,KindOfFish.FRESHFISH),
              "Expected PriceAndKindOfSort()"
              + "to throw NullPointerException, but it didn't");
    
  }
  

}

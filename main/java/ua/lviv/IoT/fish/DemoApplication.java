package ua.lviv.IoT.fish;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    
  }
  
  @Bean
  public CommandLineRunner demo(FishProductsRepository repository) {
    return (args) -> {
      repository.save(new  FishProducts(KindOfFish.FRESHFISH,15,Import.IMPORT,true,"England",
                 QualityOfFish.WELLQUALITY,"a",54));
      repository.save(new  FishProducts(KindOfFish.FRESHFISH,20,Import.IMPORT,true,"England",
                  QualityOfFish.WORSTQUALITY,"b",48));
      repository.save(new  FishProducts(KindOfFish.FRESHFISH,30,Import.IMPORT,true,"England",
                   QualityOfFish.MIDLEQUALITY,"c",50));

      repository.findAll().forEach(fishProducts -> System.out.println(fishProducts));
    };
  }
}

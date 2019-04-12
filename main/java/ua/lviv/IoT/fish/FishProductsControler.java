package ua.lviv.IoT.fish;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/FishProducts")
public class FishProductsControler {
  @Autowired
  FishProductsRepository fishProductsRepository;
 
  @GetMapping("/FishProducts")
  public List getAllTickets() {
    return  (List) fishProductsRepository.findAll();
  }

  @GetMapping("/FishProducts/{id}")
  public FishProducts getTicket(@PathVariable Integer id) {
    return fishProductsRepository.findById(id).get();
  }

  
  @PostMapping("/FishProducts")
    public FishProducts createFishProducts(@RequestBody FishProducts fishProducts) {
    FishProducts savedFishProducts = fishProductsRepository.save(fishProducts);
    return savedFishProducts;
  }
  
  @PutMapping("/FishProducts/{id}")
   public  FishProducts updateFishProducts(
      @RequestBody FishProducts changedFishProducts, @PathVariable Integer id) {
    fishProductsRepository.save(changedFishProducts);
    return changedFishProducts;
  }
  
  @DeleteMapping("/FishProducts/{id}")
  public String deleteTicket(@PathVariable Integer id) {
    fishProductsRepository.deleteById(id);
    return String.format("FishProducts id #%d successfully deleted", id);
  }
  
}



package ua.lviv.IoT.fish;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FishProductsRepository 
        extends CrudRepository<FishProducts, Integer> {
	FishProducts findByid(Integer id);

}

package my.spike.repository;

import my.spike.repository.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findByApprovedDateGreaterThanEqual(Date date);
}



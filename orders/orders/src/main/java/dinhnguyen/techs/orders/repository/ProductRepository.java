package dinhnguyen.techs.orders.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dinhnguyen.techs.orders.entitys.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}

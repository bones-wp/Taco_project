package spring.taco.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.taco.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}

package spring.taco.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.taco.TacoOrder;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {
}

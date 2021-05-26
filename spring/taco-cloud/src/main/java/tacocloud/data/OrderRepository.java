package tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import tacocloud.bean.Order;

public interface OrderRepository extends CrudRepository<Order,Long> {

}

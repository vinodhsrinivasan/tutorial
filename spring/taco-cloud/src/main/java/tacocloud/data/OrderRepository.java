package tacocloud.data;

import tacocloud.bean.Order;

public interface OrderRepository {
    Order save(Order order);
}

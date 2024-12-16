package pro.sky.springstore.service;

import java.util.Collection;
import java.util.List;

public interface OrderService {
    Collection<Integer> getOrder();

    boolean addItems(List<Integer> items);
}

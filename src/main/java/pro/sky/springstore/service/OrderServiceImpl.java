package pro.sky.springstore.service;

import org.springframework.stereotype.Service;
import pro.sky.springstore.model.Basket;

import java.util.Collection;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    final private Basket backet;

    public OrderServiceImpl(Basket backet) {
        this.backet = backet;
    }

    @Override
    public Collection<Integer> getOrder() {
        return backet.getOrder();
    }

    @Override
    public boolean addItems(List<Integer> items) {
        return this.backet.addAll(items);
    }
}

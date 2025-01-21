package pro.sky.springstore.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.springstore.model.Basket;

import java.util.Collection;
import java.util.List;

@Service
@SessionScope
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

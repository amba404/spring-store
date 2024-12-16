package pro.sky.springstore.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@SessionScope
public class OrderServiceImpl implements OrderService {
    final private List<Integer> items = new ArrayList<>();

    @Override
    public Collection<Integer> getOrder() {
        return List.copyOf(items);
    }

    @Override
    public boolean addItems(List<Integer> items) {
        return this.items.addAll(items);
    }
}

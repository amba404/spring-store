package pro.sky.springstore.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Basket {
    private List<Integer> order = new ArrayList<>();

    public List<Integer> getOrder() {
        return List.copyOf(order);
    }

    public void setOrder(List<Integer> order) {
        this.order = order;
    }

    public boolean addAll(List<Integer> order) {
        return this.order.addAll(order);
    }
}

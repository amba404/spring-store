package pro.sky.springstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.springstore.service.OrderService;
import pro.sky.springstore.service.OrderServiceImpl;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    final private OrderService orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public boolean add(@RequestParam(name = "items") List<Integer> items) {
        return orderService.addItems(items);
    }

    @GetMapping("/get")
    public Collection<Integer> get() {
        return orderService.getOrder();
    }
}

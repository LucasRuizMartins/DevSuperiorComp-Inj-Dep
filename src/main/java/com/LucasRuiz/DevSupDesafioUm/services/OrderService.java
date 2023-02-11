package com.LucasRuiz.DevSupDesafioUm.services;

import com.LucasRuiz.DevSupDesafioUm.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order){



        return order.getBasic()
               - order.getBasic() * order.getDiscont()/100
               + shippingService.shipment(order);
    }
}

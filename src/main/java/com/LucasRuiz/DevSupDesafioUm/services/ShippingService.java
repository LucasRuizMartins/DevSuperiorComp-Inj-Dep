package com.LucasRuiz.DevSupDesafioUm.services;

import com.LucasRuiz.DevSupDesafioUm.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {



    public double shipment (Order order) {
        if (order.getBasic() < 100){return 20.00 ;}
        if (order.getBasic() > 100 && order.getBasic() < 200 ){return 12.00 ;}
        else return 0;
    }
}

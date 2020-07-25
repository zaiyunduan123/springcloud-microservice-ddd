package name.finn.application.service;

import name.finn.domain.order.entity.Order;
import name.finn.domain.order.service.OrderDomainService;

/**
 * @Author jiangyunxiong
 * @Date 2020/7/26 1:42 AM
 */
@Service
public class OrderApplicationService {

    @Autowired
    OrderDomainService orderDomainService;

    public Order getOrderById(String orderId){
        return orderDomainService.getOrderById(orderId);
    }
}

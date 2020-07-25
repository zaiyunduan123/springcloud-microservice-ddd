package name.finn.domain.order.service;

import name.finn.domain.order.entity.Order;
import name.finn.domain.order.event.OrderEvent;
import name.finn.domain.order.event.OrderEventType;
import name.finn.domain.order.repository.OrderRepositoryInterface;
import name.finn.infrastructure.common.event.EventPublisher;

/**
 * @Author jiangyunxiong
 * @Date 2020/7/26 2:01 AM
 */
@Service
@Slf4j
public class OrderDomainService {

    @Autowired
    EventPublisher eventPublisher;

    @Autowired
    OrderRepositoryInterface orderRepositoryInterface;

    public Order getOrderById(Long orderId) {
        return orderRepositoryInterface.getOrderById(orderId);
    }

    @Transactional
    public void createOrder(Order order) {
        OrderEvent event = OrderEvent.create(OrderEventType.CREATE_EVENT, order);
        eventPublisher.publish(event);
    }

}

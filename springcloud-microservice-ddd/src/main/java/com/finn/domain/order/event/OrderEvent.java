package name.finn.domain.order.event;

import name.finn.domain.order.entity.Order;
import name.finn.infrastructure.common.event.DomainEvent;
import name.finn.infrastructure.util.IdGenerator;

import java.util.Date;

/**
 * @Author jiangyunxiong
 * @Date 2020/7/26 2:16 AM
 */
public class OrderEvent extends DomainEvent {

    OrderEventType orderEventType;

    public static OrderEvent create(OrderEventType eventType, Order order){
        OrderEvent event = new OrderEvent();
        event.setId(IdGenerator.nextId());
        event.setOrderEventType(eventType);
        event.setTimestamp(new Date());
        event.setData(JSON.toJSONString(order));
        return event;
    }

    public OrderEventType getOrderEventType() {
        return orderEventType;
    }

    public void setOrderEventType(OrderEventType orderEventType) {
        this.orderEventType = orderEventType;
    }
}

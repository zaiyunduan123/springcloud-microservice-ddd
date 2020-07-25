package name.finn.infrastructure.common.event;

import name.finn.domain.order.event.OrderEvent;
import org.springframework.stereotype.Service;

@Service
public class EventPublisher {

    public void publish(OrderEvent event){
        //send to MQ
        //mq.send(event);
    }
}
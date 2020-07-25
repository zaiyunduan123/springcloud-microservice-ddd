package name.finn.interfaces.facade;


import name.finn.application.service.OrderApplicationService;
import name.finn.domain.order.entity.Order;
import name.finn.infrastructure.common.api.Response;
import name.finn.interfaces.assembler.OrderAssembler;

/**
 * Created by jiangyunxiong on 2018/5/28.
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderApi {


    @Autowired
    OrderApplicationService orderApplicationService;

    @RequestMapping("/detail")
    @ResponseBody
    public Response findById(@PathVariable  long orderId){
        Order order = orderApplicationService.getOrderById(orderId);;
        return Response.ok(OrderAssembler.toDTO(order));
    }

}

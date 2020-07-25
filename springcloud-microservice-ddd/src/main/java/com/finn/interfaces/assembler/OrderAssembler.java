package name.finn.interfaces.assembler;

import name.finn.domain.order.entity.Order;
import name.finn.interfaces.dto.OrderDTO;

import java.util.List;

/**
 * @Author jiangyunxiong
 * @Date 2020/7/26 1:49 AM
 */
public class OrderAssembler {

    public static OrderDTO toDTO(Order order){
        OrderDTO dto = new OrderDTO();
        return dto;
    }
}

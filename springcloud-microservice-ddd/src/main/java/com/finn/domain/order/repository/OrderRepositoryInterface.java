package name.finn.domain.order.repository;

import com.jesper.seckill.bean.OrderInfo;
import com.jesper.seckill.bean.SeckillOrder;
import name.finn.domain.order.entity.Order;
import org.apache.ibatis.annotations.*;

/**
 * Created by jiangyunxiong on 2018/5/23.
 */
@Mapper
public interface OrderRepositoryInterface {


    @Select("select * from sk_order_info where id = #{orderId}")
    public Order getOrderById(@Param("orderId") long orderId);

}

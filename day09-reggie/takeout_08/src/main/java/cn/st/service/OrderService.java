package cn.st.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.st.entity.Orders;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}

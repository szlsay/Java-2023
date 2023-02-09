package cn.st.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.st.entity.ShoppingCart;
import cn.st.mapper.ShoppingCartMapper;
import cn.st.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}

package cn.st.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.st.entity.Dish;
import cn.st.mapper.DishMapper;
import cn.st.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper,Dish> implements DishService {
}

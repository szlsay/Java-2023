package cn.st.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.st.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}

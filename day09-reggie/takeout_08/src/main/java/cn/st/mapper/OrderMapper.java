package cn.st.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.st.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}

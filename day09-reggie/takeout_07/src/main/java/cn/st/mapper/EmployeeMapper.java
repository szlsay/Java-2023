package cn.st.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.st.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}

package cn.st.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.st.entity.Employee;
import cn.st.mapper.EmployeeMapper;
import cn.st.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}

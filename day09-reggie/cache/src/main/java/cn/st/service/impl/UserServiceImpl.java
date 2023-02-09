package cn.st.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.st.entity.User;
import cn.st.mapper.UserMapper;
import cn.st.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}

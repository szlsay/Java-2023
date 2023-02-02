package cn.st.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.st.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}

package cn.st.factory;

import cn.st.dao.UserDao;
import cn.st.dao.impl.UserDaoImpl;
//实例工厂创建对象
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}

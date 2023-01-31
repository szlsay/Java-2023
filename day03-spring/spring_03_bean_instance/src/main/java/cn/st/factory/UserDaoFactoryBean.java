package cn.st.factory;

import cn.st.dao.UserDao;
import cn.st.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;
//FactoryBean创建对象
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂中创建对象的方法
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    public Class<?> getObjectType() {
        return UserDao.class;
    }

}

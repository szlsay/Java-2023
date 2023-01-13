package cn.edu.info.factory;

import cn.edu.info.dao.BaseStudentDao;
import cn.edu.info.dao.OtherStudentDao;
import cn.edu.info.dao.StudentDao;

public class StudentDaoFactory {
    public static BaseStudentDao getStudentDao(){
        return new OtherStudentDao();
    }
}

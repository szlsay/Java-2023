package cn.edu.info.dao;

import cn.edu.info.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao {
    // 集合容器
    private static ArrayList<Student> stus = new ArrayList<>();

    static {
        Student stu1 = new Student("heima001","张三","23","1999-11-11");
        Student stu2 = new Student("heima002","李四","24","2000-11-11");

        stus.add(stu1);
        stus.add(stu2);
    }

    // 添加学生方法
    public boolean addStudent(Student stu) {
       stus.add(stu);
       return true;
    }

    // 查看学生方法
    public Student[] findAllStudent() {

        Student[] students = new Student[stus.size()];

        for (int i = 0; i < students.length; i++) {
            students[i] = stus.get(i);
        }

        return students;
    }

    public void deleteStudentById(String delId) {
        // 1. 查找id在容器中所在的索引位置
        int index = getIndex(delId);
        stus.remove(index);
    }

    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            Student stu = stus.get(i);
            if(stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String updateId, Student newStu) {
        // 1. 查找updateId, 在容器中的索引位置
        int index = getIndex(updateId);
        stus.set(index, newStu);
    }
}

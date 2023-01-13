package cn.edu.info.controller;

import cn.edu.info.domain.Student;
import cn.edu.info.service.StudentService;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController {

    private Scanner sc = new Scanner(System.in);

    // 键盘录入学生信息
    // 开闭原则: 对扩展内容开放, 对修改内容关闭
    @Override
    public Student inputStudentInfo(String id) {
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        String age = sc.next();
        System.out.println("请输入学生生日:");
        String birthday = sc.next();
        Student stu = new Student(id,name,age,birthday);
        return stu;
    }
}

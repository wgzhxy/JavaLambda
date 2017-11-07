package org.wanggz.utils;

import com.google.common.collect.Lists;
import org.wanggz.dto.Student;

import java.util.List;

public class StudentTools {

    public static List<Student> getStudents() {

        List<Student> students = Lists.newArrayList();

        Student student = new Student();
        student.setAge(5);
        student.setName("test01");
        student.setSex("男");
        students.add(student);

        student = new Student();
        student.setAge(7);
        student.setName("test02");
        student.setSex("女");
        students.add(student);

        student = new Student();
        student.setAge(10);
        student.setName("test03");
        student.setSex("女");
        students.add(student);

        student = new Student();
        student.setAge(11);
        student.setName("test04");
        student.setSex("女");
        students.add(student);

        student = new Student();
        student.setAge(12);
        student.setName("test05");
        student.setSex("男");
        students.add(student);

        student = new Student();
        student.setAge(13);
        student.setName("test06");
        student.setSex("女");
        students.add(student);

        student = new Student();
        student.setAge(14);
        student.setName("test07");
        student.setSex("男");
        students.add(student);

        student = new Student();
        student.setAge(15);
        student.setName("test08");
        student.setSex("男");
        students.add(student);

        student = new Student();
        student.setAge(16);
        student.setName("test09");
        student.setSex("男");
        students.add(student);

        return students;
    }
}

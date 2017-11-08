package org.wanggz;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.wanggz.dto.Student;
import org.wanggz.dto.StudentNew;
import org.wanggz.utils.StudentTools;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListTest {

    @Test
    public void testList_flatMap() {

        List<StudentNew> tmpLs = StudentTools.getStudents().stream()
                .limit(3)
                .flatMap(student -> {
                    StudentNew studentNew = new StudentNew();
                    studentNew.setDesc(student.getName() + "->" + student.getAge() + "->" + student.getSex());
                    studentNew.setName(student.getName());
                    studentNew.setAge(student.getAge());
                    studentNew.setSex(student.getSex());
                    return Stream.of(studentNew);
                }).collect(Collectors.toList());

        System.out.println(JSON.toJSONString(tmpLs));
    }

    @Test
    public void test_Stream_of() {
        System.out.println(Stream.of("1", " 2", "3").collect(Collectors.toList()));
    }
}

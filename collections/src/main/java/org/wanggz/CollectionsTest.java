package org.wanggz;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.junit.Test;
import org.wanggz.dto.Student;
import org.wanggz.utils.StudentTools;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsTest {

    @Test
    public void test_List_stream_collect_map() {

        List<Student> students = StudentTools.getStudents();

        List<String> retLs = students.stream().filter(student -> student.getName().contains("test"))
                .map(student -> student.getName())
                .collect(Collectors.toList());

        System.out.println(JSON.toJSONString(retLs));
    }

    @Test
    public void test_List_stream() {

        List<Student> students = StudentTools.getStudents();

        students.stream().forEach(student -> {
            System.out.println(student.getName());
        });
    }

    @Test
    public void test_List_parallelStream() {

        List<Student> students = StudentTools.getStudents();

        students.parallelStream().forEach(student -> System.out.println(student.getName()));
    }

    @Test
    public void test_Map_Stream() {

        Map<String, Student> maps = Maps.newHashMap();

        List<Student> students = StudentTools.getStudents();
        students.stream().forEach(student -> {
            maps.put(student.getName(), student);
        });

        maps.forEach((x, y) -> {
            System.out.println(x + " = " + JSON.toJSONString(y));
        });
    }

    @Test
    public void test_Set_parallelStream() {

        Set<Student> maps = Sets.newHashSet();
        List<Student> students = StudentTools.getStudents();

        students.stream().forEach(student -> {
            maps.add(student);
        });

        maps.forEach((x) -> {
            System.out.println(JSON.toJSONString(x));
        });
    }
}

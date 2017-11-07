package org.wanggz;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.wanggz.dto.Student;
import org.wanggz.utils.StudentTools;

import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.stream.Collectors;

public class FunctionRun {

    @Test
    public void testFunction() {

        List<Student> students = StudentTools.getStudents();

        Function<Integer, List<Student>> fun = (x) -> students.stream()
                .filter(student -> student.getAge() > x)
                .collect(Collectors.toList());

        System.out.println(JSON.toJSON(fun.apply(15)));

    }

    @Test
    public void testFunction_Long() {

        List<Student> students = StudentTools.getStudents();

        LongFunction<List<Student>> fun = (x) -> students.stream()
                .filter(student -> student.getAge() > x)
                .collect(Collectors.toList());

        System.out.println(JSON.toJSON(fun.apply(15L)));

    }

    @Test
    public void testFunction_Double() {

        List<Student> students = StudentTools.getStudents();

        DoubleFunction<List<Student>> fun = (x) -> students.stream()
                .filter(student -> student.getAge() > x)
                .collect(Collectors.toList());

        System.out.println(JSON.toJSON(fun.apply(15.0)));

    }

    @Test
    public void testFunction_Double_To_Long() {

        List<Student> students = StudentTools.getStudents();

        DoubleToLongFunction fun = (x) -> new Double(x).longValue();

        System.out.println(JSON.toJSON(fun.applyAsLong(15.233358888)));

    }
}

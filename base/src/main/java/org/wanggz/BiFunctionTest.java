package org.wanggz;

import org.junit.Assert;
import org.junit.Test;
import org.wanggz.dto.Student;

import java.util.function.BiFunction;

public class BiFunctionTest {

    @Test
    public void testBiFunction() {

        Student student = new Student();
        student.setName("李明");
        student.setAge(15);
        student.setSex("female");

        BiFunction<String, Student, Long> biFunction = (x, y) -> y.getName().equals(x) ? 10L : 5L;
        Long value = biFunction.apply("李明", student);

        Assert.assertTrue(value == 10);
    }
}

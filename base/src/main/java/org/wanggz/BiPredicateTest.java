package org.wanggz;

import org.junit.Assert;
import org.junit.Test;
import org.wanggz.dto.Student;

import java.util.function.BiPredicate;

public class BiPredicateTest {

    @Test
    public void testBiPredicate() {

        Student student = new Student();
        student.setName("test001");
        student.setAge(15);

        BiPredicate<Student, Integer> biPredicate = (x, y) -> x.getAge() == y ? true : false;

        Assert.assertTrue(biPredicate.test(student, 15));

    }
}

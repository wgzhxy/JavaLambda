package org.wanggz;

import org.junit.Test;
import org.wanggz.dto.Student;

import java.util.function.BiConsumer;

public class BiConsumerTest {

    @Test
    public void testBiConsumerConsumer() {

        Student student = new Student();
        student.setName("李明");
        student.setAge(15);
        student.setSex("female");

        BiConsumer<Student, Long> consumer = (x, y) -> System.out.println(x.getName() + " - " + y);
        consumer.accept(student, 75769L);
    }
}

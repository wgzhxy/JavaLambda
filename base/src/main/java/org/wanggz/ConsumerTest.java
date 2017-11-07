package org.wanggz;

import org.junit.Test;
import org.wanggz.dto.Student;

import java.util.function.Consumer;

public class ConsumerTest {

    @Test
    public void testConsumer() {

        Student student = new Student();
        student.setName("李明");
        student.setAge(15);
        student.setSex("female");

        Consumer<Student> consumer = x -> System.out.println(x.getName());
        consumer.accept(student);
    }

    @Test
    public void testConsumer_andThen() {

        Student student = new Student();
        student.setName("李明");
        student.setAge(15);
        student.setSex("female");

        Consumer<Student> consumer = x -> x.setName("李明001");
        consumer.andThen(y -> System.out.println(y.getName())).accept(student);
    }
}

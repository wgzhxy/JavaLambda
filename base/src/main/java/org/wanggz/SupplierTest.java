package org.wanggz;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.wanggz.dto.Student;
import org.wanggz.utils.StudentTools;

import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

    @Test
    public void testSupplier() {

        List<Student> students = StudentTools.getStudents();

        Supplier<Student> studentSupplier = () -> students.stream().filter((Student x) -> x.getName().equals("test01")).findAny().get();

        System.out.println(JSON.toJSON(studentSupplier.get()));
    }
}

package org.wanggz;

import org.junit.Test;
import org.wanggz.utils.StudentTools;

public class StringReduceTest {

    @Test
    public void testStringReduce() {
        String total = StudentTools.getStudents().parallelStream().reduce(new String(), (x, y) -> y.getName(), (m, n) -> m + "," + n);
        System.out.println("[" + total.toString() + "]");
    }
}

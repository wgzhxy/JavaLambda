package org.wanggz.lambda.advance;

import org.junit.Test;
import org.wanggz.lambda.advance.collector.StringCollector;
import org.wanggz.utils.StudentTools;

public class TestStringCollector {

    @Test
    public void testStringCollector() {
        String obj = StudentTools.getStudents().parallelStream().collect(new StringCollector());
        System.out.println(obj);
    }
}

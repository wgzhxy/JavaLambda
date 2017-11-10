package org.wanggz.lambda.advance;

import org.junit.Test;
import org.wanggz.lambda.advance.collector.StringCollector;
import org.wanggz.utils.StudentTools;

import java.util.stream.Collector;

public class TestStringCollector {

    @Test
    public void testStringCollector() {
        String obj = StudentTools.getStudents().stream().collect(new StringCollector());
        System.out.println(obj);
    }
}

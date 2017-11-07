package org.wanggz;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.wanggz.utils.StudentTools;

public class ListTest {

    @Test
    public void testList() {

        StudentTools.getStudents().stream().limit(10).flatMap(x -> Lists.newArrayList(x).stream());


    }
}

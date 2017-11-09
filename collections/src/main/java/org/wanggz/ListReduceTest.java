package org.wanggz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author guangzhong.wgz
 */
public class ListReduceTest {

    @Test
    public void testReduce_BinaryOperator() {
        Integer total = Stream.of(1, 3, 5, 9, 10).reduce((x, y) -> x + y).get();
        System.out.println(total);
        Assert.assertTrue(total == (1 + 3 + 5 + 9 + 10));
    }

    @Test
    public void testReduce_identity_BinaryOperator() {
        Integer sum = 20;
        Integer total = Stream.of(1, 3, 5, 9, 10).reduce(sum, (x, y) -> x + y).intValue();
        Assert.assertTrue(total == (1 + 3 + 5 + 9 + 10 + sum));
    }

    @Test
    public void testReduce_identity_stream_BinaryOperator() {

        Integer sum = 20;
        List<Integer> tpList = Arrays.asList(1, 3, 5, 9, 10);

        // combiner 函数没有作用
        Integer total = tpList.stream().reduce(20, (x, y) -> x + y, (m, n) -> m + n).intValue();
        System.out.println(total);
    }

    @Test
    public void testReduce_identity_parallelStream_BinaryOperator() {

        Integer sum = 20;
        List<Integer> tpList = Arrays.asList(1, 3, 5, 9, 10);

        // 有作用
        Integer total = tpList.parallelStream().reduce(20, (x, y) -> x + y, (m, n) -> m + n).intValue();
        System.out.println(total);
    }

}

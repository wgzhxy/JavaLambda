package org.wanggz;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    @Test
    public void testBinaryOperator() {
        BinaryOperator<Long> binaryOperator = (x, y) -> x + y;
        Assert.assertTrue(binaryOperator.apply(5L, 10L) == 15);
    }

    @Test
    public void testBinaryOperator_maxBy() {
        Long r = BinaryOperator.maxBy((Long x, Long y) -> {
            if (x > y) {
                return 1;
            } else if (x < y) {
                return -1;
            } else {
                return 0;
            }
        }).apply(5L, 6L);
        Assert.assertTrue(r == 6);
    }

    @Test
    public void testBinaryOperator_minBy() {
        Long r = BinaryOperator.minBy((Long x, Long y) -> {
            if (x > y) {
                return 1;
            } else if (x < y) {
                return -1;
            } else {
                return 0;
            }
        }).apply(5L, 6L);
        Assert.assertTrue(r == 5);
    }
}

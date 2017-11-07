package org.wanggz;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Predicate;

public class PredicateTest {

    @Test
    public void testPredicate() {
        Predicate<String> predicate = (str) -> str.contains("test");
        Assert.assertTrue(predicate.test("test001"));
    }

    @Test
    public void testPredicate_negate() {
        Predicate<String> predicate = (str) -> str.contains("test");
        Assert.assertTrue(predicate.negate().test("abcd"));
    }

    @Test
    public void testPredicate_or() {
        Predicate<String> predicate = (str) -> str.contains("test");
        Assert.assertTrue(predicate.or(x -> x.contains("abcd")).test("test"));
        Assert.assertTrue(predicate.or(x -> x.contains("12345")).test("12345"));
    }

    @Test
    public void testPredicate_and() {
        Predicate<String> predicate = (str) -> str.contains("test");
        Assert.assertTrue(predicate.and(x -> x.contains("abcd")).test("test and abcd, 哈哈"));
    }

    @Test
    public void testPredicate_equals() {
        Predicate<String> predicate = (str) -> str.contains("test");
        Assert.assertTrue(Predicate.isEqual(predicate).test(predicate));
    }
}

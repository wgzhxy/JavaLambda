package org.wanggz;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollectorStringJoiner {

    @Test
    public void testStringCollector() {
        String str = Stream.of("1", "5", "2", "10", "3", "80").collect(Collectors.joining());
        System.out.println(str);
    }

    @Test
    public void testStringCollector_delimiter() {
        String str = Stream.of("1", "5", "2", "10", "3", "80").collect(Collectors.joining(","));
        System.out.println(str);
    }

    @Test
    public void testStringCollector_demiliter_StringJoiner() {
        String str = Stream.of("1", "5", "2", "10", "3", "80").collect(Collectors.joining(",", "[", "]"));
        System.out.println(str);
    }

}


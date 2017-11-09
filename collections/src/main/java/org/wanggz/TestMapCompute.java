package org.wanggz;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;

public class TestMapCompute {

    @Test
    public void testMapCompute() {

        Map<String, Object> cache = Maps.newHashMap();

        cache.put("test", "李明方");

        Object retValue = cache.compute("test", (key, value) -> value == null ? "nil" : value);

        System.out.println(retValue);
    }

    @Test
    public void testMapCompute_IfAbsent() {

        Map<String, Object> cache = Maps.newHashMap();

        Object retValue = cache.computeIfAbsent("test", (value) -> "测试一下，看看");

        System.out.println(cache.get("test"));
    }

    @Test
    public void testMapCompute_IfPresent() {

        Map<String, Object> cache = Maps.newHashMap();
        cache.put("test", "我存在的test");

        Object retValue = cache.computeIfPresent("test", (key, value) -> value.toString().contains("test") ? null : value);

        System.out.println(cache.get("test"));
    }

}

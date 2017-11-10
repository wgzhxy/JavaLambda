package org.wanggz.lambda.advance.collector;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Sets;
import org.wanggz.dto.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * 自定义 Collector
 *
 * @author guangzhong.wgz
 */
public final class StringCollector implements Collector<Student, List<String>, String> {

    @Override
    public Supplier<List<String>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<String>, Student> accumulator() {
        return (x, y) -> x.add(y.getName());
    }

    @Override
    public BinaryOperator<List<String>> combiner() {
        return (x, y) -> {
            x.addAll(y);
            return x;
        };
    }

    @Override
    public Function<List<String>, String> finisher() {
        return (x) -> JSON.toJSONString(x);
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Sets.newHashSet(Characteristics.UNORDERED);
    }
}

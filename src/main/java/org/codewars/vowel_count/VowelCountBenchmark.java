package org.codewars.vowel_count;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
public class VowelCountBenchmark {

    private final String input = "hello world, this is a benchmark test for vowel counting";

    @Benchmark
    public int solucao1() {
        return VowelCount.solucao1(input);
    }

    @Benchmark
    public int solucao2() {
        return VowelCount.solucao2(input);
    }

    @Benchmark
    public int solucao3() {
        return VowelCount.solucao3(input);
    }

    @Benchmark
    public int solucao4() {
        return VowelCount.solucao4(input);
    }
}
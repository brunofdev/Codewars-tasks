package br.com.brunofragadev.codewars_duplicate_encoder;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
public class DuplicateEncoderBenchmark {

    private final String input = "recede Success din (( @";

    @Benchmark
    public String encode1() {
        return DuplicateEncoder.encode(input);
    }

    @Benchmark
    public String encode2() {
        return DuplicateEncoder.encode2(input);
    }

    @Benchmark
    public String encode3() {
        return DuplicateEncoder.encode3(input);
    }
}
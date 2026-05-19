package br.com.brunofragadev.solver_super_marketing_queue;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
public class SuperMarketQueueBenchmark {

    private final int[] customers = {5, 8, 5, 9, 12, 3};
    private final int n = 4;

    @Benchmark
    public int solucao1() {
        return SolverSuperMarketingQueue.solveSuperMarketQueue(customers, n);
    }
    @Benchmark
    public int solucao2() {
        return SolverSuperMarketingQueue.solveSuperMarketQueue2(customers, n);
    }
    @Benchmark
    public int solucao3() {
        return SolverSuperMarketingQueue.solveSuperMarketQueue3(customers, n);
    }

}
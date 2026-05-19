package br.com.brunofragadev.solver_super_marketing_queue;

import java.util.*;

public class SolverSuperMarketingQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        PriorityQueue<Integer> caixas = new PriorityQueue<>();
        Queue<Integer> clientes = new LinkedList<>();
        int mairoValor = 0;
        for (int customer : customers) {
            clientes.add(customer);
        }
        for (int i = 0; i < n; i++) {
            caixas.add(0);
        }
        while (!clientes.isEmpty()) {
            int caixaLivre = caixas.poll();
            int cliente = clientes.poll();
            caixas.add(caixaLivre + cliente);
            }
        while(!caixas.isEmpty()){
            mairoValor = caixas.poll();
        }
        return mairoValor;
    }

    public static int solveSuperMarketQueue2(int[] customers, int n) {
        int[] result = new int[n];
        for(int i = 0; i < customers.length; i++){
            result[0] += customers[i];
            Arrays.sort(result);
        }
        return result[n-1];
    }

    public static int solveSuperMarketQueue3(int[] customers, int n) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++)
            q.add(0);
        for (int t : customers)
            q.add(q.remove() + t);
        return Collections.max(q);
    }
}

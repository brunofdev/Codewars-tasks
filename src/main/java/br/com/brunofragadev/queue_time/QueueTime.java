package br.com.brunofragadev.queue_time;

import java.util.*;

public class QueueTime {

    /*
    Queue Time Counter
    Dado um array de pessoas em uma fila, onde cada valor representa a quantidade de tickets que
    aquela pessoa deseja comprar, e a posição inicial do seu amigo na fila, calcule quantos minutos
    ele levará para terminar de comprar todos os seus tickets.
    Regras:

    Cada pessoa compra 1 ticket por vez
    Quem ainda precisa de mais tickets volta ao final da fila
    Cada atendimento leva 1 minuto

    Retorne o tempo total em minutos até seu amigo ser atendido pela última vez.
     */

    public static int queue(int[] queuers, int pos) {
        int meuAmigo = pos;
        int contador = 0;
        Queue<int[]> fila = new LinkedList<>();
        int posicaoAtual = 0;
        for(int a : queuers) {
            fila.offer(new int[]{a, posicaoAtual});
            posicaoAtual++;
        }
        while(!fila.isEmpty()) {
            int[] proximoDaFila = fila.poll();
            contador++;
            proximoDaFila[0]--;
            if(proximoDaFila[0] == 0) {
                if(proximoDaFila[1] == meuAmigo) {
                    break;
                }
                continue;
            }

            fila.offer(new int[]{proximoDaFila[0], proximoDaFila[1]});
        }
        return contador;
    }
}

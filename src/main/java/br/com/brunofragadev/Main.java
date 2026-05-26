package br.com.brunofragadev;

import br.com.brunofragadev.queue_time.QueueTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int resultado = QueueTime.queue(new int[] { 2, 5, 3, 6, 4 }, 3);//resultado 20
            int resultado2 = QueueTime.queue(new int[]{ 2, 5, 3, 6, 4 }, 0); //resultado 6
            System.out.println("Resultado: " + resultado);
            System.out.println("Resultado: " + resultado2);
        }
    }
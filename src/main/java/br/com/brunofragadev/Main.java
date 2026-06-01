package br.com.brunofragadev;

import br.com.brunofragadev.estudos_recursao.ExerciciosComRecursao;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        System.out.println("A inversão do array: " + Arrays.toString(ExerciciosComRecursao.inverterArray(new int[]{1, 2, 3, 4, 5}, 0)));
    }
}
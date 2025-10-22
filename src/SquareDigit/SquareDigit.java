package SquareDigit;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareDigit {


    //minha solucao
    public static int squareDigits(int n) {
        String[] arrayString = String.valueOf(n).split("");
        for(int i = 0; i < arrayString.length; i++){
                int digito = Integer.parseInt(arrayString[i]);
                int quadrado = digito * digito;
                arrayString[i] = String.valueOf(quadrado).toString();
            }
        return Integer.parseInt(String.join("", arrayString));
    }

    //solucao mais concisa, limpa e moderna
        public static int squareDigits2(int n) {
            return Integer.parseInt(String.valueOf(n)
                    .chars()
                    .map(i -> Integer.parseInt(String.valueOf((char) i)))
                    .map(i -> i * i)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining("")));
        }
}


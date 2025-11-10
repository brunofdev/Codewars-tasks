package FindTheParityOutlier;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * o metodo recebe um array de inteiros com no minimo 3 numeros
 * todos os numeros devem ser pares ou impares, exceto UM numero, cujo este, deve ser o nº impostor
 * nosso objetivo é escrever um algortmo capaz de identificar este impostor.
 */
public class FindTheParityOutlier {
    public static int find(int[] numeros) {
        long qtdPares = Arrays.stream(numeros).filter(n -> n % 2 == 0).count();
        long qtdImpares = numeros.length - qtdPares;

        if (qtdImpares == 1) {
            return Arrays.stream(numeros)
                    .filter(n -> n % 2 != 0)
                    .findFirst()
                    .orElseThrow();
        } else {
            return Arrays.stream(numeros)
                    .filter(n -> n % 2 == 0)
                    .findFirst()
                    .orElseThrow();
        }
    }
}


package DecondingOrder;

import java.util.Arrays;
import java.util.Collections;

/**
 * Classe responsável por ordenar os dígitos de um número inteiro
 * em ordem decrescente.
 *
 * <p>Este código é uma solução para um desafio (KATA) em que o método
 * deve receber um número inteiro e retornar esse mesmo número
 * com os dígitos organizados de forma decrescente.</p>
 *
 * <p>Exemplo:
 * <pre>{@code
 * sortDesc(42145)  ->  54421
 * sortDesc(145263) ->  654321
 * }</pre></p>
 *
 */
public class DescendingOrder {

    /**
     * Ordena os dígitos de um número em ordem decrescente utilizando loops aninhados.
     * <p>Esta é a solução manual implementada com comparações diretas entre os dígitos.</p>
     *
     * @param num número inteiro positivo a ser ordenado
     * @return número com os dígitos ordenados em ordem decrescente
     * @throws RuntimeException se o número for negativo ou igual a zero
     */
    public static int sortDesc(final int num) {
        validatePositive(num);

        String numStr = String.valueOf(num);
        char[] digits = numStr.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] < digits[j]) {
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }

        return Integer.parseInt(new String(digits));
    }

    /**
     * Valida se o número informado é positivo.
     *
     * @param num número a ser validado
     * @throws RuntimeException se o número for menor que 1
     */
    private static void validatePositive(int num) {
        if (num < 1) {
            throw new RuntimeException("O número não pode ser negativo ou zero.");
        }
    }

    /**
     * Solução alternativa mais concisa e elegante utilizando
     * a API de coleções do Java.
     *
     * <p>Esta versão não impede a entrada de números negativos.</p>
     *
     * @param num número inteiro a ser ordenado
     * @return número com os dígitos em ordem decrescente
     */
    public static int sortDesc2(final int num) {
        String[] digits = String.valueOf(num).split("");
        Arrays.sort(digits, Collections.reverseOrder());
        return Integer.parseInt(String.join("", digits));
    }
}

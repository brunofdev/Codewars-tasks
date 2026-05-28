package br.com.brunofragadev.leetcode_two_sum;
import java.util.HashMap;
import java.util.Map;

/**
 * Dado um array de inteiros e um valor alvo (target),
 * encontrar os dois números que somados resultam no target
 * e retornar seus índices.
 *
 * Abordagem: HashMap em uma única passagem
 * - Para cada número, calculo o complemento (target - atual)
 * - Se o complemento já existe no mapa, retorno os dois índices
 * - Caso contrário, armazeno o número atual e seu índice
 *
 * Complexidade de tempo: O(n)
 * Complexidade de espaço: O(n)
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int numeroQuePreciso = 0;
        for (int i = 0; i < nums.length; i++) {
            numeroQuePreciso = target - nums[i];
            if(map.containsKey(numeroQuePreciso)){
                return new int[]{map.get(numeroQuePreciso), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

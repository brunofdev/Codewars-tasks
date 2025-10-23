package CountingDuplicates;

import java.util.HashMap;
import java.util.Map;


/**
 * Solução que eu criei, ineficiente, gasta poca memoria mas é lenta conforme a string aumenta de tamanho
 */
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        char[] chars = text.toLowerCase().toCharArray();
        Map<Character, Boolean > charVerificados = new HashMap<>();
        boolean isRepeat = false;
        for(int i = 0; i < chars.length ; i++){
            isRepeat = false;
            if(!charVerificados.containsKey(chars[i])){
                for(int j = 0; j < chars.length; j++ ){
                    char charVerify = chars[i];
                    char charCompareted = chars[j];
                    if(i != j && charVerify == charCompareted){
                        isRepeat = true;
                    }
                }
            }
            if(isRepeat) {
                charVerificados.put(chars[i], true);
            }
        }
        return charVerificados.size();
    }


    /**
     * Uma solução melhor e mais rapida conforme o crescimento da String
     */
    // Complexidade: O(n)
    public static int duplicateCountOtimizada(String text) {
        // 1. Usa um mapa para armazenar a contagem de cada caractere
        Map<Character, Integer> contagem = new HashMap<>();
        text = text.toLowerCase(); // Garante o case-insensitivity

        // 2. Primeira passagem: Contagem de Frequência (O(n))
        for (char c : text.toCharArray()) {
            // Coloca o caractere no mapa, incrementando a contagem.
            // O getOrDefault simplifica: se não existir, usa 0, senão usa o valor existente.
            contagem.put(c, contagem.getOrDefault(c, 0) + 1);
            System.out.println(contagem.get(c));
        }

        // 3. Segunda passagem: Contagem de Duplicatas (O(k), onde k é o número de caracteres únicos)
        int duplicatas = 0;
        for (int count : contagem.values()) {
            // Se a contagem for maior que 1, significa que é um caractere duplicado.
            if (count > 1) {
                duplicatas++;
            }
        }

        return duplicatas;
    }
}

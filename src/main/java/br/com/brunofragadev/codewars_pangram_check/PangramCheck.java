package br.com.brunofragadev.codewars_pangram_check;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Primeira  ruim
public class PangramCheck {
    public static boolean check(String sentence){
            Map<Character, Boolean> mapaAlfabeto = new HashMap<>();
            for (char c = 'A'; c <= 'Z'; c++) {
                mapaAlfabeto.put(c, false);
            }
            char[] frase = sentence.toUpperCase().toCharArray();
            for(char letra : frase){
                if(mapaAlfabeto.containsKey(letra)){
                    mapaAlfabeto.put(letra, true);
                }
            }
        long totalDeLetras = mapaAlfabeto.values().stream()
                .filter(v -> v == true)
                .count();
        return totalDeLetras == mapaAlfabeto.size();
    }
//Segunda solucao mais enxuta com o estutura set que nao aceita duplicatas
    public static boolean check2(String sentence){
       Set<Character> listaNaoDuplicatas = new HashSet<>();
        char[] frase = sentence.replaceAll("[^a-zA-Z]", "").toUpperCase().toCharArray();
        for(char letra : frase){
            listaNaoDuplicatas.add(letra);
        }
        return listaNaoDuplicatas.size() == 26;
    }
//terceira e melhor solucao com streams
    public static boolean check3(String sentence){
       return sentence.toUpperCase()
                .chars()
                .filter(Character::isLetter)
                .distinct()
                .count() == 26;
    }
}
/*
Vamos pensar:
O meu metodo recebe uma string que s�o uma frase.
Ele precisa verificar se esta frase, contem todas as letras do alfabeto
caso tenha, ela e uma frase Pangram
caso nao tenho, nao eh.

Como fazer isso?

vamos pegar a frase de exemplo:
    The quick brown fox jumps over the lazy dog


teste*/
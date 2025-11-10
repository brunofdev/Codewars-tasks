package PangramCheck;

/*
TAREFA:
Um pangrama é uma frase que contém todas as letras
do alfabeto pelo menos uma vez. Por exemplo, a frase
"The quick brown fox jumps over the lazy dog" é um pangrama,
porque utiliza as letras de A a Z pelo menos uma vez
(maiúsculas ou minúsculas não importam).

Dada uma string, verifique se ela é um pangrama ou não.
Retorne True se for, False caso contrário. Ignore números e pontuação.*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Primeira solução ruim
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
//Segunda solução mais enxuta com o estutura set que nao aceita duplicatas
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
O meu metodo recebe uma string que é uma frase.
Ele precisa verificar se esta frase, contem todas as letras do alfabeto
caso tenha, ela e uma frase Pangram
caso nao tenho, nao eh.

Como fazer isso?

vamos pegar a frase de exemplo:
    The quick brown fox jumps over the lazy dog


teste*/
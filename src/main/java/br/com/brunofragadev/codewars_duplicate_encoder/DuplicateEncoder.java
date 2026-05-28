package br.com.brunofragadev.codewars_duplicate_encoder;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateEncoder {

    //Minha solução
    public static String encode(String word){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String novaString = word.toLowerCase();
        for(int i = 0; i < novaString.length(); i++){
            map.put(novaString.charAt(i), map.getOrDefault(novaString.charAt(i), 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < novaString.length(); i++){
            if (map.get(novaString.charAt(i)) == 1) {
                sb.append("(");
            } else {
                sb.append(")");
            }
        }
        return sb.toString();
    }

    //Outras pessoas do CodeWars
    static String encode2(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }

    public static String encode3(String word){
        return word.toLowerCase()
            .chars()
            .mapToObj(i -> String.valueOf((char)i))
            .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
            .collect(Collectors.joining());
        }
}

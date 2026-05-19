package br.com.brunofragadev.duplicate_encoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

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

}

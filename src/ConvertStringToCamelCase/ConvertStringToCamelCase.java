package ConvertStringToCamelCase;

import java.util.Arrays;

public class ConvertStringToCamelCase {
        public static String toCamelCase(String s) {
            // 1. Divide por hífen OU underscore
            String[] palavras = s.split("[-_]");
            // 2. Se a string original for vazia ou não tiver palavras, retorna vazio
            if (palavras.length == 0 || s.isEmpty()) {
                return "";
            }
            StringBuilder resultado = new StringBuilder();
            // 3. Adiciona a PRIMEIRA palavra EXATAMENTE como ela é (preservando o case)
            resultado.append(palavras[0]);
            // 4. Itera a partir da SEGUNDA palavra (i = 1)
            for (int i = 1; i < palavras.length; i++) {
                String palavra = palavras[i];
                // 5. Capitaliza apenas as palavras seguintes
                resultado.append(palavra.substring(0, 1).toUpperCase())
                        .append(palavra.substring(1));
            }

            return resultado.toString();
        }
}


package br.com.brunofragadev.codewars_vowel_count;

public class VowelCount {

    // Desafio: contar vogais (a, e, i, o, u) em uma String.
    // Retorna o total como inteiro.

    // Solução 1 - if encadeado
    // Funciona, mas verbosa. Cada condição precisa ser escrita manualmente.
    // Problema: toCharArray() cria um novo array na memória + boxing de char para Character.
    public static int solucao1(String str) {
        int count = 0;
        for (Character c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    // Solução 2 - switch expression (Java 14+)
    // Mais legível que if encadeado, mas ainda usa toCharArray().
    public static int solucao2(String str) {
        int count = 0;
        for (Character c : str.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }
        return count;
    }

    // Solução 3 - charAt() com for tradicional
    // Mais eficiente: não cria array na memória.
    // charAt() acessa cada caractere diretamente pelo índice na String original.
    public static int solucao3(String str) {
        int count = 0;
        String lower = str.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            switch (lower.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }
        return count;
    }

    // Solução 4 - replaceAll com regex
    // Remove tudo que não é vogal e mede o que sobrou.
    // [^aeiou] = qualquer caractere que N�fO seja vogal.
    // Mais concisa, mas cria duas Strings na memória (toLowerCase + replaceAll).
    public static int solucao4(String str) {
        return str.toLowerCase().replaceAll("[^aeiou]", "").length();
    }
}
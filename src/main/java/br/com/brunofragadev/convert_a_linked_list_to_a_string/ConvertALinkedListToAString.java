package br.com.brunofragadev.convert_a_linked_list_to_a_string;

/*
 * Kata: Converter Lista Encadeada em String
 *
 * Dado o primeiro nó de uma lista encadeada, percorrer todos os nós
 * e retornar sua representação em String no formato:
 * 1 -> 2 -> 3 -> null
 *
 * Uma lista vazia (null) deve retornar simplesmente "null".
 */

public class ConvertALinkedListToAString {

    public static String stringify(Nodee list) {
        StringBuilder sb = new StringBuilder();
        if(list == null) return sb.append("null").toString();
        while(list != null){
                sb.append(list.getData() + " -> ");
                list = list.getNext();
                if(list == null){
                    sb.append("null");
                }
            }
        return sb.toString();
    }
}

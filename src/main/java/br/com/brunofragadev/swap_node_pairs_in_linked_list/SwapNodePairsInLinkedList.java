package br.com.brunofragadev.swap_node_pairs_in_linked_list;

/*
 * Kata: Swap Node Pairs in Linked List
 *
 * Dada uma lista encadeada, trocar cada par de nós de posição.
 * Os nós devem ser trocados, não seus valores.
 *
 * Exemplo:
 * A -> B -> C -> D  =>  B -> A -> D -> C
 * A -> B -> C       =>  B -> A -> C
 *
 * Lista vazia ou com um único nó retorna a própria lista.
 */

public class SwapNodePairsInLinkedList {
    public static Nodeee swapPairs(Nodeee head) {
        if (head == null || head.next == null) return head;

        Nodeee second = head.next;
        head.next = swapPairs(second.next);
        second.next = head;

        return second;
    }
}
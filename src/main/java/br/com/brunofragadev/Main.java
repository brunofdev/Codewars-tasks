package br.com.brunofragadev;


import br.com.brunofragadev.swap_node_pairs_in_linked_list.Nodeee;
import br.com.brunofragadev.swap_node_pairs_in_linked_list.SwapNodePairsInLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nodeee a = new Nodeee("A");
        Nodeee b = new Nodeee("B");
        Nodeee c = new Nodeee("C");
        Nodeee d = new Nodeee("D");

        a.next = b;
        b.next = c;
        c.next = d;

        Nodeee result = SwapNodePairsInLinkedList.swapPairs(a);
        System.out.println(result.printList());
    }
    }
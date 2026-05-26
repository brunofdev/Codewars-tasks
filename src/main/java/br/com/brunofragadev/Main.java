package br.com.brunofragadev;

import br.com.brunofragadev.convert_a_linked_list_to_a_string.ConvertALinkedListToAString;
import br.com.brunofragadev.convert_a_linked_list_to_a_string.Nodee;
import br.com.brunofragadev.queue_time.QueueTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Nodee list = new Nodee(1, new Nodee(2, new Nodee(3)));
        System.out.println(ConvertALinkedListToAString.stringify(list));
        System.out.println(ConvertALinkedListToAString.stringify(null));
        }
    }
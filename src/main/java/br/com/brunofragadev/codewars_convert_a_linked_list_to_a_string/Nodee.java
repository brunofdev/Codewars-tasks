package br.com.brunofragadev.codewars_convert_a_linked_list_to_a_string;

public class Nodee {
    private int data;
    private Nodee next;

    public Nodee(int data, Nodee next) {
        this.data = data;
        this.next = next;
    }

    public Nodee(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Nodee getNext() {
        return next;
    }
}
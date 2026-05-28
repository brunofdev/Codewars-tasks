package br.com.brunofragadev.codewars_swap_node_pairs_in_linked_list;

public class Nodeee {
    private String value;
    public Nodeee next;

    public Nodeee(String value) { this.value = value; }

    public String getValue() { return value; }
    // returns a String representation of the whole list:
    public String printList() {
       StringBuilder sb = new StringBuilder();
       Nodeee current = this;
       if(current.getValue() == null) return "null";
       while (current != null){
           sb.append(current.getValue()).append(" --> ");
           current = current.next;
       }
       return sb.toString();
    }

}

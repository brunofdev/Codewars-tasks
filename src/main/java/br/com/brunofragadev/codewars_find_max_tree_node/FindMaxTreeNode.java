package br.com.brunofragadev.codewars_find_max_tree_node;

public class FindMaxTreeNode {

    public static int findMax(TreeNode root) {
        if(root == null) return Integer.MIN_VALUE;

        System.out.println("�?' Entrando no nó: " + root.value);

        int ladoEsquerdo = findMax(root.getLeft());
        if(ladoEsquerdo == Integer.MIN_VALUE)
            System.out.println("  Esquerda do nó " + root.value + " �?' vazia");
        else
            System.out.println("  Esquerda do nó " + root.value + " �?' maior valor: " + ladoEsquerdo);

        int ladoDireito = findMax(root.getRight());
        if(ladoDireito == Integer.MIN_VALUE)
            System.out.println("  Direita do nó " + root.value + " �?' vazia");
        else
            System.out.println("  Direita do nó " + root.value + " �?' maior valor: " + ladoDireito);

        int resultado = Math.max(root.getValue(), Math.max(ladoEsquerdo, ladoDireito));
        System.out.println("�?� Saindo do nó " + root.value + " �?' retornando: " + resultado);

        return resultado;
    }
}

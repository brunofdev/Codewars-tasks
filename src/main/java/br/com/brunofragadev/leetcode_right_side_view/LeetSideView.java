package br.com.brunofragadev.leetcode_right_side_view;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Dado o nó raiz de uma árvore binária, retornar os valores
 * dos nós visíveis pelo lado direito, de cima para baixo.
 *
 * Abordagem: BFS (Busca em Largura) com Queue
 * - Percorre a árvore nível por nível
 * - Para cada nível, captura o último nó processado
 * - O último nó de cada nível é o visível pelo lado direito
 *
 * Complexidade de tempo: O(n)
 * Complexidade de espaço: O(n)
 */

public class LeetSideView {

    public List<Integer> rightSideView(TreeNode root){
        if (root == null) return List.of();
        Queue<TreeNode> fila = new LinkedList<>();
        List<Integer> resultado = new ArrayList<>();
        fila.add(root);
        while(!fila.isEmpty()){
            processaNode(resultado, fila);
        }
        return resultado;
    }
    public void processaNode(List<Integer> resultado, Queue<TreeNode> current){
        int tamanhoDoNivel = current.size();
        for(int i = 0; i < tamanhoDoNivel; i++){
            TreeNode node = current.poll();
            if(node.left != null)  current.add(node.left);
            if(node.right != null) current.add(node.right);
            if(i == tamanhoDoNivel - 1){
                resultado.add(node.valor);
            }
        }
    }
}

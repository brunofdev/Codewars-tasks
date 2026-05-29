package br.com.brunofragadev.leetcode_maximum_depth_of_binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            Queue<TreeNode> fila = new LinkedList<>();
            fila.add(root);
            int profundidade = 0;
            while (!fila.isEmpty()) {
                profundidade++;
                int tamanhoDoNivel = fila.size();
                for (int i = 0; i < tamanhoDoNivel; i++) {
                    TreeNode node = fila.poll();
                    if (node.left != null) fila.add(node.left);
                    if (node.right != null) fila.add(node.right);
                }
            }
            return profundidade;
        }

}

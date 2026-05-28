package br.com.brunofragadev;

import br.com.brunofragadev.leetcode_right_side_view.LeetSideView;
import br.com.brunofragadev.leetcode_right_side_view.TreeNode;



public class Main {
    public static void main(String[] args) {
        LeetSideView solution = new LeetSideView();

        // Exemplo 1: [1,2,3,null,5,null,4] → esperado: [1,3,4]
        TreeNode root1 = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4))
        );
        System.out.println(solution.rightSideView(root1));

        // Exemplo 2: [1,2,3,4,null,null,null,5] → esperado: [1,3,4,5]
        TreeNode root2 = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, new TreeNode(5), null), null),
                new TreeNode(3)
        );
        System.out.println(solution.rightSideView(root2));

        // Exemplo 3: árvore vazia → esperado: []
        System.out.println(solution.rightSideView(null));
    }
}
package br.com.brunofragadev.leetcode_maximum_depth_of_binary_tree;

public class TreeNode {
      int valor;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      public TreeNode(int valor) { this.valor = valor; }
      public TreeNode(int valor, TreeNode left, TreeNode right) {
          this.valor = valor;
          this.left = left;
          this.right = right;
      }
  }


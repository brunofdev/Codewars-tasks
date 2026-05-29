package br.com.brunofragadev.estudos_organizador_livros_com_tree;

public class TreeNode {
    public TipoDeDado tipoDeDado;
    public String nomenclatura;
    public TreeNode esquerda;
    public TreeNode direita;
    public TreeNode filhoNivel;

    public TreeNode(TipoDeDado tipoDeDado, String nomenclatura) {
        this.tipoDeDado = tipoDeDado;
        this.nomenclatura = nomenclatura;
    }
}

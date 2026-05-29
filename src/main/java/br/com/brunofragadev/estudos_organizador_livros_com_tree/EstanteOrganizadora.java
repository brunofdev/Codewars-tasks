package br.com.brunofragadev.estudos_organizador_livros_com_tree;
public class EstanteOrganizadora {
    public TreeNode raiz;

    private TreeNode inserir(TreeNode atual, TreeNode novo) {
       if(atual == null) return novo;
       if(novo.nomenclatura.compareTo(atual.nomenclatura) < 0 ) atual.esquerda = inserir(atual.esquerda, novo);
       if(novo.nomenclatura.compareTo(atual.nomenclatura) > 0 ) atual.direita =  inserir(atual.direita, novo);
       return atual;
    }
    private TreeNode encontrarNo(TreeNode atual, String nomenclatura) {
        if(atual == null) return null;
        if(nomenclatura.equals(atual.nomenclatura)) return atual;
        if(nomenclatura.compareTo(atual.nomenclatura)  < 0) return encontrarNo(atual.esquerda, nomenclatura);
        else return encontrarNo(atual.direita, nomenclatura);
    }
    public void inserirGenereo(String nomenclatura){
        TreeNode novo = new TreeNode(TipoDeDado.GENERO, nomenclatura);
        raiz = inserir(raiz, novo);
    }
    public void inserirAutor(String nomeGenero, String autor){
        TreeNode novoAutor = new TreeNode(TipoDeDado.AUTOR, autor);
        TreeNode genero = encontrarNo(raiz, nomeGenero);
        if(genero != null) genero.filhoNivel = inserir(genero.filhoNivel, novoAutor);
        else throw new RuntimeException("Genero não encontrado");
    }
    public void inserirLivro(String nomeDoGenero, String nomeAutor, String nomeLivro){
        TreeNode novoLivro = new TreeNode(TipoDeDado.TITULO, nomeLivro);
        TreeNode genero = encontrarNo(raiz, nomeDoGenero);
        if(genero == null) throw new RuntimeException("Genero não pode estar vazio");
        TreeNode autor = encontrarNo(genero.filhoNivel, nomeAutor);
        if(autor != null) autor.filhoNivel = inserir(autor.filhoNivel, novoLivro);
        else throw new RuntimeException("Autor não encontrado");
    }
    public void exibirEstante() {
        exibirEstante(raiz, 0);
    }

    private void exibirEstante(TreeNode atual, int nivel) {
        if(atual == null) return;
        System.out.println("   ".repeat(nivel) + "[" + atual.tipoDeDado.toString() + "] " + atual.nomenclatura);
        if(atual.filhoNivel != null) exibirEstante(atual.filhoNivel, nivel + 2);
        if(atual.esquerda != null) exibirEstante(atual.esquerda, nivel);
        if(atual.direita != null) exibirEstante(atual.direita, nivel);

    }
}

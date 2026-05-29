package br.com.brunofragadev;

import br.com.brunofragadev.estudos_organizador_livros_com_tree.EstanteOrganizadora;


public class Main {
    public static void main(String[] args) {
        EstanteOrganizadora estante = new EstanteOrganizadora();

        // Gêneros
        estante.inserirGenereo("Ficcao");
        estante.inserirGenereo("Terror");
        estante.inserirGenereo("Aventura");
        estante.inserirGenereo("Biografia");

        // Autores
        estante.inserirAutor("Ficcao", "Asimov");
        estante.inserirAutor("Ficcao", "Philip Dick");
        estante.inserirAutor("Terror", "King");
        estante.inserirAutor("Terror", "Lovecraft");
        estante.inserirAutor("Aventura", "Verne");
        estante.inserirAutor("Biografia", "Churchill");

        // Livros
        estante.inserirLivro("Ficcao", "Asimov", "Fundacao");
        estante.inserirLivro("Ficcao", "Asimov", "Eu Robo");
        estante.inserirLivro("Ficcao", "Philip Dick", "Androides Sonham");
        estante.inserirLivro("Terror", "King", "It");
        estante.inserirLivro("Terror", "King", "Iluminado");
        estante.inserirLivro("Terror", "Lovecraft", "Cthulhu");
        estante.inserirLivro("Aventura", "Verne", "Volta ao Mundo");
        estante.inserirLivro("Biografia", "Churchill", "A Segunda Guerra");

        estante.exibirEstante();
    }
}
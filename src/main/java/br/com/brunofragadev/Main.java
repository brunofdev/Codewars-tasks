package br.com.brunofragadev;


import br.com.brunofragadev.campeonato_tree_train.CampeonatoTree;
import br.com.brunofragadev.campeonato_tree_train.Node;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Node jogo1 = new Node("Flamengo", "Palmeiras", null, "Quartas de final");
        Node jogo2 = new Node("Gremio", "Inter", null, "Quartas de final");
        Node jogo3 = new Node("Atletico mineiro", "Conrinthians", null, "Quartas de final");
        Node jogo4 = new Node("Juventude", "Caxias", null,"Quartas de final");

        Node semi1 = new Node(null, null, null, "Semi final");
        semi1.setEsquerda(jogo1);
        semi1.setDireita(jogo2);

        Node semi2 = new Node(null, null, null, "Semi final");
        semi2.setEsquerda(jogo3);
        semi2.setDireita(jogo4);

        Node final1 = new Node(null, null, null, "Grande final do campeonado: ");
        final1.setEsquerda(semi1);
        final1.setDireita(semi2);

        CampeonatoTree campeonato = new CampeonatoTree(final1);
        campeonato.simularCampeonato(final1);

        System.out.println("O vencedor do campeonato é: " + campeonato.getRaiz().getResultado());

        }
    }
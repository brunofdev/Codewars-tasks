package br.com.brunofragadev.estudos_campeonato_tree_train;

import java.util.Scanner;

public class CampeonatoTree {
    Node raiz;

    public CampeonatoTree(Node raiz) {
        this.raiz = raiz;
    }

    public Node getRaiz() {
        return raiz;
    }

    public void simularJogo(Node node) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jogo das " + node.getJogoDaFase() + "  |  " + node.getTimeA().toUpperCase() + " x " +  node.getTimeB().toUpperCase());
        System.out.print(node.getTimeA() + " Marcou: ");
        int golsTimeA = Integer.parseInt(sc.nextLine());
        System.out.print(node.getTimeB() + " Marcou: ");
        int golstimeB = Integer.parseInt(sc.nextLine());
        if (golsTimeA < golstimeB) node.setResultado(node.getTimeB());
        if (golsTimeA > golstimeB) node.setResultado(node.getTimeA());
        if (golsTimeA == golstimeB) {
            do {
                System.out.print(node.getTimeA() + " Marcou nos penaultis:");
                int penaltisTimeA = Integer.parseInt(sc.nextLine());
                System.out.print(node.getTimeB() + " Marcou nos penaultis:");
                int penaltisTimeB = Integer.parseInt(sc.nextLine());
                if (penaltisTimeA != penaltisTimeB) {
                    if (penaltisTimeA < penaltisTimeB) {
                        node.setResultado(node.getTimeB());
                        break;
                    }
                    node.setResultado(node.getTimeA());
                    break;
                }
                System.out.println("Não podemos ter resultado igual nos penaultis, refaça \n");
            } while (true);
        }
    }
    public void simularCampeonato(Node raiz){
        if (raiz == null) return;
        if (raiz.getEsquerda() == null && raiz.getDireita() == null){
            simularJogo(raiz);
            return;
        }
        if(raiz.getEsquerda() != null) simularCampeonato(raiz.getEsquerda());
        if(raiz.getDireita() != null) simularCampeonato(raiz.getDireita());
        raiz.setTimeA(raiz.getEsquerda().getResultado());
        raiz.setTimeB(raiz.getDireita().getResultado());
        simularJogo(raiz);
    }
}

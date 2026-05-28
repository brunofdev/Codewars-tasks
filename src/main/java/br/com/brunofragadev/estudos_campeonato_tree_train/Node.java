package br.com.brunofragadev.estudos_campeonato_tree_train;

public class Node {
    String timeA;
    String timeB;
    String resultado;
    String jogoDaFase;
    Node esquerda;
    Node direita;

    public Node(String timeA, String timeB, String resultado, String jogoDaFase) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.resultado = resultado;
        this.jogoDaFase = jogoDaFase;
    }

    public String getJogoDaFase() {
        return jogoDaFase;
    }

    public void setJogoDaFase(String jogoDaFase) {
        this.jogoDaFase = jogoDaFase;
    }

    public String getTimeA() {
        return timeA;
    }

    public void setTimeA(String timeA) {
        this.timeA = timeA;
    }

    public Node getEsquerda() {
        return esquerda;
    }

    public String getTimeB() {
        return timeB;
    }

    public void setTimeB(String timeB) {
        this.timeB = timeB;
    }

    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }

    public Node getDireita() {
        return direita;
    }

    public void setDireita(Node direita) {
        this.direita = direita;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}

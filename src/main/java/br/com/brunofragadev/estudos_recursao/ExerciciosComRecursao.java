package br.com.brunofragadev.estudos_recursao;


public class ExerciciosComRecursao {
    static int indice = 1;

    public static int fatorial(int n){
        System.out.println("Descendo: " + n);
        if(n == 0) return 1;
        int resultado = n * fatorial(n - 1);
        System.out.println("Subindo: " + n + " resultado: " + resultado);
        return resultado;
    }
    public static int fibonnaci(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;
        int resultado = fibonnaci(n - 1) + fibonnaci(n - 2);
        System.out.println(resultado);
        return resultado;
    }
    public static int calculoDeArray(int[] n, int indice){
        if (indice == n.length) return 0;
        return n[indice] + calculoDeArray(n, indice + 1);
    }
    public static int[] inverterArray(int[] n, int indice){
        if(indice >= n.length / 2) return n;
        int temp = n[indice];
        n[indice] = n[n.length -1 - indice];
        n[n.length - 1 - indice] = temp;
        return inverterArray(n, indice + 1);
    }
}

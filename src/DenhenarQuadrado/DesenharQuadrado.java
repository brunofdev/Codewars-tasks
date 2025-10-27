package DenhenarQuadrado;

public class DesenharQuadrado {
    public static void desenharQuadrado(int tamanho) {
        char cantoSupEsq = '╔';
        char cantoSupDir = '╗';
        char cantoInfEsq = '╚';
        char cantoInfDir = '╝';
        char linhaHor = '═';
        char linhaVer = '║';
        char miolo = ' ';

        for (int linha = 0; linha < tamanho; linha++) {
            for (int coluna = 0; coluna < tamanho; coluna++) {

                if (linha == 0 && coluna == 0) { // Canto Superior Esquerdo
                    System.out.print(cantoSupEsq);
                } else if (linha == 0 && coluna == tamanho - 1) { // Canto Superior Direito
                    System.out.print(cantoSupDir);
                } else if (linha == tamanho - 1 && coluna == 0) { // Canto Inferior Esquerdo
                    System.out.print(cantoInfEsq);
                } else if (linha == tamanho - 1 && coluna == tamanho - 1) { // Canto Inferior Direito
                    System.out.print(cantoInfDir);
                } else if (linha == 0 || linha == tamanho - 1) { // Linhas Horizontais (Teto/Chão)
                    System.out.print(linhaHor);
                    System.out.print(linhaHor);
                    System.out.print(linhaHor);
                    System.out.print(linhaHor);
                } else if (coluna == 0 || coluna == tamanho - 1) { // Linhas Verticais (Paredes)
                    System.out.print(linhaVer);
                } else { // Miolo
                    System.out.print(miolo);
                    System.out.print(miolo);
                    System.out.print(miolo);
                    System.out.print(miolo);
                }
            }
            System.out.println();
        }
    }
}

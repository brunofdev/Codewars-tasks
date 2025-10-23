package WhoLikesIt;

import java.util.Arrays;

public class Wholikeit {


    /**
     * Este metodo recebe uma lista de nomes e retorna uma String formatada
     * para mostrar mensagem em algum local
     */
    public static String whoLikesIt(String[] names) {
        int n = names.length;
        switch (n) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + (n - 2) + " others like this";
        }
    }
}



package RgbToHex;


        /**
         * Aqui está a tradução:
         *
         * A função rgb está incompleta. Complete-a para que,
         * ao passar valores decimais RGB, resulte em uma representação
         * hexadecimal sendo retornada. Valores decimais válidos para RGB
         * são de 0 a 255. Quaisquer valores que fiquem fora desse intervalo
         * devem ser arredondados para o valor válido mais próximo.
         *
         * Observação: Sua resposta deve sempre ter 6 caracteres de comprimento,
         * a forma abreviada com 3 não funcionará aqui.
         *
         * 255, 255, 255 --> "FFFFFF"
         * 255, 255, 300 --> "FFFFFF"
         * 0, 0, 0       --> "000000"
         * 148, 0, 211   --> "9400D3"
        **/
//solução que eu fiz
public class RgbToHex {
    public static String rgb(int r, int g, int b){
        return String.format(convertToHex(r) + convertToHex(g) + convertToHex(b)).toUpperCase();
    }

    public static String convertToHex(int x){
        x = Math.max(0, Math.min(255, x));
        int firstDigit = x / 16;
        int secundDigit = x % 16;
        return  String.valueOf(Character.forDigit(firstDigit, 16)) + Character.forDigit(secundDigit, 16);
    }

    //uma solução um pouco mais elegante encontrada no coderwars
    public static String rgb2(int r, int g, int b){
        return String.format("%02X%02X%02X", verifyNumber(r) , verifyNumber(g), verifyNumber(b));
    }
    public static int verifyNumber(int number){
        return Math.max(0, Math.min(255, number));
    }

}

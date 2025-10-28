package RgbToHex;

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

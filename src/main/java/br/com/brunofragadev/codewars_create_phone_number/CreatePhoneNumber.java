package br.com.brunofragadev.codewars_create_phone_number;

/**
 *
 *
 */

//Minha solução
public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers){
        verify(numbers);
        char[] chars = numberToChar(numbers);
        return String.format("(%c%c%c) %c%c%c-%c%c%c%c", chars[0],chars[1],chars[2],chars[3],chars[4],chars[5],chars[6],chars[7],chars[8],chars[9]);
    }

    public static char[] numberToChar (int[] numbers){
        char[] chars = new char[numbers.length];
        for(int i = 0; i < numbers.length; i++ ){
            chars[i] = (char) (numbers[i] + '0');
        }
        return chars;
    }

    public static void verify(int[] numbers){
        if (numbers.length != 10){
            throw new RuntimeException("Array length need to be 10");
        }
    }

    //SOLU�?�fO ELEGANTE E DIRETA ENCONTRADA NO CODEWARS:
    public class createPhoneNumber2 {
        public static String createPhoneNumber(int[] numbers) {
            return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
        }
    }
}

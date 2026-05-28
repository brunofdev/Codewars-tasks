package br.com.brunofragadev.codewars_mascara_de_cpf;

public class MascaraDeCpf {

    public static String mascararCpf(String cpf){
        verificarSeCpfSoPossuiNumeros(cpf);
        String cpfLimpo = cpf.replaceAll("[^0-9]", "");
        if(cpfLimpo.length() != 11)  {
            throw new RuntimeException("Cpf com mais de 11 digitos informados");
        };
        return formataPara11DigitosRecebidos(cpfLimpo);
    }

    private static void verificarSeCpfSoPossuiNumeros(String cpf){
        if(cpf.matches("[0-9]+")){
            return;
        }else {
            throw new RuntimeException("Cpf invalido");
        }
    }
    private static  String formataPara11DigitosRecebidos(String cpf) {
        StringBuilder s = new StringBuilder(cpf);
        s.replace(2, 9, "X.XXX.XXX-");
        return s.toString();
    }
}

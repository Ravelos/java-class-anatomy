package edu.oswaldo.firstweek;

public class FormatCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23456853");
            System.out.println(cepFormatado);
        }
        catch (CepException e){
            System.out.println("Cep is not in correct format");
        }

    }
    static String formatarCep(String cep) throws CepException{
        if(cep.length() != 8)
            throw new CepException();

        //simulando um cep formatado
        return "23.765-064";
    }
}

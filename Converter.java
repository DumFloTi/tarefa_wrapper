/**
 * Ler da Console com o Scanner, converter o valor Primitivo em Wrapper
 */

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        // Criar um Scanner para ler o valor
        Scanner scanner = new Scanner(System.in);
        
        // Ler valor do console e armazenar em um tipo Primitivo (int)
        System.out.print("Digite um número inteiro: ");
        int valorPrimitivoInt = scanner.nextInt();
        
        // Converter o valor Primitivo para um Wrapper (Integer)
        Integer valorWrapper = Integer.valueOf(valorPrimitivoInt);

        // Converter o valor Primitivo para um Wrapper (Long)
        Long valorWrapperLong = Long.valueOf(valorPrimitivoInt);

        // Converter o valor Primitivo para um Wrapper (Double)
        Double valorWrapperDouble = Double.valueOf(valorPrimitivoInt);
        
        // Mostrar o valor do Wrapper Interger
        System.out.println("O valor do wrapper Integer é: " + valorWrapper);

        // Mostrar o valor do Wrapper Long
        System.out.println("O valor do wrapper Long é: " + valorWrapperLong);

        // Mostrar o valor do Wrapper Double
        System.out.println("O valor do wrapper Double é: " + valorWrapperDouble);

        /**
         * Fiz de curiosidade a conversão do primitivo em outro primitivo
        
        // Converter o valor Primitivo para um Wrapper (Integer)
        double valorDouble = (double) valorPrimitivoInt;

        // Mostrar o valor do double
        System.out.println("O valor do double é: " + valorDouble);
        */

        // Fechar o Scanner
        scanner.close();
    }
}

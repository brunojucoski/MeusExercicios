import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        try {

            System.out.println("Informe o primeiro numero: ");
            int x = scan.nextInt();
            System.out.println("Informe o segundo numero operador: ");
            int y = scan.nextInt();
            double divisao = x/y;
            double multiplicacao = x*y;
            double soma = x+y;
            double subtracao = x-y;

            System.out.println( " O resultado da divisao do primeiro numero pelo segundo é :" + divisao);
            System.out.println(" O resultado da multiplicação do primeiro numero pelo segundo é : " + multiplicacao);
            System.out.println( " O resultado da soma entre o primeiro numero e o segundo é " + soma);
            System.out.println( " O resultado da subtração entre o primeiro numero e o segundo é " + subtracao);



        } catch (ArithmeticException e) {
            System.out.println("Erro: ArithmeticException - Divisão por zero não é permitida.");
        }


    }
}

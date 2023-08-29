import java.util.ArrayList;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        ArrayList<Integer> listaPares = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        int i;
        int menor = 9999999;
        int maior = 0;
        int somaMedia = 0;
        for (i=0; i<10;i++) {
            System.out.println("Digite um número: ");
            int x = scanner.nextInt();
            somaMedia += x;
            if (x <= menor) {
                menor = x;}
            else if (x >= maior) {
                maior = x;}

            if (x % 2 ==0) {
                listaPares.add(x);
            }
        }


        int media = somaMedia / 10;
        System.out.println(" O número maior é " + maior);
        System.out.println(" O número menor é " + menor);
        System.out.println("A média entre todos os numeros é " + media);
        System.out.println("Os numeros pares sâo os seguintes: " + listaPares);

    }
}
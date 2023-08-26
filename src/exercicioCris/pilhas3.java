package exercicioCris;

import java.util.Scanner;
import java.util.Stack;

public class pilhas3 {

    public static void main(String[] args) {
        Stack<Integer> P1 = new Stack<Integer>();
        Stack<Integer> P2 = new Stack<Integer>();
        Scanner scan = new Scanner(System.in);
        char continuar = 's' ;

        for (int i=0;continuar!= 'n' ; i++) {
            System.out.println("insira um valor inteiro para preencher a pilha P!: ");
            int x = scan.nextInt();
            P1.push(x);
            System.out.println( " Deseja informar mais um nuemro? : ");
            continuar = scan.next().charAt(0);
        }

        for (int i=0; i<5; i++) {
            System.out.println("insira um valor inteiro para preencher a pilha P2: ");
            int y = scan.nextInt();
            P2.push(y);
            System.out.println(" Deseja informar mais um numero?: ");
            continuar = scan.next().charAt(0);
        }









    }
}

import java.util.Scanner;
import java.util.Stack;

public class pilhas2 {

    public static void main(String[] args) {
        Stack<Integer> P1 = new Stack<Integer>();
        Stack<Integer> P2 = new Stack<Integer>();
        Stack<Integer> P3 = new Stack<Integer>();
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            System.out.println("insira um valor inteiro: ");
            int x = scan.nextInt();
            P1.push(x);
        }
        System.out.println("A pilha P1 original contem os valores de: ");
        System.out.println(P1);

        while (!P1.isEmpty()){
            P2.push(P1.pop());
        }

        while (!P2.isEmpty()){
            P3.push(P2.pop());
        }

        while (!P3.isEmpty()){
            P1.push(P3.pop());
        }

        System.out.println(" Os valores invertidos da P1 são: ");
        System.out.println(P1);



        }


    }


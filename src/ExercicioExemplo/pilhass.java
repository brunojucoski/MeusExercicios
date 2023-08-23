import java.util.Scanner;
import java.util.Stack;

public class pilhass {
    public static void main(String[] args) {
        Stack<Integer> P1 = new Stack<Integer>();
        Stack<Integer> P2 = new Stack<Integer>();
        Stack<Integer> Ptemp = new Stack<Integer>();
        Scanner scan = new Scanner(System.in);



        for (int i = 0; i < 5; i++) {
            System.out.println(" informe um valor inteiro: ");
            int x = scan.nextInt();
            P1.push(x);
        }


        while (!P1.isEmpty()){
            Ptemp.push(P1.pop());

        }

       while (!Ptemp.isEmpty()){
           int numero = Ptemp.pop();
           P1.push(numero);
           P2.push(numero);


       }
        System.out.println(" A pilha P1 tem os valores: ");
        System.out.println(P1);
        System.out.println("A pilha P2 também contém os valores: ");
        System.out.println(P2);



    }
}

package exercicioCris;
import com.sun.jdi.connect.spi.TransportService;
import com.sun.source.tree.CatchTree;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class callcenter {

    public static void main(String[] args) {
        int x = 0;
        Queue<String> nome = new LinkedList<>();
        Queue<String> telefone = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while ( x != 3) {
            System.out.println("Como posso ajudar? \n 1 - Cadastrar novo contato na fila. \n 2- Informar próximo contato a ser atendido. \n 3- Encerrar o atendimento ");
            x = scanner.nextInt();
            if (x == 1) {
                System.out.println(" Informe seu nome completo: ");
                String nomecompleto = scanner.next();
                nome.add(nomecompleto);

                System.out.println(" Informe um numero de telefone para contato: ");
                String numero = scanner.next();
                telefone.add(numero);

            } else if (x == 2) {
                    System.out.println(" O próximo contato da fila a ser atendido é : ");
                    System.out.println(" Nome: " + nome.peek());
                    System.out.println(" Telefone: " + telefone.peek());
                    nome.remove();
                    telefone.remove();
                }


            }


        }
    }


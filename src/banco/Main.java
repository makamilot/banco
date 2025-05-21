package banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();


        int opcao;
        do {
            System.out.println("MENU BANCÁRIO");
            System.out.println("-------------------");
            System.out.println("[1] Criar cliente");
            System.out.println("[2] Criar conta");
            System.out.println("[3] Depositar");
            System.out.println("[4] Sacar");
            System.out.println("[5] Transferir");
            System.out.println("[6] Consultar conta");
            System.out.println("[0] Sair");
            System.out.print("ESCOLHA UMA DAS OPÇÕES ACIMA: ");
            opcao = sc.nextInt();
            sc.nextLine();

             switch (opcao) {
                 case 1:
                     System.out.print("Digite o NOME do cliente: ");
                     String nomeCliente = sc.next();

                     System.out.print("Digite o CPF do cliente: ");
                     String cpfCliente = sc.next();

                     System.out.print("Digite o EMAIL do cliente: ");
                     String emailCliente = sc.next();

                     System.out.print("Digite a IDADE do cliente: ");
                     int idadeCliente = sc.nextInt();
                     sc.nextLine();

                     clientes.add(new Cliente(nomeCliente, cpfCliente, emailCliente, idadeCliente));
                     break;
             }
        } while (opcao != 0);
        System.out.println("---------------");
        System.out.println("Lista de clientes: ");
        for (Cliente c : clientes) {
            System.out.println("---------------");
            c.exibirCliente();
        }
    }
}

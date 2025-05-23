package banco;

import java.util.ArrayList;
import java.util.HashMap;

public class SistemaCliente {
    private HashMap<String, Conta> contas = new HashMap<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(String cpf, String nome, String email, int idade) {
        Cliente cliente = new Cliente(nome, cpf, email, idade);
        clientes.add(cliente);

        Conta conta = new Conta(cpf, cliente);
        contas.put(cpf, conta);
    }
    public void listarContas() {
        for(String cpf : contas.keySet()) {
            Conta conta = contas.get(cpf);
            Cliente cliente = conta.getCliente();

            System.out.println("====CONTA====");
            System.out.println("NOME: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("EMAIL: " + cliente.getEmail());
            System.out.println("IDADE: " + cliente.getIdade());
            System.out.println("NÚMERO DA CONTA: " + conta.getNumeroConta());
            System.out.println("SALDO R$ " + conta.getSaldo());
        }
    }
}

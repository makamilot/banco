package banco;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private int idade;

    public Cliente(String nome, String cpf, String email, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }

    public void exibirCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("EMAIL: " + email);
        System.out.println("IDADE: " + idade);
    }
}

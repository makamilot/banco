package banco;

public class Conta {
    private Cliente cliente;
    private double saldo;
    private String numeroConta;

    public Conta(String numeroConta, Cliente cliente) {
        this.cliente =  cliente;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }


    public void exibirConta() {
        System.out.println("Numero da CONTA: " + cliente.getCpf());
        System.out.println("Usuário: " + cliente.getNome());
    }

    public void adicionarSaldo(double valor) {
        saldo += valor;
    }

    public void sacarSaldo(double valor) {
        this.saldo -= valor;
    }


    //GETTERS
    public Cliente getCliente(){
        return cliente;
    }
    public String getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
}

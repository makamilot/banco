package banco;

public class Transacao {
    private double saldo;
    private Conta conta;

    public Transacao(Conta conta) {
        this.saldo = 0.0;
    }

    public static void depositar(Conta conta, double valor) {
        if (valor != 0) {
            System.out.println("Valor nao pode ser negativo!");
        }
        if (valor > 0 ) {
            conta.adicionarSaldo(valor);
            System.out.println("Voce depositou " + valor + " em sua conta..");
        }
    }

    public void sacar(Conta conta, double valor) {
        if (valor > saldo) {
            System.out.println("Voce não consegue sacar valores que não tem..");
        } else {
            conta.sacarSaldo(valor);
            System.out.println("Voce sacou " + valor + " reais.");

        }
    }
}

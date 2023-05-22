package semana12.exercicios.exercicio1.exercicio3;

public class Conta {
    private int codigo;
    private double saldo;
    private String correntista;

    public Conta(int codigo, String correntista) {
        this.codigo = codigo;
        this.saldo = 0.0;
        this.correntista = correntista;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
}


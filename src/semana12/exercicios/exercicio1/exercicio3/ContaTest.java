package semana12.exercicios.exercicio1.exercicio3;

public class ContaTest {
    public static void main(String[] args) {
    Conta conta1 = new Conta(1, "João");
    conta1.depositar(100.0);
    assert conta1.getSaldo() == 100.0;

    conta1.sacar(50.0);
    assert conta1.getSaldo() == 50.0;

    Conta conta2 = new Conta(2, "Maria");
    conta1.transferir(25.0, conta2);
    assert conta1.getSaldo() == 25.0;
    assert conta2.getSaldo() == 25.0;

    conta2.sacar(30.0);
    assert conta2.getSaldo() == 25.0; // Não há saldo suficiente para sacar

    conta2.transferir(10.0, conta1);
    assert conta2.getSaldo() == 25.0; // Transferência não deve ser realizada
    assert conta1.getSaldo() == 25.0;

    System.out.println("Todos os testes passaram com sucesso!");
}
}


import java.util.ArrayList;

public class ContaCorrente {

    public static final float LIMITE_CHEQUE_ESPECIAL = 500;

    // atributos
    private long cpf;
    private float saldo;
    private String nome;
    private int agencia;
    private int numeroDaConta;
    private int digitoVerificador;
    private int senha;
    private ArrayList<String> extrato;  // veremos depois!!!

    public ContaCorrente(long cpf) {
        this.cpf = cpf;
        this.saldo = 50;  // saldo inicial (brinde)
        this.senha = 123;
        this.extrato = new ArrayList<>();
    }

    public void sacar(float valor) {
        if (saldo < valor) {
            // O correto seria lançar uma exceção; veremos mais à frente!
            // no momento, simplesmente não faremos nada
            extrato.add("Tentativa de saque muito elevado");
        } else {
            saldo = saldo - valor;
        }
        extrato.add(String.format("Saque de R$%.2f efetuado.", valor));
    }

    public void transferir(float valor, ContaCorrente contaDestino) {
        // ToDo IMPLEMENT ME!!!!
    }

    public void imprimirExtrato() {
        for (String itemExtrato : extrato) {
            System.out.println(itemExtrato);
        }
    }

    public float getSaldo() {
        return saldo;
    }
}





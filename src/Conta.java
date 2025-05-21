import java.util.ArrayList;
import java.util.List;

abstract class Conta implements iConta {

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<String> historico = new ArrayList<>();

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void registrarHistorico(String evento) {
        historico.add(evento);
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        } else {
            saldo -= valor;
            registrarHistorico("Saque: R$" + valor);
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        registrarHistorico("Depósito: R$" + valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência de R$" + valor);
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
            registrarHistorico("Transferência enviada: R$" + valor + " para conta " + contaDestino.getNumero());
            contaDestino.registrarHistorico("Transferência recebida: R$" + valor + " da conta " + this.getNumero());
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println("---- Extrato Conta ----");
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.printf("Saldo: R$%.2f\n", this.saldo);
    }

    public void imprimirHistorico() {
        System.out.println("=== Histórico de Transações ===");
        for (String evento : historico) {
            System.out.println(evento);
        }
    }

    @Override
    public void imprimirExtrato() {
        imprimirInfosComuns();
        imprimirHistorico();
    }
}
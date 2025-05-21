class ContaPoupanca extends Conta {

    private static final int LIMITE_SAQUES = 3;
    private int saquesRealizados = 0;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (saquesRealizados >= LIMITE_SAQUES) {
            System.out.println("Limite de saques diários atingido.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
            return;
        }
        saldo -= valor;
        saquesRealizados++;
        registrarHistorico("Saque: R$" + valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
        System.out.println("Saques realizados hoje: " + saquesRealizados + "/" + LIMITE_SAQUES);
    }

    public void resetSaques() {
        saquesRealizados = 0;
    }
}
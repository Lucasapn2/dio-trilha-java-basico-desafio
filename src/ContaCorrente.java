class ContaCorrente extends Conta {

    private static final double TAXA_SAQUE = 0.50;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;
        if (valorComTaxa > saldo) {
            System.out.println("Saldo insuficiente para saque de R$" + valor + " + taxa de R$" + TAXA_SAQUE);
        } else {
            saldo -= valorComTaxa;
            registrarHistorico("Saque: R$" + valor + " + taxa: R$" + TAXA_SAQUE);
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}
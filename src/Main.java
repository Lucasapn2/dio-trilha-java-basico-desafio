public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Lucas Ferreira");
        Cliente cliente2 = new Cliente("Ana Silva");

        ContaCorrente contaCorrente = new ContaCorrente(cliente1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2);

        contaCorrente.depositar(1000);
        contaCorrente.sacar(100);
        contaCorrente.transferir(200, contaPoupanca);
        contaCorrente.imprimirExtrato();

        System.out.println();

        contaPoupanca.imprimirExtrato();
        contaPoupanca.sacar(50);
        contaPoupanca.sacar(50);
        contaPoupanca.sacar(50);
        contaPoupanca.sacar(50);
        contaPoupanca.imprimirExtrato();

    }
}
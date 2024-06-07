public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Imprimindo extrato da conta poupança, por favor, aguarde...");
        super.imprimirInfosCommuns();
    }
}

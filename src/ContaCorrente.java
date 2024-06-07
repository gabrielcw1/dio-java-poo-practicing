public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Imprimindo extrato da conta corrente, por favor, aguarde... ===");
        super.imprimirInfosCommuns();
    }
}

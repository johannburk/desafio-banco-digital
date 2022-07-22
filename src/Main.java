public class Main {
    public static void main(String[] args) {
        Cliente johann = new Cliente();
        johann.setNome("Johann");

        Conta cc = new ContaCorrente(johann);
        Conta poupanca = new ContaPoupanca(johann);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

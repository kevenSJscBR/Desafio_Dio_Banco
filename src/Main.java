public class Main {

    public static void main(String[] args) {

        Cliente keven = new Cliente();
        keven.setNome("Keven Martins");
        Conta cc = new ContaCorrente(keven);
        Conta poupanca = new ContaPoupanca(keven);
        cc.depositar(1000);
        cc.transferir(750, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}

public class Main {

    public static void main(String[] args) {

        Cliente wander = new Cliente();
        wander.setNome("Wander Matheus");

        Conta cc = new ContaCorrente(wander);
        Conta poupanca = new ContaPoupanca(wander);

        cc.depositar(10);
        cc.imprimirExtrato();
        cc.transferir(10, poupanca);
        poupanca.imprimirExtrato();
        cc.imprimirExtrato();
    }
}

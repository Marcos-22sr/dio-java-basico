public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("Marcos souza");
        cliente.setCPF("199.777.666.62");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(1000);
        poupanca.depositar(10000);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
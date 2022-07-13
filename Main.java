public class Main {

  public static void main(String[] args) {
    Cliente Marcel = new Cliente();
    Marcel.setNome('Marcel');
    
    Conta cc  = new ContaCorrente(Marcel);
    Conta cp = new ContaPoupanca(Marcel);

    cc.depositar(100);
    cc.transferir(50, cp);

    cc.imprimirExtrato();
    cp.imprimirExtrato();
  }
}
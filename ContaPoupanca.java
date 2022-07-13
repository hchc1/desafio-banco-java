public class ContaPoupanca extends Conta {

  public ContaCorrente(Cliente cliente) {
    super(cliente);
  }
  
  @Override
  public void imprimirExtrato() {
    System.out.println("******* Extrato Conta Poupança ******");
    super.infosConta();
  }
}
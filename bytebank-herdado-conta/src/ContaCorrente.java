

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	//valor de tributação da Conta Corrente atual em %
	private double TributoDaCC = 0.01;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	@Override
	public double getValorImposto() {	
		return super.saldo * TributoDaCC;
	}
	
}

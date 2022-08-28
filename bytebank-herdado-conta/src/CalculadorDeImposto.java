
public class CalculadorDeImposto {
	
	private double totalImposto;
	
	//método pra registrar e calcular a tributação
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	//método que retorna o valor da tributação
	public double getTotalImposto() {
		return totalImposto;
	}

}

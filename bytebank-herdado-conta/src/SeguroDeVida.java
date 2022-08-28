
public class SeguroDeVida implements Tributavel {

	//valor do seguro em R$
	private double ValorDoSeguro = 42;
	@Override
	public double getValorImposto() {
		return ValorDoSeguro;
	}

}

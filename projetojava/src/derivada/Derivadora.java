package derivada;

public class Derivadora {

	
	public static void main(String[] args) {
		Funcao derivada_da_reta= calcularDerivada(new Reta());
		System.out.println(derivada_da_reta.calcular(1));
		System.out.println(derivada_da_reta.calcular(2));
		
		Funcao derivada_da_parabola= calcularDerivada(new Parabola());
		System.out.println(derivada_da_parabola.calcular(1));
		System.out.println(derivada_da_parabola.calcular(2));

	}

	private static Funcao calcularDerivada(final Funcao funcao) {
		final double deltaX=0.00000000001;
		return new Funcao() {
			
			@Override
			public double calcular(double x) {
				
				return (funcao.calcular(x+deltaX)-funcao.calcular(x))/deltaX;
			}
		};
	}

}

package calculadora;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora calculadora=new CalculadoraInfixa();
		
		calculadora.adicionarOperacao("+", new Adicao());
		calculadora.obterEntradas();
		double resultado= calculadora.calcular();
		System.out.println("O Resultado "+ resultado);

	}

}

package calculadora;

import java.util.Scanner;

public class CalculadoraInfixa extends Calculadora {

	@Override
	public void obterEntradas() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro operando");
		double op = Double.parseDouble(scanner.next());
		setOp1(op);
		System.out.println("Digite a operação desejada");
		System.out.println("Operacões disponiveis "+operacoesDisponiveis());
		setSinal(scanner.next());
		System.out.println("Digite o segundo operando");
		op = Double.parseDouble(scanner.next());
		setOp2(op);

	}

}

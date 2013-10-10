package calculadora;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class Calculadora {
	private String sinal;
	private double op1;
	private double op2;
	private Map<String, Operacao> operacoes=new HashMap<String, Operacao>();
	
	abstract public void obterEntradas();
	
	public double calcular(){
		Operacao operacaoEscolhida=operacoes.get(this.sinal);
		return operacaoEscolhida.calcular(op1, op2);	
	}
	
	public void adicionarOperacao(String sinal, Operacao operacao){
		operacoes.put(sinal, operacao);
	}
	
	public Set<String> operacoesDisponiveis(){
		return operacoes.keySet();
	}
	
	public void setSinal(String sinal) {
		this.sinal = sinal;
	}

	public void setOp1(double op1) {
		this.op1 = op1;
	}

	public void setOp2(double op2) {
		this.op2 = op2;
	}

}

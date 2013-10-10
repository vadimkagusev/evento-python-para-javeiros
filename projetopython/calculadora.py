class Calculadora():
    def __init__(self):
        self.op1 = None
        self.op2 = None
        self.sinal = None
        self.__operacoes = {}
        
    def calcular(self):
        operacao_escolhida = self.__operacoes.get(self.sinal)
        return operacao_escolhida.calcular(self.op1, self.op2)
    
    def operacoes_disponiveis(self):
        return set(self.__operacoes.keys())
    
    def adicionar_operacao(self, sinal, operacao):
        self.__operacoes[sinal] = operacao
        
    def obter_entradas(self):
        raise NotImplementedError("obter_entradas é abstrato")
    
class CalculadoraInfixa(Calculadora):
    def obter_entradas(self):
        self.op1 = float(input("Insira o primeiro operando: "))
        print("Operaçoes disponiveis: %s" % self.operacoes_disponiveis())
        self.sinal = input("Insira a operacao: ")
        self.op2 = float(input("Insira o segundo operando: "))
        
class Operacao():
    def calcular(self, op1, op2):
        raise NotImplementedError("calcular é abstrato")        
        
        
class Adicao(Operacao):
    def calcular(self, op1, op2):
        return op1+op2
    
class Subtracao():
    def calcular(self, op1, op2):
        return op1-op2   


calculadora = CalculadoraInfixa()
calculadora.adicionar_operacao("+", Adicao()) 
calculadora.adicionar_operacao("-", Subtracao()) 
calculadora.obter_entradas()
print("O restultado é %s" % calculadora.calcular())      
        
        
        
        
        
        
        
        
        
        
        


def calcular_derivada(f):
    def derivada(x):
        delta_x = 0.00000000001
        return (f(x + delta_x) - f(x)) / delta_x
    
    return derivada
        
def reta(x):
    return x

derivada_reta = calcular_derivada(reta)

print(derivada_reta(1))
print(derivada_reta(2))

def parabola(x):
    return x*x

derivada_para=calcular_derivada(parabola)

print(derivada_para(1))
print(derivada_para(2))
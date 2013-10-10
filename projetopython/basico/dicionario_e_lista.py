nomes=["Denis","Giovane","Luciano"]

nomes.append("Renzo")

for i in range(len(nomes)):
    print(nomes[i])
    
print("Imprimir com enumerate")

for indice,valor in enumerate(nomes):
    print("%s: %s"%(indice,valor))
    
sobrenomes=["Costa","Liberato","Ramalho","Nuccitelli"]

pares_ordenados=zip(nomes,sobrenomes)


    
dicionario_de_nomes=dict(pares_ordenados)

for chave,valor in dicionario_de_nomes.items():
    print("O sobrenome do %s é %s"%(chave,valor))
    
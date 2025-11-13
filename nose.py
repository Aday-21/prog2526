lista1 = [10, 20, 30]
lista2 = [10, 20, 30]
lista_c = [30, 20, 10] # Mismos elementos, orden diferente
lista_d = [10, 20]     # Longitud diferente


#TODO: Algoritmo que dice si dos arrays son iguales
def retornar(lista1, lista2):
    #TODO: Comparo la longitud
    n = len(lista1)
    m = len(lista2)
    if n != m:
      return False
    else:
        #TODO: Recorro el array
        for i in range(n):
            if lista1[i] != lista2[i]:
                return False
        return True
    
      
      
      
      
      
      
      
print(retornar(lista1, lista_d))
        
    
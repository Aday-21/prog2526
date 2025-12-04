lista = [1, 2, 3, 4, 5]
suma = 0
for i in range(len(lista)):
    print(i)
    suma = suma + lista[i]
print("La suma total es;", suma)

# Con un for-each

lista = [1, 2, 3, 4, 5]
suma = 0

for elemento in lista:
    suma += elemento
    print(elemento)
print("La suma total es:", suma)

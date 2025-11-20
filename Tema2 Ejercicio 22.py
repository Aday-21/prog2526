matriz = [["A","B","C"],["D","E","F"],["G","H","I"]]
for fila in matriz:
    for letra in fila:
        print(letra,end=" ")
    
fila = 0
columna = 0
while columna < len(matriz[0]):
    fila = 0
    while fila < len(matriz):
        print(matriz[fila][columna])
        fila = fila + 1
    columna = columna + 1
    
for i in range(len(matriz)):
    for j in range(len(matriz[i])):
        print(matriz[j][i])
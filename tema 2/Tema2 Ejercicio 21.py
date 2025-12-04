# Array filas y columnas
matriz = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
none = 0

print(matriz)
print(matriz[1][2])
print(matriz[1][1])
print("--------------------------------------------------------------")
for i in matriz[1]:
    print(i)
    
print("--------------------------------------------------------------")
for fila in matriz:
    for elemento in fila:
        print(elemento, end=" ")
    print()
    
print("--------------------------------------------------------------")
m2 = [[0,0,0],[0,0,0],[0,0,0]]

for i in range(len(matriz)):
    for e in range(len(matriz[i])):
        if matriz[i][e] % 2 == 0:
            m2[i][e] = matriz[i][e]
            matriz[i][e] = none
            

print("matriz: ")
for fila in matriz:
    print(fila)
print("m2: ")
for fila in m2:
    print(fila)
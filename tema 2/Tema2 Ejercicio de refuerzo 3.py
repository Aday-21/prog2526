precios = [12.50, 45.99, 5.00, 22.75, 10.00]

# Primera parte
# Bucle para recorrer el array

for e in precios:
    print(e)
    
print("-----------------------------------------------------------------------")

# Segunda parte

for i in range(len(precios)):
    print(i)
    print(precios[i])

print("-----------------------------------------------------------------------")

# Tercera parte
suma = 0
for i in precios:
    suma = suma + i
    print(suma)

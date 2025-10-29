# Definimos variables
numero = int(input("Introduce un número; "))
factorial = 1
# Bucle for para calcular una división
for i in range(1, numero + 1):
    factorial = factorial * i
print(f"El resultado de {numero}! = {factorial}")

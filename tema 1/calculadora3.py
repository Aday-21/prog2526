# Sirve para importar la funcion math.pow
import math

print("Operaciones disponibles")
print("- Suma")
print("- Resta")
print("- Multiplicación")
print("- División")
print("- Raiz Cuadrada")
print("- Potencia")
# Definimos variables
op = input("Introduce la operación que quieras hacer; ")
# Depèndiendo de lo que el usuario introduzca hace una operacion u otra
if op == "Suma":
    x = int(input("Introduce un valor; "))
    y = int(input("Introduce un valor; "))
    suma = x + y
    print("El resultado es; ", suma)

elif op == "Resta":
    x = int(input("Introduce un valor; "))
    y = int(input("Introduce un valor; "))
    resta = x - y
    print("El resultado es; ", resta)

elif op == "Multiplicación":
    x = int(input("Introduce un valor; "))
    y = int(input("Introduce un valor; "))
    Multiplicación = x * y
    print("El resultado es; ", Multiplicación)

elif op == "División":
    x = int(input("Introduce un valor; "))
    y = int(input("Introduce un valor; "))
    división = x / y
    print("El resultado es; ", división)

elif op == "Raiz Cuadrada":
    x = int(input("Introduce un valor; "))
    raiz = math.sqrt(x)
    print(f"El resultado es; ", raiz)
    

elif op == "Potencia":
    x = int(input("Introduce un valor; "))
    y = int(input("Introduce un valor; "))
    # math.pow sirve para hacer potencias
    potencia1 = math.pow(x, y)
    print("El resultado es; ", potencia1)

else:
    print("No se puede hacer nada")

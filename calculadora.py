x = int(input("Introduce un valor; "))
y = int(input("Introduce un valor; "))
op = input("Introduce la operación que quieras hacer; ")

if op == "Suma":
    suma = x + y
    print("El resultado es; ", suma)

elif op == "Resta":
    resta = x - y
    print("El resultado es; ", resta)

elif op == "Multiplicación":
    Multiplicación = x * y
    print("El resultado es; ", Multiplicación)

elif op == "División":
    división = x / y
    print("El resultado es; ", división)

else:
    print("No se puede hacer nada")

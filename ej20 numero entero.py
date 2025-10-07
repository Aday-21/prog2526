numero = int(input("Introduce un número entero positivo: "))

if numero > 0:
    i = 1
    while i <= numero:
        print(i)
        i += 1
else:
    print("El número no es positivo.")

# Creamos una funcion
def par_impar(num):
    if num % 2 == 0:
        print("El número es par.")
    else:
        print("El número es impar")
    return num

# Definimos variable
num = int(input("Introduce un numero; "))
# Llamamos la funcion
print(par_impar(num))



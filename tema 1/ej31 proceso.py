# Creamos funcion
def par_impar(num):
    if num % 2 == 0:
        print("El número es par.")
    else:
        print("El número es impar")
    
# Definimos variables
num = int(input("Introduce un numero; "))
# Llamamos a la funcion
print(par_impar(num))

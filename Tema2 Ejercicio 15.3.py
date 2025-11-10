# Definimos la función
def localizador(lista, a):
    posicion = "-1"  # Valor por defecto
    for i in range(len(lista)):
        if lista[i] == a:
            posicion = f"Está en la posición {i}"
    return posicion

# Lista 
lista = [1, 9, 2, 8, 3, 7, 4, 6, 5, 10]

# El usuario introduce un numero
a = int(input("Dime un número del 1 al 10 para encontrar su posición: "))

# Llamada a la función 
print(localizador(lista, a))

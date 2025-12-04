# Definimos cantidad
cantidad = int(input("¿Cuántos números desea introducir? "))

# Lo que hace es que en funcion del numero que introduce el usuario crea un array con esos espacios
numero = [0] * cantidad

# Para llenar el array de datos
for i in range (cantidad):
    numero[i] = int(input("Introduce un número entero; "))
    
# para que los muestre de orden inverso
#print("Los números en orden inverso son: ")
#for i in range(len(numero) - 1,-1,-1):
 #   print(numero[i])
#print("--------------------------------------------------------------------------------------------------------------------")
# para que muestre de orden inverso
#i = len(numero) - 1
#while i >= 0:
 #   print(numero[i])
  #  i = i - 1
#print("--------------------------------------------------------------------------------------------------------------------")
#for i in range(len(numero)):
 #   if i % 2 == 0:
  #      print(i)
 
# Imprime los numeros pares
b = []
for i in range (2,11,2):
    b.append(i)
print(b)
    
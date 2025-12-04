inventario = ["Manzanas", "Plátanos", "Naranjas", "Peras"]

# Añadimos a el array dos valores con .append
inventario.append("Uvas")
inventario.append("Kiwi")
    
print(inventario)

print("<<------------------------------------------------------------------------------------------------------------------------------->>")
# Unimos las dos arrays en una sola con .extend
melones = ["Melón"]

inventario.extend(melones)

print(inventario)

print("<<------------------------------------------------------------------------------------------------------------------------------->>")

# Añadimos en la posición que queramos con .insert(posicion, )
inventario.insert(2, "Plátanos frescos")

print(inventario)

print("<<------------------------------------------------------------------------------------------------------------------------------->>")

# Para eliminar un elemento del array .pop(-1) -1 para empezar por el final

producto_vendido = inventario.pop(-1)

print(producto_vendido)

print("<<------------------------------------------------------------------------------------------------------------------------------->>")

# Para eliminar un elemento .remove(elemento)

inventario.remove("Peras")

print(inventario)

print("<<------------------------------------------------------------------------------------------------------------------------------->>")

# Recortar 4 primeros

emergencia = inventario[0:4]

print(emergencia)

print("<<------------------------------------------------------------------------------------------------------------------------------->>")



import re

inventario = [(1, "Pera", 5),
              (2, "Manzana", 6),
              (3, "Coco", 7),
              (4, "Platano", 8),
              (5, "Fresa", 9)]

def busca_id(id):
    if id <= len(inventario):
        return(inventario[id-1]) # Restamos 1 para que no cuente el 0 como indice
    else:
        return ("\033[31mError\033[0m")
        
def comparar_stock():
    mayor = inventario[0]
    menor = inventario[0]
    for stock in inventario:
        if stock[2] > mayor[2]:
            mayor = stock
        if stock[2] < menor[2]:
            menor = stock
    return(f"El producto con mas stock: {mayor[1]}\n"
           f"El producto con menos stock: {menor[1]}")


def validacion(nuevo_producto):
    patron = r'^[A-Z] [0-9] \w(5-20)'
    if re.search(nuevo_producto, patron):
        return(f"El producto {nuevo_producto} es \033[32mVALIDO\033[0m, coincide con los requisitos")
    else:
        return(f"El producto {nuevo_producto} \033[31mNO\033[0m es \033[31mVALIDO\033[31m")
    

    

id = int(input("Escribe el ID del producto: "))
print(busca_id(id))
print(comparar_stock())
nuevo_producto = input("Introduzca nuevo producto: ")
print(validacion(nuevo_producto))
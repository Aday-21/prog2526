# Creamos un array inicial
a = [0]*5

for i in range(5):
    # Pedimos 5 numeros decimales al usuario
    a[i] = float(input("Introduzca el número decimal; "))
    print(a[i])
print(a)

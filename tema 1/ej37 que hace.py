# Definimos variables
a = int(input("Introduce un valor mayor que 0; "))
b = int(input("Introduce un valor mayor que 0; "))

# si b es diferente a 0 hace if sino hace else
while b != 0:
    if a > b:
        a = a - b
    else:
        b = b - a 

print(a)

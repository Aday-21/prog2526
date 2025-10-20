a = int(input("Introduce un valor mayor que 0; "))
b = int(input("Introduce un valor mayor que 0; "))

while b != 0:
    if a > b:
        a = a - b
    else:
        b = b - a 

print(a)

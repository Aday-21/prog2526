# Definimos variables
num = int(input("Introduce un número: "))
# Calcula si es primo no el numero que el usuario introduce
if num <= 1:
    print("No es primo")
else:
    es_primo = True
    for i in range(2, num):
        if num % i == 0:
            es_primo = False
            break
    if es_primo:
        print("Es primo")
    else:
        print("No es primo")

# Asignamos valor a "a"
a = 5
if a = 2:
    print ("es primo.")
else:
    i = 2
    while i < a:
        if (a % i == 0):
            print("no es primo")
            break
if i == a - 1:
    print("si primo")
            

# Definimos variables con float para que sean números enteros
a = float(input("Ingresa el primer lado: "))
b = float(input("Ingresa el segundo lado: "))
c = float(input("Ingresa el tercer lado: "))

# Comenzamos el procedimiento if para calcular que tipo de triangulo es
if (a + b > c) and (a + c > b) and (b + c > a):
    if a == b == c:
        print("El triángulo es equilátero.")
    elif a == b or b == c or a == c:
        print("El triángulo es isósceles.")
    else:
        print("El triángulo es escaleno.")
else:
    print("No forman un triángulo.")

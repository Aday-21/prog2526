a = 1
b = int(input("Introduce un numero; "))

while True:
    if a > b:
        break
    elif a == b:
        print(a)
    else:
        print(a,end=", ")
    a += 1
    


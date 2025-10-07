a = 1
b = int(input("Introduce un numero; "))

while True:
    if a < b:
       print(a,end=", ")
    else:
        break
    a += 1
print(a,end=". ")

def busqueda_bin(a, objetivo):
    izq = 0
    der = len(a)
    i = (izq + der) / 2
    
    if a[i] == objetivo:
    
    elif a[i] < objetivo:
        izq = i + 1
    else:
        
    return i



num = [0,10,20,30,40,50,60,70,80,90,100]
objetivo = int(input("Introduzca su numero objetivo; "))
print(busqueda_bin(num, objetivo))
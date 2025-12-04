original = [1,2,3,4,5]
copia1 = original.copy()
copia2 = original[:]
copia3 = []


for x in original:
    copia3.append(x)
    
copia4 = original
copia4.remove(5)

for i in range(len(original)):
    if len(original) != len(copia4):
        print("No son iguales")
    else:
        print("Si son iguales")
        


print(original)
print(copia1)
print(copia2)
print(copia3)
print(copia4)



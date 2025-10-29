# Definimos variable
nota = int(input("Introduce la nota (0-10): "))

#Procedimiento if para calcular la nota
if 0 <= nota <= 4:
    print("Insuficiente")
elif nota == 5:
    print("Suficiente")
elif nota == 6:
    print("Bien")
elif 7 <= nota <= 8:
    print("Notable")
elif 9 <= nota <= 10:
    print("Sobresaliente")
else:
    print("Nota inválida, introduce un número entre 0 y 10.")

# Cuenta cuantas 'a' hay en una frase
# Definir función
def cuentaYreemplazaA(texto):
    cuenta = texto.count("a") + texto.count("A")
    print("Cuantas: ", cuenta)
    nuevoTexto = texto.replace("a", "x")
    nuevoTexto = nuevoTexto.replace("A", "X")
    return nuevoTexto
# Definir función
def cuentaA(texto):
    contar = texto.count("a") + texto.count("A")
    return contar
# Definir funicón
def cuentaYreemplaza(texto):
    cuenta = texto.count("a")+ texto.count("A")+ texto.count("e")+ texto.count("E")+ texto.count("i")+ texto.count("I")+ texto.count("o")+ texto.count("O")+ texto.count("u")+ texto.count("U")
    nuevoTexto = texto.replace("a", "x").replace("A", "x").replace("e", "x").replace("E", "x").replace("i", "x").replace("I", "x").replace("o", "x").replace("O", "x").replace("u", "x").replace("U", "x")
    return nuevoTexto

# invocar a la función

# print(cuentaA(frase))
#print(cuentaYreemplazaA(frase))
texto = input("Introduce una frase; ")
print(cuentaYreemplaza(texto))



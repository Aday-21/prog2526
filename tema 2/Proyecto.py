import random # importamos la funcion ramdom

def contrasenias(password): #definimos la funcion para la contraseña
   while True:
       if len(password) > 8:
           print("!Bienvenidos¡")
           return password
       else:
           print("Contraseña no válida")
           password = input("Introduce una contraseña válida; ")

password = input("Introduce una contraseña: ") # pedimos al usuario que introduzca la contraseña

if contrasenias(password) == "adaydavid": # hacemos un if y llamamos a la funcion para la contraseña
    # si la contraseña es correcta entra en un juego
    opciones = ["piedra", "papel", "tijeras"] # Definimos el array

    usuario = input("Elige piedra, papel o tijeras: ").lower() # decimos al usuario que elija una opcion
    ordenador = random.choice(opciones) # pedimos que el ordenador elija una opcion aleatoria también

    print("El ordenador eligió:", ordenador) # imprime por pantalla lo que a elegido el ordenador

    if usuario == computadora: # son condiciones que ocurriran si elegimos una opcion  y el ordenador otra
        print("Empate")
    elif usuario == "piedra" and computadora == "tijeras":
        print("Ganaste")
    elif usuario == "papel" and computadora == "piedra":
        print("Ganaste")
    elif usuario == "tijeras" and computadora == "papel":
        print("Ganaste")
    else:
            print("Perdiste")
else:print("Adios")

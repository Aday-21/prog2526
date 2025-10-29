import random

def contrasenias(password):
   while True:
       if len(password) > 8:
           print("!Bienvenidos¡")
           return password
       else:
           print("Contraseña no válida")
           password = input("Introduce una contraseña válida; ")

password = input("Introduce una contraseña: ")

if contrasenias(password) == "adaydavid":
    opciones = ["piedra", "papel", "tijeras"]

    usuario = input("Elige piedra, papel o tijeras: ").lower()
    ordenador = random.choice(opciones)

    print("El ordenador eligió:", ordenador)

    if usuario == computadora:
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






#password = "adaydavid"

#psswd = input("Introduce la contraseña; ")

#while True:

#   if password == psswd:

 #      print("!Bienvenidos¡")

  #     break

   #else:

    #   print("Contraseña no válida")

     #  psswd = input("Introduce la contraseña; ")

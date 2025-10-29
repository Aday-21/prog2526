# Definimos el array
sueldos = [1000,1500,2000,2500,3000]

# Hacemos unu bucle for
# Con la variable i la utilizamos de contador
# para añadir el 10% a todos los datos del array

for i in range(len(sueldos)):
    sueldos[i] = (sueldos[i] * 0.1) + sueldos[i]
print(sueldos)

    

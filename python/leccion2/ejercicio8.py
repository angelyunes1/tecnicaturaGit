#ciclo While

#ejercicio 8
"""
#imprimir numeros del 0 al 5 con el ciclo while
maximo=5
contador=0
while contador <= maximo:
    print(contador)
    contador += 1
"""
#ejercicio 9
# imprimir numeros del 5 al 0 con el ciclo while
"""
minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -= 1
"""


# Ciclo For

"""
cadena = "hello"
for letra in cadena:
    print(letra)
else:
    print("fin del ciclo for")
"""

#palabra reservada break (rompe o termina el programa)
"""
for letra in "Alemania":
    if letra == "a":
        print(f"letra encotrada: {letra}")
        break
else:
    print("fin del ciclo for")
"""
#palabra reservada continue
for i in range (6):
    if i % 2 == 0:
        print(f'valor: {i}')
for i in range (6):
    if i % 2 != 0:
        continue
    print(f"valor: {i}")

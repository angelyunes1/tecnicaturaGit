"""
Ejercicio 7 : Adivina el numero
Realizar un juego para adivinar un numer. Para ello se debe generar un numero aleatorio (N)entre 1 - 10, luego
ir pidiendo numeros indicando " es mayor" ,"es menor" segun sea el caso con respecto a N. El proceso terminara cuando el
usuario acierta y se indicara el numero de intentos
"""
import random
print("\t.:Juego ADIVINA EL NUMERO:.")
aleatorio = random.randint(0,100) #toma del 0 al 100 Literal, generamos un numero aleatorio
contador = 0
while True:
    numero = int(input("Digite un numero: "))
    contador += 1
    if numero > aleatorio:
        print("\t No es el numero,ingrese un numero menor")
    elif numero < aleatorio:
        print("\t No es el numero,ingrese un numero mayor")
    else:
        print(f"FELICIDADES!!!, acabas de adivinar el numero {aleatorio} ")
        break # rompe el ciclo y el bucle
print(f"\n Numero de intentos: {contador}")

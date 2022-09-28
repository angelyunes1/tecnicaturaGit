"""
Ejericio 03: Funcion recursiva
Imprimir numeros  de 5 a 1  de manera descendente usando funciones recursivas
puede ser cualquier valor positivo
Por eje. si pasamos el valor 5 debe imprimir
5
4
3
2
1
En caso de ser el numero 3 debe Imprimir
3
2
1
Si se intruduce numeros negativo o el 0 no imprime nada

"""

def imprimir_numero_recursivo(numero):
    if numero >= 1: #caso base
        print(numero)
        imprimir_numero_recursivo(numero-1)#caso recursivo
    elif numero == 0:
        return
    elif numero <= 0:
        print("Valor ingresado incorrecto...")
numeroUsuario = int(input("ingrese un numero: "))
numero = numeroUsuario
imprimir_numero_recursivo(numero)
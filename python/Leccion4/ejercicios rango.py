#sintaxis de range(inicio<opcional>, fin <requerido>, incremento <opcional>

#Ejercicio 1: iterar un rango de 0  a 10  e imprimir numeros divisibles entre 3
#ejemplo de ejecucion : 0,3,6,9
for i in range (0,11,1):
    if i % 3 ==0:
        print(i)

#ejercicio 2 :crear un rango de numeros de 2 a 6 e imprimirlos
#ejemplo de ejecucion : 2,3,4,5,6
print("")
for i in range (2,7,):
    print(i)

#ejercicio3:  crear un rango de 3 a 10 pero con incremento de 2 en 2en lugar de 1 en 1
#ejemplo de ejecucion : 3,5,7,9
print("")
for i in range (3,11,2):
    print(i)
#lo comiteamos

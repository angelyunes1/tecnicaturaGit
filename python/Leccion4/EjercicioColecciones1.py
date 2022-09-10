#Ejercicio 1 Eliminar duplicados de una lista
#Escriba un programa donde tenga una lista y que a continuacion
#elimine los elementos repetidos, por ultimo mostrar la lista.
#Creamos una lista
numeros = [1, 1, 3, 5, 2, 2, 3, 8, 8, 5, 1]
#print(numeros)
#numeros_set = set(numeros)
#print(numeros_set)

numeros = list(set(numeros)) # La conversion hecha en una sola linea de codigo(eficiente)
print(numeros)
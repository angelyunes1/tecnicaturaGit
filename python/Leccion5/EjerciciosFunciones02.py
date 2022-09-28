#Ejercicio 02:
"""
Funcion con *args para multiplicar los valores recibidos de tipo numerico, utilizando argumentos varibles *args como
parametros de la funcion y regresar como resultado la multiplicacion de todos los valores pasados como argumentos
"""
def multiplicar_valores(*args): # el mas utilizado es *args
    resultado = 1 # le asignamos el numero 1 porque con 0 no se puede multiplicar nada
    for numero in args:
        resultado  *= numero
    return resultado

#llamamos a la funcion
print(multiplicar_valores(3,5,15,3)) #Le pasamos los argumentos

'''
ejercio1 :
Debemos plasmar la expresion en una expresion algoritmica, osea
hacerlo en codigo
'''
'''
a = float(input("digite el valor de a: "))
b = float(input("digite el valor de b: "))
c = float(input("digite el valor de c: "))
resultado = (a ** 3 * (b ** 2 - 2 *a * c)) / (2 * b)
print(f"el resultado es: {resultado}")
'''
'''
condicion = False
#if condicion:
#    print("condicion verdadera")
#else:
#    print("condicion falsa")
print("condicion verdadera") if condicion else print("condicion falsa")
'''
"""
#Determinar la solución lógica de la siguiente operación.

#((3 + 5 x 8 ) < 3 and ((- 6/3 x 4 ) + 2 < 2)) or ( a > b)


a = float(input("ingrese el valor para a :"))
b = float(input("ingrese el valor para b :"))
condicion = ((3 + 5 * 8 ) < 3 and ((- 6/3 * 4 ) + 2 < 2)) or (a > b)
if condicion == True:
    print("la condicion es verdadera")
else:
    print("la condicion es falsa")
"""
"""
#Ejercicio 3:
#Intercambiar el valor de dos variables.
#Por ejemplo:
#a = 10        a = 5
#b = 5              b = 10

a = float(input("ingrese el valor de a :"))
b = float(input("ingrese el valor de b :"))

c = a
a = b
b = c

print(f"al intercambiar, el valor de a seria : {a}")
print(f"al intercambiar, el valor de b seria : {b}")
"""


"""
#Ejercicio 4: Área y longitud de un circulo
#Hacer un programa para ingresar el radio de un circulo y se reporte su área y la longitud de la circunferencia.

#Área = Pi * r2
#Longitud = 2 * Pi * r
#En este ejercicio vamos a necesitar importar el modulo math porque tiene el valor de Pi
#Se escribe:   import math

import math
radio = float(input("ingrese el valor del radio :"))
area = math.pi * (radio ** 2)
longitud = 2 * math.pi * radio
print(f"el valor del area es : {area}")
print(f"el valor del longitud es : {longitud}")
"""

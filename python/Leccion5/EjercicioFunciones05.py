"""
Ejercicio05: Convertidor de temperaturas
Realizar dos funciones para convertir de grados celcius a fahrenheint y viceversa
Investigar las formulas
"""

#funcion que convierte de celsius a fahrenheint
def celsius_fahrenheint(celsius):
    return celsius * 9 / 5 + 32 # La precedencia: multiplicacion,divicion,suma
#Funcion que convierte de fahrenheint a celsius
def fahrenheint_celsius(fahrenheint):
    return ((fahrenheint - 32) * 5) / 9 #respetar la precedencia utilizando parentencis



celsius = float(input("Digite  el valor de celsius: "))
resultado = celsius_fahrenheint(celsius)
print(f"{celsius}C a F ->  {resultado:.2f}")

fahrenheint = float(input("Digite  el valor de fahrenheint: "))
resultado = fahrenheint_celsius(fahrenheint)
print(f"{fahrenheint}C a F ->  {resultado:.2f}")
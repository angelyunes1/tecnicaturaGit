"""
Ejercicio N4: sumar numeros pares dentro de un rango
Hacer un programa para sumar numeros pares dentro de un rango
Por ej suma de numeros pares del 2 al 30 = 240
"""


# COMO LO HICE YO


a = int(input("Ingrese el numero menor del rango"))
b = int(input("Ingrese el numero mayor del rango"))
d = b + 1
c = 0
lista = list(range(a,d))
for i in lista:
    if i % 2 ==0:
        c = c + i
print(f"La suma de los numeros pares del rango { a} al { b} , es igual a = {c}")

#####################################################################################################
#COMO LO HIZO EL PROFE

a = int(input("Ingrese de donde va a comenzar la suma"))
b = int(input("Ingrese hasta donde queiere que llegue la suma "))
suma = 0
for i in range(a,b+1):
    if i % 2==0: #Esto si el numero es par
        suma += i
        print(f"\nLa suma de numeros pares dentro del rango es:  {suma}")


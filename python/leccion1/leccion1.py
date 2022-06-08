'''
miVariable = 3
print(miVariable)
miVariable = "a"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(z)
print(id(x))
# las literales se escriben x440,y=184,z=504(en mi caso la literal10(x),literal2(y),literal12(z))...
# pero al ser la memoria volatil, esta cambia continuamente
# cada vez que se inicia el programa, ya que al finalizar el programa se borra
# todo, y al ejecutarlo de nuevo toma otra casilla
print(id(y))
print(id(z))

# tipos Int, Float, String, Bool       Print(type()) nos muestra el tipo de variable que es
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "hola alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# manejo de cadenas
miGrupoFavorito = "the letter black:"
caracteristicas = "the best rock band"
print("mi grupo favorito es:", miGrupoFavorito, caracteristicas)
numero1 = "7"
numero2 = '8'
print(int(numero1) + int(numero2))
# tipos de boleanos(bool)
miBooleano = 3 > 2
print(miBooleano)
if miBooleano:
    print("el resultado es: verdadero")
else:
    print("el resultado es: Falso")
# procesar la entrada del usuario
# funcion input
resultado = input("digite un numero: ")  # regresa un dato tipo string
print(resultado)

# conversion de la entrada de datos
numero1 = int(input("escribe el primer numero: "))
numero2 = int(input("escribe el segundo numero: "))
resultado = numero1 + numero2
print("el resultado de la suma es :", resultado)
'''



"""
OperandoA = 8
OperandoB = 5
suma = OperandoA + OperandoB
#print("Resultado de la suma es:",suma)
print(f'el resultado de la suma es: {suma}')

resta = OperandoA - OperandoB
print(f'el resultado de la resta es: {resta}')

multiplicacion = OperandoA * OperandoB
print(f"el resultado de la multiplicacion es : {multiplicacion} ")

division = OperandoA / OperandoB
print(f'el resultado de la division es:{division}')
division = OperandoA // OperandoB
print(f'el resultado de la division (int) es:{division}')

modulo = OperandoA % OperandoB
print(f"el resultado de esta division o residuo es : {modulo}")

exponente = OperandoA ** OperandoB
print(f"el resultado del exponente es  : {exponente}")
"""


"""
alto = int(input("ingrese el alto del rectancgulo: "))
ancho = int(input("ingrese el ancho del rectangulo: "))
area = alto * ancho
perimetro = (alto+ancho)*2
print(f"el area del rectangulo es {area} y el perimetro es {perimetro}")
# tambien se puede mostrar de la siguiente forma
print("area:", area)
print("perimetro:", perimetro)
"""



"""
miVariable3 = 10
print(miVariable3)
# operadores de asignacion
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1 #es lo mismo que la linea 99 pero mas resumido
print(miVariable3)

# miVariable3 =miVariable3 - 2
miVariable3 -= 2
print(miVariable3)
# miVariable3 =miVariable3 * 3
miVariable3 *=3
print(miVariable3)
# miVariable3 =miVariable3 / 2
miVariable3 /=2
print(miVariable3)

# Operadores de comparacion
d = 4
b = 2
resultado = d == b #comprobamos si son igaules
print(resultado)
# operador diferente
resultado = d != b
print(resultado)
# operador mayor que
resultado = d > b
print(resultado)
# operador menor que
resultado = d < b
print(resultado)
# operador mayor o igual que
resultado = d >= b
print(resultado)
"""


"""
numero=int(input("Ingrese un numero: "))
print(f"el resuido de la division es: {numero % 2}")
if numero % 2 ==0:
    print(f"el numero {numero} es par")
else:
    print(f"el numero {numero} es impar")

"""



"""
edad= int(input("ingrese su edad"))
if edad >= 18:
    print(f"tienes {edad} por lo tanto eres mayor de edad ")
else:
    print(f"tienes {edad} por lo que eres menor de edad")
"""



"""
#operadores logicos

#operador AND (ambos deven ser verdadero para devolver V en caso contrario F)
a = True
b = False
resultado = a and b
print(resultado)
a = True
b = True
resultado = a and b
print(resultado)

#operador OR (con que uno se V devolvera V, si son los dos F devolvera F)

a = True
b = False
resultado = a or b
print(resultado)
a = True
b = True
resultado = a or b
print(resultado)
a = False
b = False
resultado = a and b
print(resultado)

#operador NOT (cambia el valor, si es F devuelve V y viciversa)

a = True
b = False
resultado = not a
print(resultado)
resultado = not b
print(resultado)
"""


"""
#el valor dentro de un rango
numero= int(input("ingrese un numero"))
if numero >= 0 and numero <= 5: print(f"el numero {numero} esta dentro del rango")
else: print(f"el numero {numero} no esta dentro del rango")

valor= int(input("digite un numero dentro del rango 0 a 5"))
valorMinimo = 0
ValorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= ValorMaximo
if dentroRango:
    print(F"el numero {valor} esta dentro del rango")
else: 
    print(F"el numero {valor} esta fuera del rango")

"""


"""
#ejercicio con el operador OR, operador NOT
vacaciones = False
diaDescanso = False
if vacaciones or diaDescanso:
    print("puede asistir al juego")
else:
    print("tiene trabajo que hacer")
#aca cambiamos la logiga de las respuestas con el NOT
if not (vacaciones or diaDescanso):
    print("puede asistir al juego")
else:
    print("tiene trabajo que hacer")
"""


"""
# Ejercicio rango entre 20 y 30 anos
edad = int(input("Ingrese su edad"))
# veinte = edad >= 20 and edad < 30
# print(veinte)
# treinta = edad >= 30 and edad < 40
# print(treinta)

# if veinte or treinta:
if (20 <= edad <30) or (30 <= edad < 40):  # Sintaxis simplificada del operador and
    print('estas dentro del rango (20\'0)a (30\'0) anos')
#    if veinte:
#      print('estas dentro del rango (20\'0)a (30\'0) anos')
#    elif treinta:
#        print("estas dentro del rango de los (30'0)anos")
else:
    print("no estas dentro del rango (20'0)a (30'0) anos")
"""


"""
#ejercicio:numero mayor de 2
numero1 = int(input("digite el valor para el numero 1:"))
numero2 = int(input("digite el valor para el numero 2:"))
if numero1 > numero2:
    print(f"el numero mayor es {numero1}, es decir el numero 2")
else:
    print(f"el numero mayor es {numero2}, es decir el numero 2")
"""

# Ejercicio: tienda de libros

print("ingrese los siguientes datos del libro")
nombre = input("digite el nombre del libro")
id = int(input("digite el id del libro"))
precio = float(input("digite el precio del libro"))
envio = input("indicar si el envio es gratuito (True/False: ")
if envio == 'True':
    envio = True
elif envio == 'False':
    envio = False
else:
    envio = 'el valor es incorrecto, debe colocar True/False '
print(f'''
        nombre:          {nombre}
        id:              {id}
        precio:          {precio}
        envio gratuito?: {envio}
''')

#Comenzamos con funciones
# mi_funcion() # no se puede llamar antes de definir la funcion
#Definimos una funcion
def mi_funcion(): # Para identificar a la funcion utilizamos los parentecis
    print("saludos a todos los alumnos")

mi_funcion() #Estamos llamando a la funcion
mi_funcion() # Una funcion se puede llamar N cantidad de veces


# Desempaquetado de listas o list Unpacking
def show(name, lastName):
    print(name+ " " + lastName)
person = ["Ariel","Bentacud"]
show(person[0],person[1]) #Pasamos uno por uno de los datos de la lista a la funcion
show(*person) # Esto es lo mismo que lo anterior pero le pasamos todo junto
person2= ("osvaldo","Giordanini") #desempaquetamos a traves de una tupla
show(*person2)
person3 = {"lastName": "Lucero", "name": "Natalia"}
show(**person3)

numbers = [1, 2, 3, 4, 5] #Aun con la lista vacia se va a ejecutar el else
for n in numbers:
    print(n)
    if n == 3:
        break #Esta es la unica manera para que no se ejecute el else
else:
    print("Esto se termina")


#List comprehension, lista de comprension
names = ["Paolo","Rodrigo","Angel","Pepe"]
alongP = [p for p in names if p[0] == "P"] #Esto regresara una nueva lista
print(alongP)

bottleC = [{"name":"Quilmes","Country": "Arg"},
           {"name":"Corona","Country": "Mx"},
           {"name":"Stella Artois","Country": "Belgium"}
           ]
Arg = [b for b in bottleC if b ["Country"] == "Arg"]
print(Arg)
print(bottleC)


#Paso de argumentos (funciones)
def mi_funcion2(name,lastName):
    print("saludos a todos los que ven a traves del canal de youtube")
    print(f"nombre: {name}, Apellido: {lastName}")
mi_funcion2("Jorge","Lucero")
mi_funcion2("Angel","Yunes")
mi_funcion2("Analia","Pedrosa")

#La palabra return en funciones
# Creamos una funcion para sumar
def sumar(a, b):
    return a + b
#resultado = sumar(78,25)
#print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {sumar(78,25)}")



def sumar2(a = 0, b = 0): # Le damos un valor por default
    return a + b
resultado =  sumar2()
print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {sumar2(22,66)}")


# Argumentos, variable en funciones
def listarNombres(*nombres): #Normalmete se utiliza: args
    for nombre in nombres: # Se va a convertir en una tupla
        print(nombre)
listarNombres("Lucas","Jose","Claudia","Rosa","Angel")
listarNombres("Marcos","Pepe","Carlos")


def listaTerminos(**terminos): #lo mas utilizado  es **kwargs para recibir los argumentos
    for llave, valor in terminos.items(): # Kwargs significa: Key word argument
        print(f"{llave} : {valor}")

listaTerminos()# no recibe nada, nada se va a mostrar
listaTerminos(IDE='Integrated Develoment Eviroment', PK="Primary Key")
listaTerminos(Nombre="Leonel Messi")

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ['Tito','Pedro','Carlos']
desplegarNombres(nombres2)
desplegarNombres("Carla")
#desplegarNombres(10,11) # No es un objeto Iterable
desplegarNombres((10, 11)) # La convertimos a tupla para recorrer los numeros
desplegarNombres([22,55]) #La convertimos en una lista (al ser una nueva lista puede ser tipo int)


#Funciones Recursivas
def factorial(numero):
    if numero == 1: #caso base
        return 1
    else:
        return  numero * factorial(numero-1) #caso recursivo
numeroFactorial = int(input("Digite el numero para calcular el factorial: "))
resultado  = factorial(numeroFactorial) # Lo hacemos en codigo duro
print(f" El factorial del numero {numeroFactorial} es {resultado}")
# lista = Ariel , Liliana , Natalia , Osvaldo
#Colecciones en python

# las listas es lo que se conoce en otros lenguajes como vectores o arreglos

nombres = ["Naty", "Osvaldo", "Lily", "Ariel"]
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])
print(nombres[0:2]) #solo muestra el indice 0 y 1, pero  no el 2

# ir del inicio de la lista al indice mencionado (sin incluirlo)
print(nombres[ :3])

#desde el indice indicado hasta el final
print(nombres[1: ])

#modificamos un valor
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)

#iterar nuestra lista
for nombre in nombres: #nombre es singular, la lista es plural
    print(nombre)
else:
    print("se acabaron los elementos de la lista")

#preguntamos cuantos elementos tiene nuestra lista
print(len(nombres)) # le pasamos como parametro la lista

#agregamos un elemento
nombres.append("marcelo")
nombres.append([1,2,3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4,5])
nombres.append(7)
print(nombres)

#insertar un nuevo elemento en un indice especifico
nombres.insert(1,"Alberto")
print(nombres)
nombres.insert(3,"Debora")
print(nombres)

#eliminamos un elemento
nombres.remove("Alberto")
print(nombres)

#eliminar el ultimo elemento
nombres.pop()
print(nombres)

#eliminar un elemento especifico
del nombres[2] #del significado delete (eliminar)
print(nombres)

#eliminar, borrar, o limpiar todos los elemetos
nombres.clear()
print(nombres)

#eliminar la lista
del nombres
#print(nombres) #aqui nos mostrara un error

#Definimos una tupla
cocina = ("cuchara","cuchillo","tenedor")
print(len(cocina))
# acceder a un elemento, para esto utilizamos corchetes, no parentecis
print(cocina[0])
#mostrar de manera inversa
print(cocina[-1])

#acceder a un rango
print(cocina[0:2])

#ejemplo
verduras = ("papa",) #una tupla necesita aunque sea un elemento la coma
#de lo contrario solo seria un tipo srt cadena

#recorremos los elementos de la tupla
for cocinar in cocina:#print esta utilizando \n para saltos de linea
    print(cocinar, end=" ")  # usamos end= para eliminar los saltos de linea

cocinaLista = list(cocina)
cocinaLista [0] = "plato"
cocina = tuple(cocinaLista)
print('\n',cocina)

#del cocina    \\esto es para eliminar una tupla

# TIPO SET
planetas = {"marte","jupiter","venus"}
print(len(planetas)) #usamos la funcion len = lenght significa largo
#revisar si un elemento existe dentro de set
print("marte" in planetas)
print("jupiter" not in planetas)
#Agregar un elemento
planetas.add("tierra") #add es una funcion
planetas.add("tierra")
planetas.add("tierra") #No se pueden agregar elementos duplicados o repetidos en set
print(planetas)
#eliminar elementos, puede arrojar un error si el elemento no extiste
planetas.remove("jupiter") # en esta funcion un mal ingreso u inexistencia de este nos arroja error
print(planetas)
planetas.discard("Tierra") #con esta funcion tambien eliminamos elementos pero en este caso si nos equivocamos, no se borra
print(planetas) #pero no salta un error

# Limpiar nuestro set
planetas.clear()
print(planetas)
#eliminar set
del planetas
#print(planetas)



# 'maradona' : 10 un diccionario esta compuesto por dos elementos
# UNA LLAVE Y UN VALOR
# dict(key,value)
diccionario = {
    "IDE": "Integrated Development Envioronment",
    'POO': "Programacion orientada a objetos",
    "SABD": 'Sistema de Administracion de base de datos'
}
#verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

#Acceder a un diccionario con la llave(key)
print(diccionario["IDE"])

#otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

#Modificar elementos
diccionario["IDE"] = "Entorno de desarrollo integrado"
print(diccionario)

#como recorrer elementos
for termino in diccionario: #recorremos mostrando solo las llaves
    print(termino)
#Necesitamos  una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino,valor)
#otra forma de acceder a un diccionario
for termino in  diccionario.keys():
    print(termino) #solo muestra las llaves

for valor in diccionario.values(): #usamos una funcion  para acceder al valor
    print(valor)

#comprobar la existencia de un elemento
print("IDE" in diccionario)
print("ide" not in diccionario) #devuelve un booleano

#Agregar un elemento
diccionario['PK'] = 'Primare Key'
print(diccionario) # no se pueden agregar dos llaves iguales, en el caso de ingresar dos veces el mismo solo se reescribe.

#eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

#como vaciar un diccionario
diccionario.clear()
print(diccionario)

#eliminar el diccionario
del diccionario #el diccionario se borro

#concatenamos listas
lista1 = [1,2,3,1]
lista2 = [4,5,6,1]
lista3 = lista1 + lista2 #concatenamos
print(lista3)

lista3.extend([7,8,9,1]) #funcion para agregar varios elementos a una lista
print(lista3)

print(lista3.index(5)) # Funcion para ubicar en que indice esta el valor ingresado
# print(lista3.index(0)) Esto daria un error por ser un elemento que no es parte de la lista

#como saber cuantos elementos repetidos hay dentro de una lista
print(lista3.count(1)) # cuenta cuantos valores iguales hay dentro de la lista

#para poner nuestra lista al reves
lista3.reverse()
print(lista3)

#Para que una lista se multiplique repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

#metodos de ordenamientos
lista3.sort() #ordena los elementos ascendentemente
print(lista3)
lista3.sort(reverse=True) #ordena los elementos descendentemente
print(lista3)

#repaso de tuplas
tupla = (4,"hola",6.78,[1,2,78],4,'hola')
print(tupla)

print(4 in tupla) #accion booleana, su repuesta es de tipo boleana
#lo que podemos  usar dentro de tuplas son: index,count, len
# EN tuplas se puede convertir de tupla a lista y de lista a tupla
# lista = Ariel , Liliana , Natalia , Osvaldo

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


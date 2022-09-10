"""
Ejercicio N3:Agregar personajes a una lista.
Escriba un programa donde cree una lista con los siguientes personajes del senor de los anillos

Nombre: Aragon
Clase: guerrero
Raza: Dunadan del  norte

Nombre: Gandalf
Clase: mago
Raza: Instar

Nombre: Legolas
Clase: Arquero
Raza: Elfo Sindar

"""
personajes = [] #creamos una lista vacia
P = {"Nombre":"Aragon","clase": "Guerrero","raza":"Dunadan del  norte"}
personajes.append(P)


P = {"Nombre":"Gandalf","clase": "Mago","raza":"Instar"}
personajes.append(P)


P = {"Nombre":"Legolas","clase": "Arquero","raza":"Elfo Sindar"}
personajes.append(P)


P = {"Nombre":"Sauron","clase": "nigromante","raza":"Maiar"}
personajes.append(P)


P = {"Nombre":"Gimli","clase": "Guerrero","raza":"Enanos"}
personajes.append(P)


P = {"Nombre":"Samsagaz Gamyi","clase": "Jardinero","raza":"Hobbit"}
personajes.append(P)


print(personajes)

#Ejercicio 2 : Operaciones de conjuntos con listas
# #Escriba un programa que tenga 2 listas y que a
# continuacion Cree las siguientes listas (en las que no debe haber repeticion)
#1 Lista de palabras que aparecen en las listas
#2 Lista de palabras que aparecen en la primera fila, no la segunda
#3 Lista de palabraas que aparecen en la segunda lista, no en la primera
#4 Lista de palabras que aparecen en ambas listas
Lista1= [1,2,3,4,5,4,3,2,2,1,5]
lista2= [4,5,6,7,8,4,5,6,7,7,8]

#Eliminar  los elementos repetidos en ambas listas con conjuntos
conjunto1 = set(Lista1)
conjunto2 = set(lista2)
union = list(conjunto1| conjunto2) #unimos los dos conjuntos
solo1 = (conjunto1 - conjunto2) #solo muestra conjunto1
solo2 = (conjunto2 - conjunto1) #solo muestra conjunto2
interseccion = list(conjunto1 & conjunto2) #mostramos ambas listas
print(f"Lista de palabras que aparecen en las listas {union}")
print(f"Lista de palabras que aparecen en la primera lista {solo1}")
print(f"Lista de palabras que aparecen en la segunda lista {solo2}")
print(f"Lista de palabras que aparecen en ambas listas {interseccion}")
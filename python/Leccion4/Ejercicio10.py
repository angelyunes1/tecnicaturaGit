#   Ejercicio10: No repetir caracteres
#   hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres
lista = []
cadena = input("diigite una cadena: ")
for i in cadena:
    if i not in lista: # si el caracter aun no esta en la lista
        lista.append(i) # Lo agreguamos a la lista
print(f"\nLista de caracteres sin repetir ninguno: \n {lista} ")


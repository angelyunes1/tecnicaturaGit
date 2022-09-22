"""
Ejercicio 11: Agenda Telefonica
Hacer un programa que simule una agenda de contactos. Crear un diccionario donde la clave sea el nombre de usuario
y el valor sea el telefono, el programa tendra el siguiente menu de opciones
 1-Nuevo contacto
 2-Borrar contacto
 3-ver contacto excistente
 4-salir
"""
agenda = {}
while True:
    print("\t.:menu:.")
    print(" 1-Nuevo contacto")
    print(" 2-Borrar contacto")
    print(" 3-ver contacto excistente")
    print(" 4-Salir")
    opcion = int(input("ingrese una opcion"))
    if opcion == 1:
        nombre = input("ingrese el nombre del nuevo contacto:")
        numero= input("ingrese el numero para el nuevo contacto")
        if nombre not in agenda:
            agenda[nombre] = numero
            print("Contacto agregado")
        else:
            print("Ese nombre de contacto ya existe")
    elif opcion == 2:
        nombre = input("Digite el nombre del contacto a eliminar")
        if nombre in  agenda:
            del(agenda[nombre])
            print("Se ha eliminado el contacto")
        else:
            print("ese contacto no existe en la agenda")
    elif opcion == 3:
        print("Agenda de contactos")
        for clave, valor in agenda.items():
            print(f'Nombre: {clave}, Telefono: {valor}')
    elif opcion == 4:
        print("gracias por utilizar su agenda de contacto")
        break
    else:
        print("se equivoco de opcion de menu")
    print()
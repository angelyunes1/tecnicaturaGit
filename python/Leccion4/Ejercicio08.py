"""
Ejercicio 8 : Menu interactivo - Cajero automatico
Hacer un programa que simule un cajero automatico con un saldo inicial de $1000
y tendra el siguiente menu de Opciones
 1-Ingresar dinero en la cuenta
 2-Retirar dinero de la cuenta
 3-Mostrar dinero disponible
 4-Salir
"""
saldo  = 1000
while True:
    print("\t.:menu:.")
    print(" 1-Ingresar dinero en la cuenta")
    print(" 2-Retirar dinero de la cuenta")
    print(" 3-Mostrar dinero disponible")
    print(" 4-Salir")
    opcion = int(input("digite una opcion de menu: "))
    print()
    if opcion == 1:
        extra = float(input("Cuanto Dinero desea ingresar: ->  "))
        saldo += extra
        print(f"Dinero en la cuenta al momento: ${saldo}")
    elif opcion == 2:
        retiro = float(input("Cuanto dinero desea retirar: ->  "))
        if retiro > saldo:
            print("No tiene esa cantidad de dinero, por favor elija otro monto")
        else:
            saldo -= retiro
            print(f"Dinero en la cuenta al momento: ${saldo}")
    elif opcion == 3:
        print(f"Dinero en la cuenta al momento: ${saldo}")
    elif opcion == 4:
        print("Gracias por utilizar el cajero automatico")
        break
    else:
        print("se equivoco de opcion, de menu")
        print()

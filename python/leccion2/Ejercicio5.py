# Ejercicio 5 // Sistema de calificaciones
nota = float(input("ingrese su nota del 0 al 10 :"))
if 0<= nota < 6:
    print("Usted tiene una F")
elif 6 <= nota < 7:
    print("Usted tiene una D")
elif 7 <= nota < 8:
    print("usted tiene una C")
elif 8 <= nota < 9:
    print("usted tiene una B")
elif 9 <= nota <= 10:
    print("usted tiene una A")
else:
    print("el valor ingresado es incorrecto")

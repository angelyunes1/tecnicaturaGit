# Ejercicio 3 // Calcular estacion del año

# mes = int(input("ingrese un numero del 1 al 12 :"))
# if 1 <= mes and 3 >= mes:
#     print("verano")
# elif 4 <= mes and 6 >= mes:
#     print("Otoño")
# elif 7 <= mes and 9 >= mes:
#     print("Invierno")
# elif 10 <= mes and 12 >= mes:
#     print("Primavera")
# else:
#     print("Usted ingreso un numero incorrecto")

mes = int(input("Ingrese un numero del 1 al 12 :"))
estacion = None
if mes == 1 or mes == 2 or mes ==3:
    estacion="Verano"
elif mes == 4 or mes == 5 or mes ==6:
    estacion="Otoño"
elif mes == 7 or mes == 8 or mes ==9:
    estacion="Invierno"
elif mes == 10 or mes == 11 or mes ==12:
    estacion="Primavera"
print(f"Para el mes {mes} la estacion es : {estacion}")
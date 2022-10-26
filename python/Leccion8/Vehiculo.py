"""
    Definir una clase padre llamada vehiculo  y dos clases hijas llamadas Auto y Bicicleta, las cuales heredan
    de la clase Vehiculo. La clase padre debe tener los siguientes atributos y metodos

    Vehiculo(Clase padre)
    -Atributos(color,ruedas)
    -Metodos(__init__(color,ruedas)y __str__())

    Auto(clase hija de vehiculo)
    -Atributos(velocidad(km/h))
    -Metodos(__init__(color,ruedas,velocidad) y __str__())

    Bicicleta(clase hija de vehiculo)
    -Atributos (tipo(urbana/montana/etc.)
    -Metodos (__init__(color,ruedas,tipo) y __str__()

    Crear un objeto de cada clase
"""
class Vehiculo:
    def __init__(self,color,ruedas):
        self.color = color
        self.ruedas = ruedas
    def __str__(self):
        return  "color: "+self.color+" ruedas " +str(self.ruedas)

class Auto(Vehiculo):
    def __init__(self,color,ruedas,velocidad):
        super().__init__(color,ruedas)
        self.velocidad = velocidad
    def __str__(self):
        return super().__str__()+',velocidad: '+ str(self.velocidad)+"km/h"

class Bicicleta(Vehiculo):
    def __init__(self,color,ruedas,tipo):
        super().__init__(color,ruedas)
        self.tipo = tipo
    def __str__(self):
        return super().__str__()+',Tipo de bicicleta '+ self.tipo


#primer objeto de la clase padre Vehiculo
vehiculo1= Vehiculo("Azul",4)
print(vehiculo1)

#Segundo objeto, pero ahora de la clase auto
auto1 = Auto("Rojo",4,100)
print(auto1)
#tercer objeto, pero ahora de la clase Bicicleta
bici1= Bicicleta("Azul",2,"Urbana")
print(bici1)
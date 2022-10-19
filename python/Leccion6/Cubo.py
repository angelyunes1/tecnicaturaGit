class Cubo:
    """
    Crear la clase cubo con los atributos, ancho, alto y profundidad, con un metodo calcular_volumen que tendra la
    formula
    Volumen = ancho *altura * profundidad
    que el usuario ingrese los valores
    """
    def __init__(self,altura,base,profundidad):
        self.altura = altura
        self.base = base
        self.profundidad = profundidad
    def calcular_volumen(self):
        return self.base * self.altura * self.profundidad
altura = int(input("Digite el valor del altura del cubo: "))
base = int(input("Digite el valor de la base del cubo: "))
profundidad = int(input("Digite el valor de la profundidad del cubo: "))
cubo1 = Cubo(altura,base,profundidad)
print(f"El area del cubo es {cubo1.calcular_volumen()}")
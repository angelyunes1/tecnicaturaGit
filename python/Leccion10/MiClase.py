class MiClase:
    # Variable de clase, este atributo dara a cada objeto el mismo valor
    variable_clase = "Esta es una variable de clase"

    def __init__(self, variable_instancia):  # la variable de instancia, da diferentes valores
        self.variable_instancia = variable_instancia

    @staticmethod #decorador para metodo statico
    def metodo_estatico(): #Metodo estatico, se asocia a la clase
        print(MiClase.variable_clase)

    @classmethod #Decorador para metodo de clase
    def metodo_clase(cls):
        print(cls.variable_clase)

    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_clase)
        print(self.variable_instancia)


print(MiClase.variable_clase)
miClase1 = MiClase("Esta es una variable de instancia")
print(miClase1.variable_instancia)
print(miClase1.variable_clase)
miClase2 = MiClase("Esta es otra prueba de variable de instancia")
print(miClase2.variable_instancia)
print(miClase2.variable_clase)

MiClase.variable_clase2 = "Esta es otra forma de crear una variable de clase, no se puede crear sin asignar el valor"
print(MiClase.variable_clase2)
print(miClase1.variable_clase2)
print(miClase2.variable_clase2)

MiClase.metodo_estatico()

MiClase.metodo_clase()
miObjeto1= MiClase("variable de instancia")
miObjeto1.metodo_clase()
miObjeto1.metodo_instancia()
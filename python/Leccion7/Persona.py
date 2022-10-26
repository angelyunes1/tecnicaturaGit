class Persona:  # Esta clase hereda de la clase Object
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad

    @property  # metodo Getter
    def nombre(self):
        return self._nombre

    @nombre.setter  # metodo Setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __str__(self):  # Override = sobreescribir
        return f'Persona: [Nombre:{self.nombre} Edad:{self.edad}]'


class Empleado(Persona):  # Esta clase es hija de la clase Persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f'Empleado: [ Sueldo: {self.sueldo}] {super().__str__()}'


empleado1 = Empleado("Pedro", 45, 75000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)
# Tarea: Encapsular los atributos y agregar los metodos getter and setter, crear otro objeto, pasar  los datos
# para nombre ,edad, sueldo. Mostrar los datos, luego modificar y mostrar nuevamente
empleado2 =Empleado("Juan",22,44214)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
empleado2.nombre = "Mauro"
empleado2.edad = 25
empleado2.sueldo = 123313
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
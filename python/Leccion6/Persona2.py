class Persona2:
    def __init__(self,nombre,apellido,edad): #esta encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")

    @property
    def nombre (self): #metodo Getter
        print("estamos usando el metodo Get")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre): #metodo setter
        print("estamos usando el metodo set")
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido
    @apellido.setter
    def apellido(self,apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad
    @edad.setter
    def edad(self,edad):
        self._edad = edad

    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")

if __name__ =="__main__":
    persona1 = Persona2("Ariel","Bentacud",41)
    print(persona1.nombre) #Llamamos al metodo Getter
    persona1.nombre = "Juan pedro" #llamamos al metodo Setter
    print(persona1.nombre)#Llamamos al metodo Getter
    print(persona1.mostrar_detalles()) # llamamos al metodo mostrar detalles
    # Atributo read- only (solo lectura) seria la edad porque no tiene el metodo set
    print(persona1.edad)
    #Tarea crear tres objetos mas, utilizando los metodos  getter and setter para modificar, y mostrar los cambios
    #con el metodo mostrar detalles

    persona2 = Persona2("Angel","Yunes",22)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = "Juan"
    persona2.apellido = "Perez"
    persona2.edad=66
    print(persona2.mostrar_detalles())

    persona3 = Persona2("Pedro","Ortiz",44)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre="Enzo"
    persona3.apellido = "Velazques"
    persona3.edad= 88
    print(persona3.mostrar_detalles())


    persona4 = Persona2("Lucas","Funes",55)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = 'Ignacio'
    persona4.apellido = "Vazques"
    persona4.edad= 77
    print(persona4.mostrar_detalles())

    print(__name__)
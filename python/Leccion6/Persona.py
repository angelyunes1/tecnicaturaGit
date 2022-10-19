class Persona: #Creamos una clase
    def __init__(self, nombre, apellido,dni, edad, *args,**kwargs): #Se lo llama metodo Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni #Este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
    def mostrar_detalles(self): # Su uso es identico a "this"
        print(f"La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad} {self._dni} la direccion es {self.args},los datos importantes son {self.kwargs}")

persona1 = Persona("Ariel","Betancud",23233152,40)#necesitamos enviar argumentos  #persona1[objeto]=Persona[constructor]([argumentos]    )
#print(persona1.nombre)
#print(persona1.apellido)
#print(persona1.edad)

print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} su edad es {persona1.edad}")

persona2 = Persona("Osvaldo","Giordanini",2131321322,45)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} su edad es {persona2.edad}")
#Modificamos los argumentos del objeto 1
persona1.nombre = "Angel"
persona1.apellido = "Yunes"
persona1.edad = 22
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} su edad es {persona1.edad}")

#Los atributos son :caracteristicas
#Los metodos son: los comportamientos que van a tener los objetos(acciones)
persona1.mostrar_detalles() #La referencia se pasa de manera automatica en este caso
persona2.mostrar_detalles()

#Persona.mostrar_detalles(persona1) Debemos pasar una referenisa a "self" o dara error
persona1.telefono ="12412412421"
print(f"este es el telefono de : {persona1.nombre} {persona1.telefono}") # Hemos creado un atributo de un objeto

# print(persona2.telefono) El objeto persona2 no tiene este atributo, da error
persona3 = Persona("Rogelio","Romero",142124124,22,"Telefono","314124124","calle lopez",333,"Manzana",22,"casa",18,altura=1.83,peso=78,Cfavorito = "azul",Auto="Chevrolet",modelo=1999)
persona3.mostrar_detalles()
# print(persona3._dni) Esto no se debe utilizar en python,(esto esta encapsulado) esto dice que lo desconocemos a python


#persona3.__nombre Esta totalmetne encapsulado


persona4 = Persona("Armando","Quito",12312312,34,"Telefono","12414124","calle ombu",3573,"Manzana",26,"casa",28,altura=1.87,peso=48,Cfavorito = "rojo",Auto="ford",modelo=2000)
persona4.mostrar_detalles()

class Persona: #Creamos una clase
    def __init__(self, nombre, apellido, edad): #Se lo llama metodo Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    def mostrar_detalles(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")

persona1 = Persona("Ariel","Betancud",40)#necesitamos enviar argumentos  #persona1[objeto]=Persona[constructor]([argumentos]    )
#print(persona1.nombre)
#print(persona1.apellido)
#print(persona1.edad)

print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} su edad es {persona1.edad}")

persona2 = Persona("Osvaldo","Giordanini",45)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} su edad es {persona2.edad}")
#Modificamos los argumentos del objeto 1
persona1.nombre = "Angel"
persona1.apellido = "Yunes"
persona1.edad = 22
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} su edad es {persona1.edad}")

#Los atributos son :caracteristicas
#Los metodos son: los comportamientos que van a tener los objetos(acciones)
persona1.mostrar_detalles()
persona2.mostrar_detalles()
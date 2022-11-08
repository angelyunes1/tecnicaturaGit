from Cuadrado import Cuadrado
from FiguraGeometrica import FiguraGeometrica
from Rectangulo import Rectangulo

print("creacion de un objeto clase cuadrado".center(50,'-'))
cuadrado1= Cuadrado(2 ,'Azul')
#cuadrado1.alto = 7
#cuadrado1.ancho = 7
#print(cuadrado1.alto)
#print(cuadrado1.ancho)
print(f"calculo del area del cuadrado: {cuadrado1.calcular_area()}")

#MRO: Method Resolution Order
#print(Cuadrado.mro())

print(cuadrado1)
print("creacion de un objeto clase rectangulo".center(50,'-'))
rectangulo1 = Rectangulo(3,9,"verde")
#rectangulo1.ancho= 8
print(f'calculo del area del rectangulo: {rectangulo1.calcular_area()}')
print(rectangulo1)

#figura1=FiguraGeometrica() No se puede instanciar, es abstracta
print(Cuadrado.mro())
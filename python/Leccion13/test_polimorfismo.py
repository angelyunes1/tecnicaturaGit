from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto):
    #print(objeto)  # de manera indirecta estamos llamando al str de la clase Empleado o Gerente
    print(type(objeto))  # Esto es para saber que tipo de dato recibe
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)

empleado1 = Empleado('Angel', 50000.00)
imprimir_detalles(empleado1)

gerente1 = Gerente('Yunes', 60000.00, 'Sistemas')
imprimir_detalles(gerente1)

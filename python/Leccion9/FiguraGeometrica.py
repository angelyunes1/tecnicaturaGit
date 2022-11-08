from abc import ABC, abstractmethod
#ABC sigunifica: Abstract Base Class, convierte una clase en abstracta
class FiguraGeometrica(ABC):
    def __init__(self,ancho,alto):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self._ancho = 0
            print(f"valor erroneo para el ancho: {ancho}")
        if self._validar_valores(alto):
            self._alto = alto
        else:
            self._alto = 0
            print(f"valor erroneo para el alto: {alto}")
    @property
    def ancho(self):
        return self._ancho

    @property
    def alto(self):
        return self._alto


    @abstractmethod
    def calcular_area(self):
        pass
    def __str__(self):
        return f"FiguraGeometrica [Ancho: {self._ancho}, Alto: {self._ancho}]"


    def _validar_valores(self,valor): #metodo encapsulado
        return True if 0 < valor < 10 else False

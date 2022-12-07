from mundo_pc.monitor import Monitor
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado

TECLADO = Teclado('Hp', 'Usb')


class Computadora:
    contador_computadoras = 0
    def __init__(self,nombre,monitor,teclado,raton):
        Computadora.contador_computadoras +=1
        self._id_computadoras = Computadora.contador_computadoras
        self._nombre= nombre
        self._monitor = monitor
        self._teclado = teclado
        self._raton = raton

    def __str__(self):
        return f'''
            {self._nombre}: {self._id_computadoras}
            Monitor: {self._monitor}
            Teclado: {self._teclado}
            Raton: {self._raton}    
        '''

if __name__ == "__main__":
    teclado1= Teclado('Hp','usb')
    monitor1 =Monitor('Hp','15 pulgadas')
    raton1 = Raton('Hp','Usb')
    computadora1 = Computadora('Hp',monitor1,teclado1,raton1)
    print(computadora1)
    teclado2= Teclado('Acer','usb')
    monitor2 =Monitor('Acer','22 pulgadas')
    raton2 = Raton('Acer','Usb')
    computadora2 = Computadora('Acer',monitor2,teclado2,raton2)
    print(computadora2)
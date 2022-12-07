class Orden:
    contador_ordenes =0
    def __init__(self,computadoras):
        Orden.contador_ordenes +=1
        self.idOrden = Orden.contador_ordenes
        self._computadoras = computadoras
    def agregar_computadoras(self,computadoras):
        self._computadoras.append(computadoras)
    def __str__(self):
        computadoras_str = ''
        for computadora in self._computadoras:
            computadoras_str += computadora.__str__()
        return f'''
            Orden: {self.idOrden}
            Computadoras: {computadoras_str}
        '''
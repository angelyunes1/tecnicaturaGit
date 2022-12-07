from mundo_pc.computadora import Computadora
from mundo_pc.monitor import Monitor
from mundo_pc.orden import Orden
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado

teclado1= Teclado('Hp' ,'usb')
monitor1 =Monitor('Hp', '15 pulgadas')
raton1 = Raton('Hp', 'Usb')
computadora1 = Computadora('Hp', monitor1, teclado1, raton1)
print(computadora1)
teclado2 = Teclado('Acer', 'usb')
monitor2 = Monitor('Acer', '22 pulgadas')
raton2 = Raton('Acer', 'Usb')
computadora2 = Computadora('Acer', monitor2, teclado2, raton2)
print(computadora2)

computadoras1 = [computadora1,computadora2]
orden1 =Orden(computadoras1)
orden1.agregar_computadoras(computadora2)
print(orden1)


teclado3= Teclado('Asus' ,'Bluetoohth')
monitor3 =Monitor('Asus', '25 pulgadas')
raton3 = Raton('Asus', 'Bluetoohth')
computadora3 = Computadora('Asus', monitor3, teclado3, raton3)
print(computadora3)
teclado4 = Teclado('Samsumng', 'usb')
monitor4 = Monitor('Samsumng', '28 pulgadas')
raton4 = Raton('Samsumng', 'Usb')
computadora4 = Computadora('Samsumng', monitor4, teclado4, raton4)
print(computadora4)

teclado5 = Teclado('Apple', 'usb')
monitor5 = Monitor('Apple', '18 pulgadas')
raton5 = Raton('Apple', 'Usb')
computadora5 = Computadora('Apple', monitor4, teclado4, raton4)
print(computadora5)

computadoras2 = [computadora1,computadora3,computadora4]
orden2 =Orden(computadoras2)
print(orden2)
computadoras3 = [computadora3,computadora1,computadora5]
orden3 = Orden(computadoras3)
print(orden3)

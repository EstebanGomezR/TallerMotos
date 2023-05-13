Taller de Motocicletas
Descripción
En este proyecto se desarrollará una aplicación para un taller de motocicletas, que permita calcular los precios en conjunto de los repuestos y la mano de obra al momento de realizar el mantenimiento de una moto. Además, se deberá registrar la información básica de cada cliente, como su número de documento asociado a la placa de su moto.

Historia de Usuario
gherkin
Copy code
Funcionalidad: Calcular precio de mantenimiento de una moto

Como un cliente del taller de motocicletas
Quiero poder calcular el precio total del mantenimiento de mi moto
Para saber cuánto tendré que pagar

Contexto:
Dado que el cliente ha ingresado la información de su moto y de los repuestos necesarios
Y ha seleccionado el tipo de mantenimiento que desea realizar

Escenario: Calcular precio total del mantenimiento
Cuando el cliente presiona el botón "Calcular Precio"
Entonces se muestra el precio total del mantenimiento, incluyendo mano de obra y repuestos
Y se permite al cliente realizar el pago en línea

Casos de uso
CU1: Calcular precio de mantenimiento
CU1

CU2: Registrar información de cliente
CU2

Pseudocódigo
Calcular precio de mantenimiento
markdown
Copy code
1. Obtener la información de la moto del cliente
2. Obtener la lista de repuestos necesarios
3. Obtener el tipo de mantenimiento deseado
4. Calcular el costo total de los repuestos
5. Calcular el costo de la mano de obra según el tipo de mantenimiento
6. Sumar el costo total de los repuestos y la mano de obra
7. Mostrar el precio total al cliente
8. Permitir al cliente realizar el pago en línea
Registrar información de cliente
css
Copy code
1. Obtener el número de documento del cliente
2. Obtener la placa de la moto del cliente
3. Registrar la información del cliente en la base de datos
4. Asociar la información de la moto con la del cliente en la base de datos

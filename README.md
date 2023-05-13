# Taller de Motocicletas - Aplicación para calcular precios

## Descripción
En este proyecto se busca desarrollar una aplicación que permita calcular los precios en conjunto de los repuestos y la mano de obra al momento de realizar el mantenimiento de una moto en un taller de motocicletas. Como información básica de cada cliente se debe registrar su número de documento asociado a la placa de su moto.

## Historias de usuario
### Calcular precio de mantenimiento
Como un cliente del taller de motocicletas, quiero poder ingresar los repuestos que necesita mi moto y ver el precio total del mantenimiento incluyendo la mano de obra, para conocer el costo total del servicio.

**Criterios de aceptación:**
- Se debe poder ingresar una lista de repuestos necesarios para el mantenimiento de la moto.
- Se debe poder calcular el precio total de los repuestos y la mano de obra.
- Se debe mostrar el precio total al usuario.

**Escenario:**
Dado que soy un cliente del taller de motocicletas
Cuando ingreso una lista de repuestos necesarios
Entonces la aplicación me muestra el precio total del mantenimiento incluyendo la mano de obra.

**Casos de uso**
![CasosDeUso](https://github.com/EstebanGomezR/TallerMotos/assets/63615382/4a0da590-4c10-4d91-bef5-a23a23a9f751)

**Diagrama de flujo**
```mermaid
graph TD; 
Inicio(Inicio)-->IngresarDatos(Ingresar datos); IngresarDatos(Ingresar datos)-->ValidarDatos(Validar datos); ValidarDatos(Validar datos)-->|Datos válidos|Calculo(Cálculo); ValidarDatos(Validar datos)-->|Datosinválidos|IngresarDatos(Ingresar datos); Calculo(Cálculo)-->MostrarResultados(Mostrar resultados); MostrarResultados(Mostrar resultados)-->Terminar(Terminar);




# Evidencia 07 : Gestión Aeropuerto
###### Estudiante: Sabrina López
***
Se requiere digitalizar la gestión de los procesos de un aeropuerto,  es por ello que se desea automatizar el proceso de recepción de pasajeros en el aeropuerto para evitar aglomeraciones de personas.

Se desea como primer paso, recopilar la información de los vuelos en los aeropuertos, donde:

- Un aeropuerto es capaz de gestionar los aviones, donde cada avión está constituido de varios vuelos.
- Cada vuelo está asociado a una ciudad de origen y destino.
- El vuelo debe almacenar la fecha y lugares de inicio como también destino.
- Las personas que componen el vuelo principalmente son los pasajeros y pilotos. Los pasajeros no poseen información de los vuelos, para resguardar la información del resto de los pasajeros. En cambio el piloto, si tiene información del vuelo al cual está inscrito.
- Cada pasajero debe portar su pasaporte, dicho pasaporte debe contener una ID, nacionalidad y cantidad de hojas disponibles y fecha de expiración del pasaporte.

Para efectos de solución, el aeropuerto desea informar directamente a cada usuario un horario de llegada para su vuelo, evitando filas masivas. Es por ello que el aeropuerto desea realizar:

- Crear vuelos y registrar aviones.
- Registrar pasajeros y pilotos de avión en un  vuelo.
- Validar que cada pasajero que contenga un pasaporte, no esté expirado y tenga hojas disponibles.
- Buscar a todos los usuarios que tienen un vuelo en una fecha determinada.
- Buscar a todos los usuarios de un mismo vuelo para realizar seguimiento en caso.
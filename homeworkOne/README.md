# Ejercicios diagramas casos de uso y clases

## Hoja 1. Diagramas de casos de uso

### Ejercicio 1. Taller
En un taller mecánico se introducen los vehículos en un sistema que permite detectar los problemas que tiene el vehículo.

Con la ayuda de los operadores y con los informes que da el sistema del vehículo, el mecánico hará los arreglos pertinentes, mientras el gerente puede actualizar los costos y efectuar el cobro al cliente.

**Solución propuesta:**
~~~
@startuml taller
'https://plantuml.com/es/use-case-diagram

left to right direction
skinparam packageStyle rectangle

Empleado <|- Mecánico
Empleado <|-- Gerente
Empleado <|- Operador

rectangle Sistema {
    Operador -- (Introducir vehículo)
    (Detectar problema) .up.> (Introducir vehículo) : <<extend>>
    Mecánico -- (Reparar vehículo)
    (Reparar vehículo) ..> (Actualizar coste) : <<include>>
    Gerente -- (Efectuar cobro)
    (Efectuar cobro) ..> (Actualizar coste) : <<include>>
}
@enduml
~~~

**Vista previa:**
El código anterior se mostraría así en el documento:
![Diagrama taller](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/SandraLucioni/EntornosDeDesarrollo/master/homeworkOne/puml/taller.puml?token=ARMOT5PDBLQTUOUAZJBRTH3AHO2I4)


### Ejercicio 2. Tienda
En una tienda, un comerciante dispone de un sistema para gestionar su almacén. El sistema incluye las siguientes funciones:
* Gestión de archivo de proveedores.
* Posibilidad de agregar un nuevo artículo (en este caso, el archivo de proveedores se
actualiza automáticamente. Si el proveedor no existe, se puede crear).
* Gestión del inventario. Desde esta pantalla, se tiene la opción de imprimir el inventario, eliminar un artículo o editar el archivo de artículos).

**Solución propuesta:**
~~~
@startuml tienda
'https://plantuml.com/class-diagram

left to right direction
skinparam packageStyle rectangle

actor Administrador

rectangle  Lista_de_proyectos {
Administrador -- (Agregar)
Administrador -- (Buscar)
    (Buscar) --> (Eliminar)
    (Buscar) --> (Actualizar)
        (Actualizar) --> (Cambiar información)
        (Actualizar) --> (Cambio de recursos)
    (Cambiar información) --> (Informar)
    (Cambio de recursos) --> (Informar)
    (Informar) --> (Crear documento)
        (Crear documento).up.> (enviar email) : <<include>>
        (Crear documento).up.> (subir a la web) : <<include>>
}
@enduml
~~~

**Vista previa:**
![Diagrama tienda](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/SandraLucioni/EntornosDeDesarrollo/master/homeworkOne/puml/tienda.puml?token=ARMOT5KBRUD5I4ULKOWILI3AHO2JY)


### Ejercicio 3. Gestión de proyectos

La única persona que controla los proyectos es el administrador de proyectos, cuyas
funciones son las siguientes:
 * Puede agregar, eliminar y actualizar un proyecto, pero para eliminar y actualizar es
necesario encontrar el proyecto en cuestión.
 * A la hora de actualizar un proyecto se pueden dar dos situaciones:
 * Cambiar la información sobre las tareas del proyecto.
 *Cambiar los recursos asociados al proyecto.
 *Para informar a todos los miembros del equipo sobre los avances en el proyecto se
procede emitiendo un documento, que se envía vía e-mail o que se publica en un sitio web
conocido por todos. 

**Solución propuesta:**
~~~
@startuml gestion de proyectos
'https://plantuml.com/class-diagram

left to right direction
skinparam packageStyle rectangle

actor Administrador

rectangle  Lista_de_proyectos {
Administrador -- (Agregar)
Administrador -- (Buscar)
    (Buscar) --> (Eliminar)
    (Buscar) --> (Actualizar)
        (Actualizar) --> (Cambiar información)
        (Actualizar) --> (Cambio de recursos)
    (Cambiar información) --> (Informar)
    (Cambio de recursos) --> (Informar)
    (Informar) --> (Crear documento)
        (Crear documento).up.> (enviar email) : <<include>>
        (Crear documento).up.> (subir a la web) : <<include>>
}

@enduml
~~~

**Vista previa:**
![Diagrama gestion_de_proyectos](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/SandraLucioni/EntornosDeDesarrollo/master/homeworkOne/puml/gestionDeProyectos.puml?token=ARMOT5P3ZJBGGMBKKLV5AWTAHOZ7A)


## Hoja 2. Diagramas de clases

### Ejercicio 1. Empresa
Una aplicación necesita tener información sobre empresas, empleados y clientes. Estos dos últimos se caracterizan por su nombre y edad.

Los empleados tienen un sueldo bruto y los que son directivos tienen una categoría y un conjunto de empleados subordinados.

De los clientes además se necesita saber su teléfono de contacto. 

La aplicación necesita mostrar los datos de empleados y clientes.

**Solución propuesta:**

~~~
@startuml empresa
'https://plantuml.com/es/use-case-diagram

left to right direction
skinparam packageStyle rectangle

Persona <|-- Empleado
Persona <|-- Cliente

Empleado <|-- Directivo
Empleado "0..*" -- "0..*" Directivo : subordinado

Empleado "1..*" --* "1" Empresa : empleados
Cliente "0..*" --o "1..*" Empresa : clientes

class Persona {
    - nombre : String
    - edad : int
    + mostrar()
}

class Empleado {
    - sueldoBruto : float
    + mostrar()
    + calcularSalarioNeto()
}

class Cliente {
    - telefono : String
    + mostrar()
}

class Directivo {
    - categoría : int
    + mostrar()
}

class Empresa {
    - nombre : String
}
@enduml
~~~

**Vista previa:**
![Diagrama empresa](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/SandraLucioni/EntornosDeDesarrollo/master/homeworkOne/puml/empresa.puml?token=ARMOT5I4B7VJGJF2EEWNCJLAHO5JI)


### Ejercicio 2. Biblioteca
Una aplicación necesita tener información sobre una biblioteca. Realiza el diagrama de clases y
añade los métodos necesarios para realizar el préstamo y devolución de libros.
La biblioteca tiene copias de libros. Estos últimos se caracterizan por su nombre, tipo (novela,
teatro, poesía, ensayo), editorial, año y autor.
Los autores se caracterizan por su nombre, nacionalidad y fecha de nacimiento.
Cada copia tiene un identificador, y puede estar en la biblioteca, prestada, con retraso o en
reparación.
Los lectores pueden tener un máximo de 3 libros en préstamo.
Cada libro se presta un máximo de 30 días, por cada día de retraso se impone una multa de dos días
sin posibilidad de coger un nuevo libro.

**Solución propuesta:**
~~~
@startuml biblioteca
left to right direction

Libro -- Copia
Copia -- Lectores
Lectores -- Multa
Libro -- Autores
(Copia, Lectores) ... Prestamo


class Autores {
-nombre : String
-nacionalidad : String
-fechaNacimiento : Date
}

class Libro {
titulo : String
editorial : String
year : Integer
tipo : Genero

}

class Prestamo{
-inicio : Date
-fin : Date
}

class Lectores{
-numero : Integer
-nombre : String
-direccion : String
-telefono : String

}

class Copia{
-referencia : Integer
-estado : EstadoCopia
}

class Multa{
-inicio : Date
-fin : Date
}

enum Genero <<enumeration>> {
novela
teatro
poesia
ensayo
}

enum EstadoCopia <<enumeration>>{
prestado
retraso
biblioteca
reparacion
}

Multa"0..1" - Lectores
Copia "0..3" - "0..1" Lectores
Copia "1..*" - Libro
Libro "1..*" - Autores
( Copia, Lectores) ... Prestamo : recibe

@enduml
~~~

**Vista previa:**
![Diagrama biblioteca](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/SandraLucioni/EntornosDeDesarrollo/master/homeworkOne/puml/biblioteca.puml?token=ARMOT5N4KYFWEN7HX3VOLJTAHO4WU)


## Ejercicio 3. Viajes
Especificar un diagrama de clases que describa los vuelos que oferta una compañía de viajes según
la siguiente especificación:
* La compañía oferta una serie de vuelos para unas fechas concretas y con un número de
plazas.
* La compañía dispone de una flota de aviones con una capacidad que da soporte a los vuelos
ofertados.
* Las personas compran billetes para los vuelos que le interesan. Para emitir el billete es
necesario conocer el nombre, apellidos y edad del pasajero.
* Los billetes identifican el número de asiento que ocupan

**Solución propuesta:**
~~~
@startuml viajes
'https://plantuml.com/es/use-case-diagram

left to right direction
skinparam packageStyle rectangle

class Vuelo {
-plazas : Integer
-fecha : Date
}
class Avion {
-modelo : String
-capacidad : Integer
}
class Pasajero {
-nombre : String
-apellidos : String
-fechaNacimiento : Date
}
class Billete {
-asiento : Integer
}
class Oferta {
}

Vuelo -- Avion
Avion -- Billete
Billete -- Pasajero


@enduml
~~~

**Vista previa:**
![Diagrama viajes](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/SandraLucioni/EntornosDeDesarrollo/master/homeworkOne/puml/viajes.puml?token=ARMOT5O4FPQOATZMW2CFHLLAHO2LU)


## Ejercicio 4. Proyectos
Especificar un diagrama de clases que describa la gestión de proyectos informáticos siguiendo el
proceso unificado:
* Un proyecto requiere de una serie de ciclos de desarrollo.
* Todo ciclo de desarrollo concluye con una versión ejecutable y son necesarias cuatro fases
para completarlo: inicio, elaboración, construcción y transición.
* A su vez las fases requieren varias iteraciones.
* Las iteraciones son una secuencia de actividades, las cuales tienen una duración y necesitan
unos recursos (materiales y humanos).
* Las iteraciones pueden producir artefactos de muy distinto tipo (documentación, resultados
de pruebas, software).
* Es importante medir el estado de avance del proyecto.

**Solución propuesta:**
~~~
@startuml proyectos
'https://plantuml.com/es/use-case-diagram

left to right direction
skinparam packageStyle rectangle

class Proyecto{
-nombre : String
- / avance : Float
}
class Ejecutable{
-bytes
}
class Ciclo{
-tipo : TipoFase
}
class TipoFase{
inicio
elaboracion
contruccion
transicion
}
class Iteracion{
-comienzo : Date
}
class Artefacto{

}
class Documento{
-nombre : String
-ubicacion
}
class Software{
-bytes
}
class Actividad{
-duracion : Integer
-avance : Float
}
class Recurso{
+Humano
+Material
}
class humano{
-nombre : String
}
class material{
-inventario : String
}

Proyecto o-- "1..*"Ciclo : {ordered}
Ciclo -- Ejecutable
Ciclo o-- "1..*" Iteracion : {ordered}
Iteracion -- "1..*" Artefacto : produce
(Documento, Software) --|> Artefacto
Iteracion o-- "1..*" Actividad
Actividad"0..*" o-- "0..*" Recurso
(humano, material) --|> Recurso

@enduml
~~~

**Vista previa:**
![Diagrama proyectos](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/SandraLucioni/EntornosDeDesarrollo/master/homeworkOne/puml/proyectos.puml?token=ARMOT5MSQYABQTXVMCE5CL3AHO2GU)


## Ejercicio 5. Instalaciones deportivas
Un centro de instalaciones deportivas quiere hacer una aplicación de reservas. En el centro existen
instalaciones deportivas (piscinas, frontones, gimnasios y pistas de tesis). El centro en cuestión tiene
socios, de los cuales se almacenan su nombre, dirección, ciudad, provincia, teléfono y cuota.
Además, existen una serie de artículos que se pueden reservar si el socio lo requiere (balones, redes
y raquetas). Cada instalación es reservada por un socio en una fecha dada desde una hora de inicio
hasta una hora de fin. Cada reserva puede tener asociada uno o varios artículos deportivos que se
alquilan a parte. Por ejemplo, si yo quiero hacer una reserva para jugar al tenis, tengo que reservar
una instalación polideportiva y si lo necesito, las raquetas.


**Solución propuesta:**
~~~
@startuml instalaciones deportivas
'https://plantuml.com/es/use-case-diagram

left to right direction
skinparam packageStyle rectangle

class Reservas{
InstalacionesDeportivas
Fecha
}

class InstalacionesDeportivas{
-piscinas
-frontones
-gimnasios
-pistas de tenis
}

class Socios{
-nombre
-dirección
-ciudad
-provincia
-teléfono
-cuota
-reservar()
}

class Artículos{
-balones
-redes
-raquetas
}

class Fecha{
-hora de entrada
-hora de salida
}

Socios "0..*" -- "0..*" Reservas
Reservas "1" -- "1" InstalacionesDeportivas
InstalacionesDeportivas "1" -- "0..n" Artículos
Reservas "1" -- "1" Fecha
@enduml
~~~

**Vista previa:**
![Diagrama instalaciones_deportivas](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/SandraLucioni/EntornosDeDesarrollo/master/homeworkOne/puml/instalacionesDeportivas.puml?token=ARMOT5K7BNN2JX52XD2G3VDAHO2FO)


## Ejercicio 6. Sistema operativo
Hacer el Diagrama de Clases que modele el siguiente sistema: Un directorio puede contener muchos
otros directorios y puede estar contenido opcionalmente dentro de otro directorio. Todo directorio
posee exactamente un usuario que sea su propietario y hay muchos usuarios que están autorizados
para utilizar el directorio.

**Solución propuesta:**
~~~
@startuml sistema operativo
'https://plantuml.com/es/use-case-diagram

left to right direction
skinparam packageStyle rectangle

class Directorio{
}
class Usuario{
autorizado()
}

Directorio "1" -- "1..n*"Directorio
Directorio "1..*" -- "1..*" Usuario : posee propietario
Usuario "1" -- "1..n" Usuario : autorizado

@enduml
~~~

**Vista previa:**
![Diagrama sistema_operativo](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/SandraLucioni/EntornosDeDesarrollo/master/homeworkOne/puml/sistemaOperativo.puml?token=ARMOT5IR4PGQ4CJEOHE4Q53AHO2H6)


## Ejercicio 7. Compañía de seguridad
Una compañía de seguridad tiene una serie de centrales de alarma distribuidas por zonas dentro de
una ciudad. Cada central de alarma está conectada con una serie de edificios. Dentro de cada
edificio se dispone de dos tipos de alarmas: alarma de incendios y alarma de robo. Cada alarma está
conectada con una serie de sensores (de robo y de fuego). Cuando se activa un sensor de fuego, la
alarma correspondiente suena y la compañía de seguridad avisa a los bomberos y a la policía,
mientras que si se activa un sensor de robo se avisa únicamente a la policía.

**Solución propuesta:**
~~~
@startuml compania de seguridad
'https://plantuml.com/es/use-case-diagram

left to right direction
skinparam packageStyle rectangle

class Compañia{
-idCentrales : numeric
}

class Edificios{
-idEdificios : numeric
-idCentrales : numeric
-tiposDeAlarma : numeric
}
class TiposDeAlarma{
+AlarmaFuego
+AlarmaRobo
}
class AlarmaFuego{
llamarPolicia()
llamarBomberos()
}
class AlarmaRobo{
llamarPolicia()
}

Compañia "1" --> "1..*" Edificios : instalada alarma
Edificios "1..n" --> "0..2" TiposDeAlarma : instalado


@enduml
~~~

**Vista previa:**
![Diagrama compania_de_seguridad](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/SandraLucioni/EntornosDeDesarrollo/master/homeworkOne/puml/compa%C3%B1iaDeSeguridad.puml?token=ARMOT5NRSMJAKRL4ULY5FDLAHOZ6)


## Ejercicio 8. Universidad
Se trata de modelizar un sistema que gestiona las matriculas de los estudiantes en una universidad.
Una persona viene caracterizada por su dni, nombre, dirección y estado civil, y ésta puede
convertirse en estudiante al darse de alta como tal en la universidad. Como estudiante podrá
matricularse de las asignaturas que se imparten en la universidad, que tendrán un código, un
nombre, un profesor responsable y un curso asignado. Una vez matriculado, el estudiante podrá
recibir una beca, y en su nueva condición de becario tendrá asignado un nuevo código y se conocerá
el importe de la misma; al finalizar el curso, la condición de becario acabará. Una vez el estudiante
se matricula, tanto si recibe beca como si no, deberá examinarse de las asignaturas en las que se
encuentra matriculado hasta que finalice el curso y vuelva a matricularse de nuevo, o bien deje la
universidad y con ello deje de ser estudiante. Además, convendrá tener una serie de aplicaciones
tales como dar de alta a nuevas personas y asignaturas, llevar a cabo la matriculación de estudiantes
en asignaturas, registrar las notas obtenidas por los estudiantes al examinarse de cualquier
asignatura en la que están matriculados y una serie de listados tales como los alumnos matriculados
en una asignatura, las asignaturas en las que se ha matriculado un alumno y el listado de notas por
asignatura (actas).

**Solución propuesta:**
~~~
@startuml universidad
'https://plantuml.com/es/use-case-diagram

left to right direction
skinparam packageStyle rectangle

class Persona{
+dni
+nombre
+direccioon
+estado civil
+matricularse()
}
class Estudiante{
+matricular()
+nuevoEstudiante()
+listadoAlumnos()
}
class Asignaturas{
+codigo
+nombre
+codprofesor
+curso asignado
+examenes()
+darDeAltaAsignatura()
+nuevaMatriculacion()
+listadoAsignatura()
}
class Beca{
+nuevoCodigo
+importe
+cambiarEstadoAlumnoBeca()
+finalizarEstadoAlumnoBeca()
}

class Examen {
+registrarNotas()
+accederAlListadoNotas()
}

Persona -- Estudiante
Estudiante --> Beca
Estudiante --> Asignaturas
Asignaturas -- Examen

@enduml
~~~

**Vista previa:**

![Diagrama universidad](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/SandraLucioni/EntornosDeDesarrollo/master/homeworkOne/puml/universidad.puml?token=ARMOT5PERYGQP7A6UMHBM2DAHO2KU)

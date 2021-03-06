# TRABAJO DE ENTONOS
**JAVADOC**

__________________________________________________________
## **BIBLIOTECA**

### _Class Summary_

### **Autores**

* Constructor Summary

| Contructor | Description |
| --- | --- |
Autores​(java.lang.String nombre, java.lang.String nacionalidad, java.util.Date fechaNacimiento, java.util.List<Libro> libros) | Constructor

* Method Summary

| Modifier and Type | Method | Description |
| --- | --- | --- |
void | addLibro​(Libro libro) | Añade un libro a la lista de autores
java.lang.String | mostrar() 

| Methods inherited from class java.lang.Object |
| --- |
clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait

* Constructor Details

| Autores |
| --- | 
```
public Autores​(java.lang.String nombre,
java.lang.String nacionalidad,
java.util.Date fechaNacimiento,
java.util.List<Libro> libros)
Constructor

Parameters:
    nombre - 
    nacionalidad - 
    fechaNacimiento - 
    libros - 
```

* Method Details

| mostrar |
| --- |
```
public java.lang.String mostrar()
See Also:
    mostrar()
```

| addLibro |
| --- |
```
public void addLibro​(Libro libro)
Añade un libro a la lista de autores
Parameters:
        libro -
```


### **Copia**

* Constructor Summary
```
Copia​(int referencia, EstadoCopia estado, Libro libro)
```

* Method Summary


* Constructor Details

```
public Copia​(int referencia,
EstadoCopia estado,
Libro libro)
Constructor

Parameters:
    referencia - 
    estado - 
    libro - 
```  

* Method Details 

### **Libro** 
 Una Biblioteca que presta libros durante un determinado tiempo.
 
 * Constructor Summary 
 
Constructor | Description 
| --- | --- |
*Libro*| Constructor vacio
*Libro*(java.lang.String titulo, java.lang.String editorial, java.lang.Integer year, Genero tipo, java.util.List<Autores> autores, java.util.List<Copia> copia) | Constructor con todos los atributos:
 
 
 * Method Summary

| *All Methods* | *Instance Methods* | *Concrete Methods*|
 --- | --- | ---
 *Modifier and Type* | *Method* | *Description*|
| --- |---|---|
 void | addAutor​(Autores autor) | Añade un autor a la lista de autores
 void | addCopia​(Copia copia) 	| Añade una Copia a la lista de copias
 java.lang.String |	mostrar()
 
 |*Methods inherited from class java.lang.Object*|
 | ------------- |
 | clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait |
  
* Constructor Details
  
|*Libro*|
 | --- |
|public Libro()
Constructor vacio|

|*Libro*|
 | --- |
|
```
public Libro​(java.lang.String titulo,
java.lang.String editorial,
java.lang.Integer year,
Genero tipo,
java.util.List<Autores> autores,
java.util.List<Copia> copia)
Constructor con todos los atributos:

Parameters:
    titulo - 
    editorial - 
    year - 
    autores - 
    copia - 
```

* Method Details


|mostrar|
| --- |
```
public java.lang.String mostrar()
See Also:
    mostrar()
```
|addAutor|
| --- |
```
public void addAutor​(Autores autor)
AÃ±ade un autor a la lista de autores
Parameters:
    autor - 
```
|addCopia|
| --- |
```
public void addCopia​(Copia copia)
AÃ±ade una Copia a la lista de copias
Parameters:
    copia -
``` 


### **Multa**

* Constructor Summary

**Constructors**
|Constructor | Description |
| --- | --- |
Multa​(java.util.Date inicio) | Constructor con todos los atributos:


* Method Summary

| Modifier and Type |	Method 	|Description |
| --- | --- | --- |
boolean | isSancionado() | Metodo Booleano isSancionado para saber si el lector estÃ¡ sancionado o no.
java.lang.String mostrar() 	 

| **Methods inherited from class java.lang.Object** |
| --- |
clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait


*Constructor Details

| Multa |
| --- |
``` 
public Multa​(java.util.Dateinicio)
Constructor con todos losatributos:
Parameters:
    inicio - setFechaFin()
``` 


* Method Details

|mostrar|
| --- |
```
public java.lang.String mostrar()
See Also:
    mostrar()
```

|isSancionado|
| --- |
```
public boolean isSancionado()
Metodo Booleano isSancionado para saber si el lector esta sancionado o no.
```

### **Prestamo**

* Constructor Summary

**Constructors**
| Constructor | Description |
| --- | --- |
Prestamo​(java.util.Date inicio, java.util.Date fin) | Constructor


* Method Summary

|Modifier and Type | Method | Description |
| --- | --- | --- |
boolean | BlockPrestamo() | Metodo para ponerle un li­mite de 3 libros, Devuelve flase si es mayor.
java.lang.String mostrar() 

| Methods inherited from class java.lang.Object |
| --- |
clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait


*Constructor Details

| Prestamo |
| --- |
```
public Prestamo​(java.util.Dateinicio,
java.util.Date fin)
Constructor
Parameters:
fin - 
inicio - 
```

* Method Details


| BlockPrestamo |
| --- |
public boolean BlockPrestamo()
Metodo para ponerle un limitede 3 libros, Devuelve false sies mayor.

| mostrar |
| --- |
```
public java.lang.String mostrar()
See Also:
mostrar()
```


### **Socio**

* Constructor Summary

**Constructors**
| Constructor | Description |
| --- | --- |
Socio() |Constructor vacio
Socio​(int numero, java.lang.String nombre, java.lang.String direccion, java.lang.String telefono) | Constructor con todos los atributos:


* Method Summary

| Modifier and Type | Method |Description |
| --- | --- | --- |
java.lang.Boolean | isSancionado()| Metodo booleano para saber siel estado del lector es sancionado.
java.lang.String mostrar() 


| Methods inherited from classjava.lang.Object |
| --- |
clone, equals, finalize,getClass, hashCode, notify,notifyAll, toString, wait, wait,wait


* Constructor Details

| Socio |
|--- |
public Socio()
Constructor vacio

| Socio |
| --- |
```
public Socio​(int numero,
java.lang.String nombre,
java.lang.String direccion,
java.lang.String telefono)
Constructor con todos losatributos:
    Parameters:
        numero - 
        nombre - 
        direccion - 
        telefono - 
```

* Method Details

| isSancionado |
| --- |
public java.lang.BooleanisSancionado()
Metodo booleano para saber siel estado del lector es sancionado.

| mostrar |
| --- |
```
public java.lang.String mostrar()
See Also:
    mostrar()
```

### _Enum Summary_

### **EstadoCopia**

* Nested Class Summary

| Nested classes/interfaces inherited from class java.lang.Enum |
| --- |
java.lang.Enum.EnumDesc<E extends java.lang.Enum<E>>

* Enum Constant Summary

**Enum Constants**
| Enum Constant | Description |
| --- | --- |
BIBLIOTECA 	 
PRESTADO | Lista de las distintas constantes que existen para la copia de un libro
REPARACION 	 
RETRASO

* Method Summary

| Modifier and Type | Method | Description |
| --- | --- | --- |
static EstadoCopia | valueOf​(java.lang.String name) | Returns the enum constant of this type with the specified name.
static EstadoCopia[] | values() |Returns an array containing the constants of this enum type, in the order they are declared.


| Methods inherited from class java.lang.Enum |
| --- |
clone, compareTo, describeConstable, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf

| Methods inherited from class java.lang.Object |
| --- |
getClass, notify, notifyAll, wait, wait, wait

* Enum Constant Details

| PRESTADO |
| --- |
public static final EstadoCopiaPRESTADO
Lista de las distintasconstantes que existen para lacopia de un libro

| RETRASO |
| --- |
public static final EstadoCopiaRETRASO

| BIBLIOTECA |
| --- |
public static final EstadoCopiaBIBLIOTECA

| REPARACION |
| --- |
public static final EstadoCopiaREPARACION

* Method Details

| values |
| --- |
```
public static EstadoCopia[] values()
Returns an array containing the constants of this enum type, in the order they are declared.
Returns:
an array containing the constants of this enum type, in the order they are declared.
```
| valueOf |
| --- |
```
public static EstadoCopia valueOf​(java.lang.String name)
Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.)

Parameters:
    name - the name of the enum constant to be returned.
Returns:
    the enum constant with the specified name
Throws:
    java.lang.IllegalArgumentException - if this enum type has no constant with the specified name
    java.lang.NullPointerException - if the argument is null 
```

### **Genero**

* Nested Class Summary

| Nested classes/interfaces inherited from class java.lang.Enum |
| --- |
java.lang.Enum.EnumDesc<E extends java.lang.Enum<E>>

* Enum Constant Summary

| Enum Constants | Enum Constant |
| --- | --- |
Description
ENSAYO 	 
NOVELA | Lista de las distintas constantes que existen para la genero de un libro
POESIA 	 
TEATRO

* Method Summary

| Modifier and Type | Method | Description |
| --- | --- | --- |
static Genero | valueOf​(java.lang.String name) | Returns the enum constant of this type with the specified name.
static Genero[] | values() | Returns an array containing the constants of this enum type, in the order they are declared.

| Methods inherited from class java.lang.Enum |
| --- |
clone, compareTo, describeConstable, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf

| Methods inherited from class java.lang.Object |
| --- |
getClass, notify, notifyAll, wait, wait, wait


* Enum Constant Details

| NOVELA |
| --- |
public static final Genero NOVELA
Lista de las distintas constantes que existen parala genero de un libro

| TEATRO |
| --- |
public static final Genero TEATRO

| POESIA |
| --- |
public static final Genero POESIA

| ENSAYO |
| --- |
public static final Genero ENSAYO


* Method Details

| values |
| --- |
```
public static Genero[] values()
Returns an array containing the constants of thisenum type, in the order they are declared.
Returns:
    an array containing the constants of this enum type, in the order they are declared
```

| valueOf |
| --- |
```
public static Genero valueOf​(java.lang.Stringname)
Returns the enum constant of this type with thespecified name. The string must match exactly anidentifier used to declare an enum constant inthis type. (Extraneous whitespace characters arenot permitted.)
Parameters:
    name - the name of the enum constant to be returned.
Returns:
    the enum constant with the specified name
Throws:
    java.lang.IllegalArgumentException - if this enum type has no constant with the specified name
    java.lang.NullPointerException - if the argument is null
```

## **INSTALACIONES DEPORTIVAS**

### _Class Summary_

### **Fecha**

* Constructor Summary

**Constructors**

|Constructor | Description |
| --- | --- |
Fecha​(java.sql.Date horaInicio, java.sql.Date horaFinal) | Constructor con todos los atributos:

* Method Summary

Modifier and Type |	Method | Description
| --- | --- | --- |
java.lang.String | toString() | Sobrescribe el metodo de la clase madre

| Methods inherited from class java.lang.Object |
| --- |
clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait

* Constructor Details

| Fecha |
| --- |
```
public Fecha​(java.sql.Date horaInicio,
java.sql.Date horaFinal)
Constructor con todos los atributos:
Parameters:
    horaInicio - 
    horaFinal - 
```


* Method Details

| toString |
| --- |
```
public java.lang.String toString()
Sobrescribe el mÃ©todo de la clase madre
Overrides:
    toString in class java.lang.Object
See Also:
    toString()
```

### **Reserva**

* Constructor Summary

**Constructors**

Constructor | Description
| --- | --- |
Reserva​(java.util.Date inicio, java.util.Date fin, java.util.Date fecha, java.util.List<Instalaciones> instalaciones, java.util.List<Articulos> articulos) | Constructor


* Method Summary

| Modifier and Type | Method | Description |
| --- | --- | --- |
void | addArticulo​(Articulos articulo) | Añade una articulo a la lista de articulos a reservar
void | addInstalacion​(Instalaciones instalacion) 	| Añade una instalacion a la lista de instalaciones a reservar
void | addSocio​(Socios socio) 	| Añade un socio a la lista de socios
void | fechaReserva​(java.util.Date fecha) | Añade una fecha de reserva
void | Reserva​(java.util.Date inicio, java.util.Date fin) | Añade unas horas de inicio y fin de reserva

| Methods inherited from class java.lang.Object |
| --- |
clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait


* Constructor Details

| Reserva |
| --- |
```
public Reserva​(java.util.Date inicio,
java.util.Date fin,
java.util.Date fecha,
java.util.List<Instalaciones> instalaciones,
java.util.List<Articulos> articulos)
Constructor
Parameters:
    instalaciones - 
    articulos - 
    inicio - 
    fin - 
    fecha - 
```

* Method Details

| addInstalacion |
| --- |
```
public void addInstalacion​(Instalacionesinstalacion)
AÃ±ade una instalacion a la lista de instalaciones areservar
Parameters:
    instalacion - 
```

| addArticulo |
| --- |
```
public void addArticulo​(Articulos articulo)
AÃ±ade una articulo a la lista de articulos areservar
Parameters:
    articulo -
```

| Reserva |
| --- |
```
public void Reserva​(java.util.Date inicio,
java.util.Date fin)
AÃ±ade unas horas de inicio y fin de reserva
Parameters:
    inicio - 
    fin - 
```

| fechaReserva |
| --- |
```
public void fechaReserva​(java.util.Date fecha)
AÃ±ade una fecha de reserva
Parameters:
    fecha - 
addSocio
public void addSocio​(Socios socio)
AÃ±ade un socio a la lista de socios
Parameters:
    socio - 
```

### **Socios**

* Constructor Summary

**Constructors**

| Constructor |	Description |
| --- | --- |
Socios​(java.lang.String nombre, java.lang.String direccion, java.lang.String ciudad, java.lang.String provincia, java.lang.Integer telefono, java.lang.Integer cuota) 	| Constructor con todos los atributos:


* Method Summary

Modifier and Type |	Method | Description
| --- | --- | --- | 
void | addSocio​(Socios socios) | Metodo de añadir socios
java.lang.String | toString() | Sobrescribe el mÃ©todo de la clase madre

| Methods inherited from class java.lang.Object |
| --- |
clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait


* Constructor Details

| Socios |
| --- |
```
public Socios​(java.lang.String nombre,
java.lang.String direccion,
java.lang.String ciudad,
java.lang.String provincia,
java.lang.Integer telefono,
java.lang.Integer cuota)
Constructor con todos los atributos:
Parameters:
    nombre - 
    direccion - 
    ciudad - 
    provincia - 
    telefono - 
    cuota - 
```

* Method Details

| toString |
| --- |
```
public java.lang.String toString()
Sobrescribe el mÃ©todo de la clase madre
Overrides:
    toString in class java.lang.Object
See Also:
    toString()
```

| addSocio |
| --- |
```
public void addSocio​(Socios socios)
Metodo de aÃ±adir socios
```

### **Enum Summary**

### Articulos

* Nested Class Summary

| Nested classes/interfaces inherited from class java.lang.Enum |
| --- |
java.lang.Enum.EnumDesc<E extends java.lang.Enum<E>>


* Enum Constant Summary

| Enum Constants Enum Constant | Description
| --- | --- |
BALONES | Enumerado para los articulos de las instalaciones deportivas
RAQUETAS 	 
REDES

* Method Summary
Modifier and Type |	Method | Description
| --- | --- | --- |
static Articulos | valueOf​(java.lang.String name) | Returns the enum constant of this type with the specified name.
static Articulos[] | values() | Returns an array containing the constants of this enum type, in the order they are declared.

| Methods inherited from class java.lang.Enum |
| --- |
clone, compareTo, describeConstable, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf

| Methods inherited from class java.lang.Object |
| --- |
getClass, notify, notifyAll, wait, wait, wait


* Enum Constant Details

| BALONES |
| --- |
public static final Articulos BALONES
Enumerado para los articulos de las instalacionesdeportivas

| REDES |
| --- |
public static final Articulos REDES

| RAQUETAS |
| --- |
public static final Articulos RAQUETAS

* Method Details

| values |
| --- |
```
public static Articulos[] values()
Returns an array containing the constants of thisenum type, in the order they are declared.
Returns:
    an array containing the constants of this enum type, in the order they are declared
```

| valueOf |
| --- |
```
public static Articulos valueOf​(java.lang.Stringname)
Returns the enum constant of this type with thespecified name. The string must match exactly anidentifier used to declare an enum constant in thistype. (Extraneous whitespace characters are notpermitted.)
Parameters:
    name - the name of the enum constant to be returned.
Returns:
    the enum constant with the specified name
Throws:
    java.lang.IllegalArgumentException - if this enum type has no constant with the specified name
    java.lang.NullPointerException - if the argument is null
```

### **Instalaciones**

* Nested Class Summary

| Nested classes/interfaces inherited from class java.lang.Enum |
| --- |
java.lang.Enum.EnumDesc<E extends java.lang.Enum<E>>


* Enum Constant Summary

| Enum Constants Enum Constant | Description |
| --- | --- |
FRONTONES 	 
GIMNASIOS 	 
PISCINAS | Enumerado para las instalaciones deportivas
PISTAS_TENIS 	 

* Method Summary

| Modifier and Type | Method | Description |
| --- | --- | --- |
static Instalaciones | valueOf​(java.lang.String name) 	 | Returns the enum constant of this type with the specified name.
static Instalaciones[] | values() | Returns an array containing the constants of this enum type, in the order they are declared.

| Methods inherited from class java.lang.Enum |
| --- |
clone, compareTo, describeConstable, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf

| Methods inherited from class java.lang.Object |
| --- |
getClass, notify, notifyAll, wait, wait, wait

* Enum Constant Details

| PISCINAS |
| --- |
public static final Instalaciones PISCINAS
Enumerado para las instalaciones deportivas

| FRONTONES |
| --- |
public static final Instalaciones FRONTONES

| GIMNASIOS |
| --- |
public static final Instalaciones GIMNASIOS

| PISTAS_TENIS |
| --- |
public static final Instalaciones PISTAS_TENIS


* Method Details

| values |
| --- |
```
public static Instalaciones[] values()
Returns an array containing the constants of thisenum type, in the order they are declared.
Returns:
    an array containing the constants of this enum type, in the order they are declared
```

| valueOf |
| --- |
```
public static Instalaciones valueOf​(java.langString name)
Returns the enum constant of this type with thespecified name. The string must match exactly anidentifier used to declare an enum constant in thistype. (Extraneous whitespace characters are notpermitted.)
Parameters:
    name - the name of the enum constant to be returned.
Returns:
    the enum constant with the specified name
Throws:
    java.lang.IllegalArgumentException - if this enum type has no constant with the specified name
    java.lang.NullPointerException - if the argument is null
```

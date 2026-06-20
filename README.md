Duoc UC
🧠 Evaluación 2 – Desarrollo Orientado a Objetos I

👤 Autor del Proyecto

Nombre completo: Joaquin Antonio Gonzalez Quezada
Sección: [DESARROLLO ORIENTADO A OBJETOS I_001A]

Carrera: Analista Programador Computacional

Sede: Campus Virtual

Descripción general del sistema


Este proyecto corresponde a la segunda evaluación de la asignatura Desarrollo Orientado a Objetos I.

El sistema fue desarrollado para la empresa Llanquihue Tour con el objetivo de mejorar la gestión de la información de los empleados. Para ello, se creó una aplicación en Java capaz de leer datos desde un archivo de texto, crear objetos con esa información y mostrarlos por consola.

Durante el desarrollo se aplicaron conceptos vistos en la asignatura como encapsulamiento, herencia, composición,creacion de medotos,uso de ArrayList y lectura de archivos.

 Estructura general del proyecto

 src/

├── app/ Clase principal con el método Main

├── model/  Clases del dominio

├── service/  Gestión y carga de datos desde archivos


Archivo utilizado


tour.txt

Archivo de texto que almacena la información de los empleados. Este archivo es leído por la clase `GestorDatos`, que procesa cada línea y crea los objetos correspondientes para ser almacenados en un `ArrayList`.


 Clases implementadas
 

Persona
Clase base que representa a una persona mediante atributos como nombre, edad, rut, teléfono y dirección.

Direccion
Clase utilizada mediante composición para almacenar información relacionada con la dirección de una persona.

 Empleado
Clase que hereda de Persona e incorpora atributos como cargo y estado de turno.

 GestorDatos
Clase encargada de leer la información desde archivos de texto, crear los objetos correspondientes , almacenarlos y crear metodos.

Main
Clase principal encargada de ejecutar el programa y mostrar los resultados por consola.


⚙️ Instrucciones para clonar y ejecutar el proyecto

Clona el repositorio desde GitHub:
git clone https://github.com/JuakoG/SistemaGestionLlanquihueTour.git
Abre el proyecto en IntelliJ IDEA.

Ejecuta el archivo Main.java desde el paquete app.

Observar los resultados generados en la consola.

Repositorio GitHub: https://github.com/JuakoG/SistemaGestionLlanquihueTour Fecha de entrega: [20/06/2026]

© Duoc UC | Escuela de Informática y Telecomunicaciones 

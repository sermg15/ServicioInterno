# ServicioInterno
Servicio Interno de la aplicación SuperMerCasa

**Nombre: SuperMerCasa**

- **Integrantes del grupo:**
   - Sergio Martínez González
   - Ignacio Sainz de la Maza Martín
   - Mario García Barrero

- **Descripción de la temática**:
  - Tienda online de un supermercado. 

- **Funcionalidad pública** (Funcionalidad para usuarios no registrados):

  - Registrarse en la web / iniciar sesión. 
  - Navegar de forma libre por la web para ver los productos, categorías y ofertas. 
  - Ver en el mapa los centros físicos. 
  - Información de contacto con la empresa.  
  - Búsqueda de productos por nombre. 

- **Funcionalidad privada** (Funcionalidades después del registro):

  - Gestionar carrito(ver carrito, añadir productos, eliminar productos, etc). 
  - Ver el historial de compras. 
  - Realizar seguimiento del pedido.
  - Admministrar perfil con información del usuario. 
  - Valorar con un método de estrellas los productos comprados.

- **Entidades principales**:

  - Usuario: Persona que usa la web y de la cual se tiene la información que dicha persona facilita (nombre, apellidos, domicilio, teléfono de contacto...).
  - Producto: Entidad que representa el producto, que almacena toda su información (categoría, precio, peso, cantidad...).
  - Carrito de compra: Listado de productos guardados pendientes de compra.
  - Pedido: Entidad que representa la lista de productos que el usuario tiene en el carrito y que ya se ha comprado. 
  - Ofertas: Promociones aplicadas a ciertos productos o categorías que van variando con el tiempo. 

- **Funcionalidades del servicio interno**:

  El servicio interno de la página realizará ciertas tareas:

    - Actualización del stock de los productos. 
    - Actualización de las ofertas cada cierto tiempo. 
    - Envío de correos de confirmación de login, pedidos realizados y nuevas ofertas. 
    - Actualización de la información de seguimiento de los pedidos. 


- **Instrucciones para desplegar la aplicación en OpenStack**:
   - Compilación: para compilar la aplicación y obtener el .jar tanto de la aplicación como del servicio interno se ha usado la opción Maven->Lifecycle->Package de IntellIJ. 
   - Subir los archivos .jar a la máquina (el de la aplicación y el del servicio interno).
   - Con la máquina desplegada, y haciendo uso del comando 
    ````
   scp -i 'ubicación de la clave ssh' 'ubicación del archivo a subir' ubuntu@10.100.139.249:'ubicacion a la que se sube el archivo'
   ````

- **Configuración de la máquina para la correcta ejecución de la aplicación**:
   - Lo primero de todo es actualizar el repositorio de paquetes con el siguiente comando 
   ````
   sudo apt update
   ````
   - Hay que instalar Java 19 (ya que es el que usamos en el desarollo de nuestro proyecto). Para instalar Java usamos el comando 
    ````
   sudo apt install ./jdk-19_linux-x64_bin.deb"
   ````
   - Instalación de MySQL con el comando 
   ````
   sudo apt-get install mysql-server
   ````
   También hay que instalar un paquete de seguridad para proteger la base de datos, usando el comando 
   ````
   sudo mysql_secure_installation
   ````
   - Una vez instalado y configurado MySQL, debemos conectarnos al servidor de MySQL con el comando 
   ````
   sudo mysql
   ````
   y, una vez dentro, crear la base de datos que se usará en el proyecto con el comando 
   ````
   CREATE DATABASE smc
   ````
   ('smc' es el nombre de la base de datos que se usa en esta aplicación).
   
   Una vez configurada la base de datos y subidos los archivos .jar a la máquina, podremos ejecutarlos desde la consola de comandos con el comando:
   ````
   java -jar NombreArchivo.jar
   ````
   Todo esto se realiza estando conectado a la máquina. Para que todo funcione correctamente se debe ejecutar el archivo .jar tanto de la aplicación principal como del servicio interno.

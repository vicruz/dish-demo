# Proyecto Dish
## Ejecución del proyecto

Para ejecutar el proyecto, en la carpeta raíz del mismo, se debe ejecutar la instrucción 
```sh
mvn spring-boot:run
```
Se podrá navegar en la aplicación en la ruta `http://localhost:8080`

## Base de datos
Se ha configurado H2 como base de datos, esta se renueva cada vez que se inicia la aplicación. El script para crear la base de datos se encuentra en la ruta `src/main/resources/data.sql`. El proyecto toma de manera automática este script para crear la base de datos

# NOTA
NO hay validaciones en los campos de texto y al editar el proyecto, la fecha aparece en un formato incorrecto, por lo cual se tiene que ajustar nuevamente

## TODO
- Validaciones de campos de texto
- Validaciones para evitar pantallas de error
- Mensajes de éxito o error
- Documentación de código
- Manuales de usuario
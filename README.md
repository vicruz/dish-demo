# Proyecto Dish
## Ejecución del proyecto

Para ejecutar el proyecto, en la carpeta raíz del mismo, se debe ejecutar la instrucción 
```sh
mvn spring-boot:run
```
Se podrá navegar en la aplicación en la ruta `http://localhost:8080`

## Usuarios
| Usuario | Password | Rol |
| ------ | ------ | ------ |
| admin | admin | ADMIN |
| user | user | USER |

## Base de datos
Se ha configurado H2 como base de datos, esta se renueva cada vez que se inicia la aplicación. El script para crear la base de datos se encuentra en la ruta `src/main/resources/data.sql`. El proyecto toma de manera automática este script para crear la base de datos

# Manual de usuario
El manual de usuario se encuentra dentro del proyecto en la ruta src/main/resources/Manual de Usuario.docx
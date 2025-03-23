# 📌 Proyecto: API REST con Spring Boot

## 📖 Descripción

Esta API REST desarrollada con **Spring Boot** implementa patrones de diseño como **DTO, DAO y BUILDER**, además de seguir una arquitectura con **separación de capas** (Controllers, Entities, Persistence, Repository, Service). La API permite gestionar información de **fabricantes y productos**, con una relación **uno a muchos** en la base de datos **MySQL**.

## 🚀 Características

- Implementación de **CRUD completo** para fabricantes y productos.
- Uso de **DTOs** para manejar la transferencia de datos.
- Aplicación del patrón **DAO** para la abstracción de la lógica de acceso a datos.
- Arquitectura en capas para mejorar la escalabilidad y mantenibilidad.
- Integración con **MySQL** para almacenamiento de datos.
- Exposición de **endpoints RESTful** utilizando **Spring Boot**.

## 🔗 Endpoints

### 🏭 Fabricantes


| Método | Endpoint                 | Descripción                    |
| ------- | ------------------------ | ------------------------------- |
| GET     | `/api/maker/find/{id}`   | Obtener un fabricante por ID    |
| GET     | `/api/maker/findAll`     | Listar todos los fabricantes    |
| POST    | `/api/maker/save`        | Guardar un nuevo fabricante     |
| PUT     | `/api/maker/update/{id}` | Actualizar un fabricante por ID |
| DELETE  | `/api/maker/delete/{id}` | Eliminar un fabricante por ID   |

### 📦 Productos


| Método | Endpoint                   | Descripción                  |
| ------- | -------------------------- | ----------------------------- |
| GET     | `/api/product/find/{id}`   | Obtener un producto por ID    |
| GET     | `/api/product/findAll`     | Listar todos los productos    |
| POST    | `/api/product/save`        | Guardar un nuevo producto     |
| PUT     | `/api/product/update/{id}` | Actualizar un producto por ID |
| DELETE  | `/api/product/delete/{id}` | Eliminar un producto por ID   |

## 🛠️ Tecnologías Utilizadas

- **Java 23**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Maven**
- **Lombok** (para reducir código repetitivo)
- **Postman** (para pruebas de API)

## 🏗️ Arquitectura

📂 **Proyecto organizado en capas MVC:**

```
📦 src/main/java/com.application.rest
 ┣ 📂 controller       # Manejo de endpoints
 ┣ 📂 entities           # Definición de entidades
 ┣ 📂 persistence      # Lógica de persistencia
 ┣ 📂 repository       # Acceso a la base de datos
 ┗ 📂 service          # Lógica de negocio
```

## 🚀 Instalación y Uso

### 1️⃣ Clonar el repositorio

```bash
git clone https://github.com/EduCasanasCu/API_REST_SPRINGBOOT.git
cd API_REST_SPRINGBOOT
```

### 2️⃣ Configurar la base de datos

Asegúrate de tener MySQL instalado y configurado. Luego, modifica el archivo `application.properties` que se encuentra en la carpeta `resources` con tus credenciales de conexión:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tu_basedatos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```

### 3️⃣ Ejecutar la aplicación

Compila y ejecuta el proyecto con:

```bash
mvn spring-boot:run
```

La API estará disponible en `http://localhost:8080`

## 📌 Contribuciones

Si deseas contribuir, ¡siempre son bienvenidas! Haz un **fork** del repositorio y envía tu **pull request**. 😊

## 📄 Licencia

Este proyecto está bajo la licencia **MIT**.

---

_Desarrollado con ❤️ por [Edu Casanas](https://github.com/EduCasanasCu)_

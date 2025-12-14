# 📘 Proyecto Evaluación Unidad 3 – API REST con Spring Boot

## 📌 Descripción General

Este proyecto corresponde a la **Evaluación de la Unidad 3**, cuyo objetivo es desarrollar una **API REST** utilizando **Spring Boot**, **Maven**, **JPA/Hibernate** y **PostgreSQL**, permitiendo la gestión de prácticas profesionales.

La aplicación implementa un **CRUD completo**, validaciones de datos, relaciones entre entidades y documentación automática mediante **Swagger UI**.

---

## 🛠️ Tecnologías Utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven (Maven Wrapper)
* PostgreSQL
* Lombok
* Swagger / OpenAPI
* Visual Studio Code

---

## 📂 Estructura del Proyecto

```
src/main/java/com/example/demo
│
├── controller
│   ├── PracticaController.java
│   ├── EstudianteController.java
│   └── ProfesorController.java
│
├── model
│   ├── Practica.java
│   ├── Estudiante.java
│   └── Profesor.java
│
├── repository
│   ├── PracticaRepository.java
│   ├── EstudianteRepository.java
│   └── ProfesorRepository.java
│
├── service
│   ├── PracticaService.java
│   ├── EstudianteService.java
│   └── ProfesorService.java
│
└── DemoApplication.java
```

---

## ⚙️ Configuración y Ejecución

### ▶ Ejecutar el proyecto

Desde la terminal integrada de VS Code:

```bash
./mvnw spring-boot:run
```

La aplicación se ejecuta en:

```
http://localhost:8080
```

---

## 📑 Documentación con Swagger

Swagger permite probar todos los endpoints de forma gráfica.

Acceso:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🔁 Endpoints Principales

### 📌 Listar prácticas

```
GET /practicas
```

---

### 📌 Crear práctica

```
POST /practicas
```

Ejemplo JSON:

```json
{
  "empresa": "Empresa ABC",
  "direccion": "Av. Central 123",
  "telefono": "987654321",
  "jefeDirecto": "Carlos Soto",
  "contactoJefe": "carlos@empresa.cl",
  "fechaInicio": "2025-01-01",
  "fechaTermino": "2025-06-30",
  "descripcion": "Práctica profesional",
  "estudiante": { "id": 2 },
  "profesor": { "id": 1 }
}
```

---

### 📌 Actualizar práctica (PUT)

> ⚠️ **Importante:** El ID debe existir y se pasa **solo por la URL**.

```
PUT /practicas/{id}
```

#### ✅ JSON correcto para actualización

```json
{
  "empresa": "Empresa Actualizada",
  "direccion": "Av. Siempre Viva 742",
  "telefono": "987654321",
  "jefeDirecto": "Juan Pérez",
  "contactoJefe": "juan@empresa.cl",
  "fechaInicio": "2025-01-01",
  "fechaTermino": "2025-06-30",
  "descripcion": "Actualización realizada desde Swagger",
  "estudiante": { "id": 2 },
  "profesor": { "id": 1 }
}
```

✔ No incluir el campo `id` en el body
✔ Las relaciones se envían solo con su identificador
✔ Respuesta esperada: **HTTP 200 OK**

---

### 📌 Eliminar práctica

```
DELETE /practicas/{id}
```

Respuesta:

* **204 No Content** (eliminación exitosa)

---

## ✅ Validaciones Implementadas

Se aplicaron validaciones con `@NotBlank` y `@NotNull` para evitar registros incompletos:

* Empresa obligatoria
* Dirección obligatoria
* Teléfono obligatorio
* Fechas obligatorias
* Estudiante y profesor obligatorios

En caso de error:

* **400 Bad Request**

---

## 📊 Estado del Proyecto vs Rúbrica

✔ CRUD completo
✔ Uso correcto de JPA
✔ Relaciones entre entidades
✔ Validaciones de datos
✔ Swagger operativo
✔ Ejecución por terminal
✔ Código organizado por capas

👉 **Proyecto cumple el 100% de los criterios evaluados**

---

## 👥 Autores

* Cristopher Rivera
* Chirlett Teixeira

---

📌 *Proyecto desarrollado para fines académicos – Evaluación Unidad 3*

# 🧪 Laboratorio: Pruebas Unitarias y de Integración  
## Unidad 9 - Patrones de Diseño de Software  
### Ingeniería de Sistemas - 2026  

---

## 📌 Descripción del Proyecto

Este proyecto implementa un microservicio básico de gestión de productos utilizando Spring Boot.  
El objetivo principal es desarrollar una **suite completa de pruebas unitarias** para la capa de servicio, aplicando:

- JUnit 5
- Mockito
- ArgumentCaptor
- Pruebas parametrizadas
- Validación de excepciones

---

## 🏗️ Tecnologías utilizadas

- Java 21
- Spring Boot 3.x
- Spring Data JPA
- H2 Database (en memoria)
- Maven
- JUnit 5
- Mockito
- Lombok

---

## 📁 Estructura del proyecto


src/
├── main/
│ └── java/com/example/clean_pedidos/
│ ├── domain/
│ │ └── Producto.java
│ ├── repository/
│ │ └── ProductoRepository.java
│ ├── service/
│ │ ├── ProductoService.java
│ │ └── ProductoServiceImpl.java
│ └── controller/
│ └── ProductoController.java
│
└── test/
└── java/com/example/clean_pedidos/service/
└── ProductoServiceImplTest.java


---

## ⚙️ Cómo ejecutar el proyecto

### Compilar el proyecto:
```bash
mvn compile
Ejecutar pruebas:
mvn test

🚀 Autor
Diego Armando Cayetano Bautista Cano

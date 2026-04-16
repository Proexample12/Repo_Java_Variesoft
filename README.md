# VarieSoft

## Versión
**1.0**

## Autor
**Kenneth Zamora**

## Curso
**Programación Orientada a Objetos**

## Descripción del proyecto
VarieSoft es un sistema desarrollado en Java para la gestión de un kiosko de variedades ubicado en un centro comercial de alta afluencia. El sistema permite administrar productos, clientes, proveedores, facturación, inventario y reportes de ventas.

Este proyecto fue elaborado aplicando principios de Programación Orientada a Objetos, especialmente:
- Single Responsibility Principle.
- Open/Closed Principle.
- Liskov Substitution Principle.
- Interface Segregation Principle.

## Objetivo
Desarrollar una aplicación que ayude a mejorar el control de inventario, agilizar la facturación y facilitar la generación de reportes para la toma de decisiones.

## Funcionalidades
- Registro y consulta de productos.
- Control de inventario.
- Registro de facturas.
- Gestión de clientes.
- Gestión de proveedores.
- Generación de reportes de ventas e inventario.
- Aplicación de buenas prácticas de programación orientada a objetos.

## Tecnologías utilizadas
- Java.
- IntelliJ IDEA.
- Programación Orientada a Objetos.
- Colecciones de Java.

## Estructura del proyecto
```text
org.variesoft
├─ app
│  └─ Main.java
├─ model
├─ service
└─ repository
```

## Cómo ejecutar el proyecto
1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que la estructura de paquetes sea correcta.
3. Ejecutar la clase `Main.java`.
4. Usar el menú en consola para probar las opciones del sistema.

## Principios aplicados
### Single Responsibility Principle
Cada clase tiene una sola responsabilidad.

### Open/Closed Principle
El sistema puede ampliarse sin modificar demasiadas clases existentes.

### Liskov Substitution Principle
Las clases hijas pueden usarse donde se espera la clase padre sin romper el programa.

### Interface Segregation Principle
Las interfaces se dividen en contratos pequeños y específicos.

## Observaciones
- El sistema fue diseñado con fines académicos.
- Los datos se manejan en memoria.
- No utiliza base de datos en esta versión.

## Estado del proyecto
Versión 1.0

##1. Justificación y Problemática
La creación del programa responde a la necesidad de transitar de un modelo de registro
manual y asistemático hacia una plataforma digital que elimine la ineficiencia operativa.
Los problemas detectados en el entorno original incluían:
• Falta de control centralizado: La ausencia de un sistema digital dificultaba el
seguimiento de las ventas y el inventario en tiempo real.
• Gestión de Datos: La necesidad de digitalizar las operaciones críticas como las
bases de datos de clientes y la emisión de facturación.

## 2. Objetivos del Sistema (Adaptados al Código Java)
La implementación técnica que hemos desarrollado en Java busca cumplir con los objetivos
estratégicos del proyecto original:
• Automatización de Facturación: El sistema permite generar facturas de venta con
información detallada de productos y clientes. En el código, esto se refleja en la
clase Factura y su capacidad de calcular totales automáticamente.
• Control de Inventario: Mantener un seguimiento constante del stock disponible
para evitar pérdidas de información. La lógica implementada en ProductoFisico
(método esBajoStock) responde directamente a esta necesidad.
• Seguridad y Roles: El sistema exige el acceso mediante credenciales y roles
definidos para garantizar la integridad de los datos.

## 3. Diagrama de la relación de clases

<img width="991" height="439" alt="image" src="https://github.com/user-attachments/assets/6d4f2604-fb63-4ffc-b1a3-3ae6cda3438b" />


## Licencia
Proyecto académico de uso educativo.

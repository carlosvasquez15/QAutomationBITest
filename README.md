# QAutomationBITest
# Automatización de pruebas con Selenium

Este repositorio contiene una aplicación Java que utiliza Selenium WebDriver, Java y JUnit para automatizar un flujo de trabajo en una aplicación web.

## Requisitos Previos

- Java 8 o superior
- Navegador Chrome
- ChromeDriver (compatible con la versión de tu navegador Chrome)
- Sistema operativo OS X o Windows.

## Empezando

1. Clona este repositorio en tu máquina local:

   ```sh
   git clone https://github.com/carlosvasquez15/QAutomationBITest.git

2. Puede abrirlo con Eclipse o Spring Tools
3. El análisis de requerimientos se encuentra a continuación.

####

# Análisis de Requerimientos

## Inciso 1: Inicio de Sesión

**Requisito: Inicio de Sesión**
- Tipo: Requisito
- Fuente del Requisito: Caso de Uso "Inicio de Sesión"
- Prioridad: Alta/Esencial

**Descripción:**
Se requiere una ventana que permita al usuario iniciar sesión en el portal web introduciendo sus credenciales.

**Casos de Pruebas o Puntos de Validación:**
1. Verificar que la ventana de inicio de sesión se muestra correctamente al acceder al portal web.
2. Validar la presencia de tres campos para ingresar credenciales: Código, Usuario y Contraseña.
   - Validar que los campos sean editables.
   - Validar que los campos cumplan con las longitudes especificadas.
   - Validar que el campo de contraseña oculte los caracteres ingresados.
3. Validar que aparezcan mensajes de error si los campos se dejan vacíos antes de intentar iniciar sesión.
4. Validar la existencia del botón "Iniciar sesión" de color azul.
   - Verificar que el botón esté habilitado y permita hacer clic.
   - Verificar que al hacer clic en el botón se inicie sesión y redireccione al usuario a la página correspondiente.
5. Validar la existencia del enlace "Olvidé mi contraseña" que lleva a una ventana para el reinicio de la contraseña.

**Dudas o Ambigüedades Identificadas:**
1. No se especifica el formato del "Usuario" ni restricciones como caracteres especiales.
2. No se detalla si la contraseña tiene restricciones de caracteres (alfanuméricos o caracteres especiales) o longitud mínima.
3. No se describe cómo debe comportarse el botón "Olvidé mi contraseña" y qué ventana debe mostrarse para el reinicio de contraseña.
4. Se sugiere considerar cambiar el color de las letras de error a rojo o amarillo en lugar de azul para resaltar la revisión de datos.
5. No se proporciona información sobre acciones de seguridad, como bloqueo de cuentas tras múltiples intentos fallidos.

## Inciso 2: Transferencias entre Cuentas

**Requisito: Transferencias entre Cuentas**
- Tipo: Requisito
- Fuente del Requisito: Caso de Uso "Transferencias propias"
- Prioridad: Alta/Esencial

**Descripción:**
Se requiere una funcionalidad que permita a los usuarios realizar transferencias de fondos entre sus propias cuentas, de la misma moneda o de moneda cruzada GTQ a USD.

**Casos de Pruebas o Puntos de Validación:**
1. Verificar que la funcionalidad de "Transferencias entre Cuentas" esté habilitada en el menú de la aplicación.
2. Validar que solo se muestren cuentas activas y propias del usuario como opciones de origen y destino.
3. Validar transferencias solo entre cuentas de la misma moneda o moneda cruzada GTQ a USD.
4. Verificar que al seleccionar una cuenta de origen y destino, se muestre el equivalente en la otra moneda según tasa de cambio.
5. Validar ingreso de monto a transferir en una moneda y cálculo automático en la otra.
6. Validar que monto a transferir no exceda saldo disponible en cuenta de origen.
7. Validar ingreso de comentario con razón de transferencia, hasta 600 caracteres.
8. Validar botón "Continuar", dirección a ventana de autorización si cumple validaciones previas.
   - Mostrar mensajes en campos que requieran valores faltantes.
9. Validar mensaje de confirmación con detalles antes de autorización.

**Dudas o Ambigüedades Identificadas:**
1. No se especifica monto mínimo/máximo para transferencia ni configuración de seguridad de límites y frecuencias.
2. No se describe manejo de saldo insuficiente en cuenta de origen.
3. No se detalla proceso de autorización en ventana de continuación.
4. No se especifica si comentario de razón de transferencia es opcional u obligatorio.

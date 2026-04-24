# Requerimientos del Negocio

Debes implementar una clase llamada SmartWallet con los siguientes métodos y reglas:

1. boolean deposit(double amount):

* El monto debe ser mayor a 0.
* Si el usuario es "Standard", el saldo máximo no puede superar los $5,000.
* Si el monto es mayor a $100, el usuario recibe un "cashback" del 1% del depósito (se suma al saldo).

2. boolean withdraw(double amount):

* No se pueden retirar montos negativos o cero.
* No se puede retirar más de lo que hay en el saldo.
* Si el saldo queda en exactamente 0, la cuenta debe marcarse como "Inactiva".

## 🛠️ Especificaciones Técnicas
* Lenguaje: Java (Versión 17 o superior).
* Gestor de Dependencias: Maven.
* Framework de Pruebas: JUnit 5 (Jupiter).
* Estructura: Plain Java (sin Spring Boot u otros frameworks).

## Instrucciones de la Tarea
1. Configuración del Proyecto
   Crea un proyecto Maven. Tu archivo pom.xml debe incluir al menos la dependencia de JUnit 5:
XML
```xml
<dependencies>     <dependency>         <groupId>org.junit.jupiter</groupId>         <artifactId>junit-jupiter-api</artifactId>         <version>5.10.0</version>         <scope>test</scope>     </dependency>     <dependency>         <groupId>org.junit.jupiter</groupId>         <artifactId>junit-jupiter-engine</artifactId>         <version>5.10.0</version>         <scope>test</scope>     </dependency> </dependencies>

```
2. Desarrollo:
* Implementa la clase SmartWallet en src/main/java.
* Crea la clase de pruebas SmartWalletTest en src/test/java.
* Requisito de Pruebas: Debes incluir al menos 8 casos de prueba que cubran:
  * Caminos felices (depósitos y retiros válidos).
  * Límites (exactamente $100 de depósito, exactamente $5,000 de saldo).
  * Casos de error (montos negativos, saldo insuficiente).
  * Uso de @BeforeEach para inicializar la billetera antes de cada test.

3. Entrega en GitHub
   1. Crea un repositorio PÚBLICO en tu cuenta personal de GitHub. 
   2. Sube el código fuente y el archivo pom.xml (no subas la carpeta /target). 
   3. Asegúrate de que el repositorio tenga un archivo README.md con tu nombre y una breve descripción de cómo ejecutar los tests (mvn test).

## Criterios de Evaluación

|Indicacion| Porcentaje |
|---|------------|
|Configuración: Proyecto Maven correcto y compila sin errores.	| 20%        |
|Lógica: Implementación correcta de las reglas de negocio.	| 30%        |
|Calidad de Pruebas: Uso correcto de Assertions y cobertura de casos borde.	| 40%        |
|Formato: Repositorio público y estructura de carpetas estándar.	| 10%        |

## Entrega
Una vez que tu repositorio esté listo y los tests pasen en verde, copia la URL de tu repositorio(ejemplo: https://github.com/tu-usuario/ejercicio-junit-wallet) y pégala en el formulario de respuestas proporcionado.
Nota Importante: Si el repositorio es privado al momento de la calificación, la nota será de 0. Verifica la visibilidad antes de enviar
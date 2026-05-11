# Aplicación de Figuras Geométricas - TabHost Android

## Descripción
Esta es una aplicación Android desarrollada en **Kotlin** que permite calcular el **área** y **perímetro** de las siguientes figuras geométricas:
- **Cuadrado**
- **Rectángulo**
- **Triángulo**
- **Círculo**

La aplicación utiliza **TabHost** para organizar las funcionalidades en cuatro pestañas interactivas.

---

## Características Principales

### 1. **Pestaña Cuadrado**
- **Entrada:** Lado del cuadrado
- **Cálculos:**
  - Área = lado²
  - Perímetro = 4 × lado

### 2. **Pestaña Rectángulo**
- **Entrada:** Base y Altura
- **Cálculos:**
  - Área = base × altura
  - Perímetro = 2 × (base + altura)

### 3. **Pestaña Triángulo**
- **Entradas:** Base, Altura, y los tres lados (A, B, C)
- **Cálculos:**
  - Área = (base × altura) / 2
  - Perímetro = lado A + lado B + lado C
  - Validación: Verifica que los lados formen un triángulo válido

### 4. **Pestaña Círculo**
- **Entrada:** Radio
- **Cálculos:**
  - Área = π × radio²
  - Perímetro = 2 × π × radio

---

## Requisitos Técnicos

### Software Requerido:
- **Android Studio** (versión 2021.3.1 o superior)
- **SDK Android 33** (API 33)
- **Kotlin 1.8.10**
- **Gradle 7.4.2**

### Versiones Mínimas:
- **API Mínima:** 21 (Android 5.0 - Lollipop)
- **API Objetivo:** 33 (Android 13)

---

## Cómo Abrir el Proyecto en Android Studio

### Opción 1: Desde Android Studio
1. Abre **Android Studio**
2. Selecciona **File** → **Open**
3. Navega a la carpeta `/workspaces/App_Tabhost`
4. Haz clic en **Open**
5. Espera a que Gradle sincronice el proyecto (puede tomar 1-2 minutos)
6. El proyecto estará listo para ejecutar

### Opción 2: Desde la Línea de Comandos
```bash
# Navega a la carpeta del proyecto
cd /workspaces/App_Tabhost

# Abre Android Studio desde aquí
studio .
```

---

## Estructura del Proyecto

```
App_Tabhost/
├── app/
│   ├── build.gradle                    # Configuración de compilación de la app
│   ├── proguard-rules.pro             # Reglas ProGuard
│   └── src/
│       └── main/
│           ├── java/com/example/
│           │   └── tabhost_geometricas/
│           │       └── MainActivity.kt  # Actividad principal (Kotlin)
│           ├── res/
│           │   ├── layout/
│           │   │   └── activity_main.xml  # Layout con TabHost
│           │   └── values/
│           │       ├── strings.xml      # Cadenas de texto
│           │       ├── colors.xml       # Colores
│           │       └── styles.xml       # Estilos
│           └── AndroidManifest.xml     # Manifiesto de la aplicación
├── build.gradle                        # Configuración del proyecto raíz
├── settings.gradle                     # Configuración de módulos
├── gradle.properties                   # Propiedades de Gradle
└── README.md                           # Este archivo
```

---

## Cómo Ejecutar la Aplicación

### Desde Android Studio:
1. **Selecciona un dispositivo/emulador:**
   - Conecta un dispositivo Android físico, O
   - Abre un emulador desde **AVD Manager**

2. **Haz clic en "Run"** (botón ▶️ verde) o presiona `Shift + F10`

3. **La app se compilará y ejecutará** en el dispositivo/emulador

### Pasos en la Aplicación:
1. Selecciona la pestaña de la figura geométrica que deseas
2. Ingresa los valores solicitados (en cm)
3. Haz clic en el botón "Calcular"
4. Verás el área y perímetro calculados

---

## Ejemplos de Uso

### Cuadrado
- Ingresa lado: `5`
- Resultado: 
  - Área: 25.00 cm²
  - Perímetro: 20.00 cm

### Rectángulo
- Ingresa base: `10` y altura: `5`
- Resultado:
  - Área: 50.00 cm²
  - Perímetro: 30.00 cm

### Triángulo
- Ingresa base: `6`, altura: `4`
- Ingresa lados: A=5, B=5, C=6
- Resultado:
  - Área: 12.00 cm²
  - Perímetro: 16.00 cm

### Círculo
- Ingresa radio: `5`
- Resultado:
  - Área: 78.54 cm²
  - Perímetro: 31.42 cm

---

## Validaciones Implementadas

✅ **Campos requeridos:** Valida que se ingresen todos los valores necesarios  
✅ **Valores positivos:** Los números deben ser mayores a 0  
✅ **Triángulo válido:** Verifica que los lados formen un triángulo (desigualdad triangular)  
✅ **Manejo de errores:** Mensajes claros en caso de errores en la entrada

---

## Dependencias

El proyecto utiliza las siguientes bibliotecas de AndroidX:
- **androidx.appcompat:appcompat:1.5.1** - Compatibilidad hacia atrás
- **androidx.constraintlayout:constraintlayout:2.1.4** - Layouts avanzados
- **com.google.android.material:material:1.7.0** - Componentes Material Design
- **org.jetbrains.kotlin:kotlin-stdlib:1.8.10** - Biblioteca estándar de Kotlin

---

## Notas Importantes

- La aplicación utiliza **TabHost**, que es un componente clásico de Android pero totalmente funcional
- Todos los cálculos se realizan en **tiempo real** mediante el botón "Calcular"
- La precisión de los resultados es de **2 decimales**
- La aplicación es **compatible desde Android 5.0 (API 21)** en adelante

---

## Solución de Problemas

### Problema: Gradle no sincroniza
**Solución:** 
1. Ve a **File** → **Invalidate Caches**
2. Selecciona **Invalidate and Restart**
3. Espera a que se reinicie Android Studio

### Problema: Error al compilar
**Solución:**
1. Asegúrate de tener instalado el SDK 33
2. Ve a **Tools** → **SDK Manager** → Descarga la API 33 si no la tienes
3. Haz clic en **Build** → **Clean Project**, luego **Rebuild Project**

### Problema: El emulador no inicia
**Solución:**
1. Abre **AVD Manager** (Tools → Device Manager)
2. Crea un nuevo dispositivo virtual o reinicia uno existente
3. Intenta ejecutar la app nuevamente

---

## Licencia
Este proyecto es libre para uso educativo.

---

## Autor
Desarrollado como proyecto educativo de Android con TabHost y Kotlin.

**Fecha:** 2026
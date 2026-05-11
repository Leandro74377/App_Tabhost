# Documentación Técnica - TabHost Geometricas App

## Arquitectura de la Aplicación

Esta aplicación utiliza una **arquitectura simple basada en una sola Activity** con un `TabHost` que contiene múltiples pestañas.

### Componentes Principales

#### 1. **MainActivity.kt**
- Presenta la interfaz principal con 4 pestañas
- Contiene toda la lógica de cálculos geométricos
- Maneja los clics de botones y actualizaciones de UI
- Valida entradas del usuario

#### 2. **activity_main.xml**
- Define la estructura visual con TabHost
- Contiene 4 LinearLayouts (uno por cada figura)
- Incluye EditText para entrada de datos
- Incluye Buttons para disparar cálculos
- Incluye TextView para mostrar resultados

### Flujo de Datos

```
Usuario ingresa datos
        ↓
Usuario toca "Calcular"
        ↓
MainActivity captura evento
        ↓
Valida datos (no vacíos, > 0)
        ↓
Realiza cálculo matemático
        ↓
Formatea resultado a 2 decimales
        ↓
Actualiza TextView con resultado
```

---

## Detalles de Implementación

### Validaciones

Cada figura geométrica ejecuta las siguientes validaciones:

1. **Campos obligatorios:** Verifica que no estén vacíos
2. **Valores numéricos:** Convierte strings a Double
3. **Rango válido:** Verifica que sean mayores a 0
4. **Triángulo especial:** Verifica desigualdad triangular (a+b>c, a+c>b, b+c>a)

### Formato de Salida

Todos los resultados se formatean con 2 decimales usando:
```kotlin
"%.2f".format(valor)
```

Ejemplos:
- 25.0 → "25.00 cm²"
- 31.415926 → "31.42 cm"

---

## Formas Geométricas Implementadas

### 🔶 Cuadrado
**Propiedades necesarias:** 1
- lado (double)

**Cálculos:**
```
área = lado * lado
perímetro = lado * 4
```

### ▭ Rectángulo
**Propiedades necesarias:** 2
- base (double)
- altura (double)

**Cálculos:**
```
área = base * altura
perímetro = 2 * (base + altura)
```

### △ Triángulo
**Propiedades necesarias:** 5
- base (double)
- altura (double)
- lado A (double)
- lado B (double)
- lado C (double)

**Cálculos:**
```
área = (base * altura) / 2
perímetro = lado_A + lado_B + lado_C

// Validación (desigualdad triangular)
lado_A + lado_B > lado_C &&
lado_A + lado_C > lado_B &&
lado_B + lado_C > lado_A
```

### ◯ Círculo
**Propiedades necesarias:** 1
- radio (double)

**Cálculos:**
```
área = PI * radio * radio
perímetro = 2 * PI * radio
```

---

## Recursos (Resources)

### Strings (res/values/strings.xml)
- Nombres de pestañas
- Etiquetas de entrada
- Textos de botones
- Mensajes de resultado

### Colors (res/values/colors.xml)
- Colors primarios: `purple_500`, `purple_700`
- Colors secundarios: `teal_200`, `teal_700`
- Colors de utilidad: `white`, `black`, `gray`

### Styles (res/values/styles.xml)
- `Theme.TabHostGeometricas`: Tema principal
- `InputStyle`: Estilo para campos de entrada

---

## Dependencias de Gradle

```gradle
// Core Android
api 'androidx.appcompat:appcompat:1.5.1'
api 'androidx.constraintlayout:constraintlayout:2.1.4'

// Material Design
api 'com.google.android.material:material:1.7.0'

// Kotlin
api 'org.jetbrains.kotlin:kotlin-stdlib:1.8.10'
```

---

## Opciones de Compilación

### Debug (Desarrollo)
```gradle
minifyEnabled false
// APK más grande pero más rápido de compilar
// Ideal para desarrollo y pruebas
```

### Release (Producción)
```gradle
minifyEnabled true
proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
// APK optimizado y ofuscado
// Ideal para publicación en Play Store
```

---

## Configuración de Android

```gradle
android {
    namespace "com.example.tabhost_geometricas"
    compileSdk 33
    
    defaultConfig {
        applicationId "com.example.tabhost_geometricas"
        minSdk 21      // Android 5.0 Lollipop
        targetSdk 33   // Android 13
        versionCode 1
        versionName "1.0"
    }
}
```

---

## Métodos Principales de MainActivity

### `onCreate(Bundle?)`
- Inicializa la Activity
- Configura TabHost con 4 pestañas
- Llama a métodos de inicialización de cada componente

### Métodos de Inicialización
- `initializeCuadrado()`
- `initializeRectangulo()`
- `initializeTriangulo()`
- `initializeCirculo()`

Cada uno asigna vistas (views) del XML a variables Kotlin y configura listeners.

### Métodos de Cálculo
- `calcularCuadrado()`
- `calcularRectangulo()`
- `calcularTriangulo()`
- `calcularCirculo()`

Cada uno realiza validaciones y cálculos específicos.

---

## Manifiesto de Android

```xml
<application>
    <activity
        android:name=".MainActivity"
        android:exported="true">
        <intent-filter>
            <action android:name="android.intent.action.MAIN" />
            <category android:name="android.intent.category.LAUNCHER" />
        </intent-filter>
    </activity>
</application>
```

- `android:exported="true"` permite que otros apps la lancen
- `MAIN` + `LAUNCHER` la hace visible en el app drawer

---

## Estructura de Archivos Kotlin

```kotlin
package com.example.tabhost_geometricas

import android.os.Bundle
import android.widget...
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    // Propiedades privadas (variables de instancia)
    private lateinit var etLadoCuadrado: EditText
    
    override fun onCreate(savedInstanceState: Bundle?) {
        // Código de inicialización
    }
    
    private fun initializeCuadrado() { }
    private fun calcularCuadrado() { }
    // ... más métodos
}
```

---

## Manejo de Excepciones

### Try-Catch Implícito
Las conversiones con `.toDouble()` pueden lanzar `NumberFormatException` si la entrada no es numérica. Se evita checando si está vacío primero.

### Validación de Rango
```kotlin
if (lado <= 0) {
    tvAreaCuadrado.text = "El valor debe ser mayor a 0"
    return
}
```

---

## Versiones Compatibles

| Componente | Versión | Notas |
|------------|---------|-------|
| Java | 11 | Compilación JVM |
| Kotlin | 1.8.10 | Lenguaje principal |
| Gradle | 7.4.2 | Sistema de build |
| Android Gradle | 7.4.2 | Plugin Android |
| API Mínima | 21 | Android 5.0 |
| API Objetivo | 33 | Android 13 |

---

## Optimizaciones Posibles

1. **ViewModel + LiveData:** Para mantener estado durante rotación
2. **Data Binding:** Para automáticamente actualizar UI
3. **Room Database:** Para guardar historial de cálculos
4. **Fragments:** Para reemplazar TabHost con más flexibilidad
5. **Splash Screen:** Para branding
6. **Animaciones:** Para transiciones entre pestañas

---

## Pruebas Sugeridas

### Pruebas Unitarias
```kotlin
@Test
fun testAreaCuadrado() {
    val lado = 5.0
    val area = lado * lado
    assertEquals(25.0, area, 0.01)
}
```

### Pruebas Instrumentadas
- Automatizar toques en UI
- Verificar que Resultados se muestren correctamente
- Probar validaciones

---

## Troubleshooting de Desarrollo

### Error: "Could not find..."
- Sincronizar Gradle (Tools → Sync Now)

### Error: "Not enough permissions"
- Ejecutar como administrador o con permisos suficientes

### Error: "Gradle task assemble Debug failed"
- Clean Project → Rebuild
- Invalidar caches

---

## Build Commands

```bash
# Sincronizar Gradle
./gradlew sync

# Compilar Debug APK
./gradlew assembleDebug

# Compilar Release APK
./gradlew assembleRelease

# Ejecutar tests unittest
./gradlew test

# Limpiar construcciones previas
./gradlew clean

# Compilar y ejecutar en dispositivo
./gradlew installDebug
```

---

## Publicación en Play Store

1. Generar Release APK (signed)
2. Probar en múltiples dispositivos
3. Crear cuenta desarrolladora Google Play
4. Subir APK a Google Play Console
5. Llenar información de la app
6. Someter para revisión

Requiere:
- Google Play Developer Account ($25 USD)
- API Key firmada
- Política de privacidad
- Screenshots y descripciones

---

**Última actualización:** 2026

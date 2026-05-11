# GUÍA RÁPIDA - Aplicación Figuras Geométricas

## ⚡ Pasos Rápidos para Ejecutar

### 1️⃣ Abre Android Studio
- Inicia Android Studio en tu computadora

### 2️⃣ Abre el Proyecto
- **File** → **Open** → Selecciona la carpeta `App_Tabhost`
- Espera a que Gradle sincronice (1-2 minutos)

### 3️⃣ Selecciona un Dispositivo
- Conecta un dispositivo Android físico, O
- Abre un emulador (Tools → Device Manager → Create Device)

### 4️⃣ Ejecuta la Aplicación
- Haz clic en el botón **▶️ (Run)** verde
- O presiona: `Shift + F10`

---

## 🎯 Cómo Usar la Aplicación

### Cuadrado
1. Toca la pestaña **"Cuadrado"**
2. Ingresa el valor del lado (ej: 5)
3. Presiona **"Calcular"**
4. Verás el área y perímetro

### Rectángulo
1. Toca la pestaña **"Rectángulo"**
2. Ingresa Base y Altura (ej: 10 y 5)
3. Presiona **"Calcular"**
4. Verás el área y perímetro

### Triángulo
1. Toca la pestaña **"Triángulo"**
2. Ingresa Base, Altura y los 3 Lados
3. Presiona **"Calcular"**
4. Verás el área y perímetro (si es válido)

### Círculo
1. Toca la pestaña **"Círculo"**
2. Ingresa el Radio (ej: 5)
3. Presiona **"Calcular"**
4. Verás el área y perímetro

---

## 📋 Fórmulas Usadas

| Figura | Área | Perímetro |
|--------|------|-----------|
| **Cuadrado** | lado² | 4 × lado |
| **Rectángulo** | base × altura | 2(base + altura) |
| **Triángulo** | (base × altura)/2 | lado₁ + lado₂ + lado₃ |
| **Círculo** | πr² | 2πr |

---

## 🛠️ Información Técnica

- **Lenguaje:** Kotlin
- **Interfaz:** TabHost (Android clásico)
- **SDK Mínimo:** 21 (Android 5.0)
- **SDK Objetivo:** 33 (Android 13)
- **Gradle:** 7.4.2

---

## ⚠️ Errores Comunes y Soluciones

| Problema | Solución |
|----------|----------|
| Gradle no sincroniza | File → Invalidate Caches → Invalidate and Restart |
| Error de compilación | Build → Clean Project → Rebuild Project |
| Emulador no funciona | Tools → Device Manager → Crear nuevo dispositivo |
| Campos vacíos en cálculo | Llenar todos los campos de entrada |
| Valores negativos | Ingresar solo números positivos |

---

## 📁 Estructura de Carpetas

```
App_Tabhost/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/tabhost_geometricas/
│   │   │   └── MainActivity.kt (LÓGICA DE LA APP)
│   │   ├── res/layout/
│   │   │   └── activity_main.xml (INTERFAZ)
│   │   └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

---

## 💡 Ejemplo de Cálculo

**Rectángulo con base=10cm y altura=5cm:**
- Área = 10 × 5 = **50.00 cm²**
- Perímetro = 2 × (10 + 5) = **30.00 cm**

---

## 📱 Compatibilidad

✅ Compatible con Android 5.0 en adelante  
✅ Funciona en dispositivos físicos y emuladores  
✅ Interfaz adaptada a todas las resoluciones

---

## 🚀 Comandos Útiles (Terminal)

```bash
# Navegar al proyecto
cd /workspaces/App_Tabhost

# Compilar
./gradlew build

# Ejecutar en emulador
./gradlew installDebug

# Ver logs
adb logcat
```

---

## 👨‍💻 Autor
Desarrollado para fines educativos en Kotlin con Android Studio.

**Versión:** 1.0  
**Año:** 2026

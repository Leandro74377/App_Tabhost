# 📦 Instrucciones de Instalación y Ejecución

## Requisitos Previos

✅ **Android Studio instalado** (2021.3.1 o superior)  
✅ **JDK 11 o superior**  
✅ **SDK Android 33 instalado**  
✅ **Conexión a internet** (para descargar dependencias)

---

## 🚀 Paso 1: Obtener el Proyecto

### Opción A: Desde GitHub/Git
```bash
git clone https://github.com/Leandro74377/App_Tabhost.git
cd App_Tabhost
```

### Opción B: Carpeta local
- Si ya tienes la carpeta, simplemente navega a ella

---

## 🔧 Paso 2: Abrir en Android Studio

### Método 1: Desde Android Studio (Recomendado)
1. **Abre Android Studio**
2. Haz clic en **File** → **Open**
3. Navega a la carpeta **App_Tabhost**
4. Haz clic en **Open**
5. **Espera** a que Gradle descargue las dependencias (1-2 minutos)
   - Verás un mensaje: "Gradle sync in progress"
   - Esto es normal, **no canceles**

### Método 2: Desde la Línea de Comandos
```bash
cd /ruta/a/App_Tabhost
studio .
```

---

## ⚙️ Paso 3: Verificar Configuración de SDK

1. Abre **File** → **Project Structure**
2. Verifica que aparezca:
   - **Project SDK:** JDK 11 o superior
   - **Compile SDK:** 33

3. Si no aparece, descárgalo:
   - **Tools** → **SDK Manager**
   - Busca: **Android 13** (API Level 33)
   - Haz clic en **Install**
   - Acepta la licencia y descarga

---

## 📱 Paso 4: Preparar Dispositivo/Emulador

### Opción A: Usar Dispositivo Físico
1. **Conecta tu dispositivo Android** vía USB
2. **Activa Modo de Desarrollador:**
   - Ve a Configuración → Sobre el teléfono
   - Toca "Número de compilación" 7 veces
   - Regresa a Configuración → Opciones de desarrollador
   - Activa "Depuración por USB"
3. **Confía en la computadora** cuando te pida

### Opción B: Usar Emulador (Si no tienes dispositivo)
1. **Abre Device Manager:**
   - Tools → Device Manager
   
2. **Crea un dispositivo virtual:**
   - Haz clic en **+**
   - Selecciona un dispositivo (ej: Pixel 5)
   - Selecciona Android 13 (API 33)
   - Haz clic en **Finish**
   
3. **Inicia el emulador:**
   - Haz clic en ▶️ junto al dispositivo
   - Espera a que cargue (puede tardar 1-2 minutos)

---

## ▶️ Paso 5: Ejecutar la Aplicación

### Opción 1: Botón Run (Recomendado)
1. Haz clic en el botón **▶️ (Run)** en la barra superior
2. Selecciona el dispositivo/emulador en el que deseas ejecutar
3. Haz clic en **OK**
4. **Espera** a que se compile e instale (1-2 minutos)
5. ¡La app debería aparecer en tu dispositivo!

### Opción 2: Atajo de Teclado
1. Presiona `Shift + F10`
2. Selecciona el dispositivo si se pide
3. ✅ ¡Listo!

### Opción 3: Línea de Comandos
```bash
cd /ruta/a/App_Tabhost
./gradlew installDebug
```

---

## ✨ Paso 6: Usar la Aplicación

1. **Busca la app** en tu dispositivo/emulador
2. **Toca el icono** "Figuras Geométricas"
3. **Selecciona una pestaña** (Cuadrado, Rectángulo, Triángulo, Círculo)
4. **Ingresa los valores** en los campos
5. **Toca "Calcular"**
6. **Verás el área y perímetro** en la parte inferior

---

## 🆘 Solución de Problemas

### ❌ Error: "Gradle sync failed"
**Solución:**
1. **File** → **Invalidate Caches**
2. Selecciona **Invalidate and Restart**
3. Espera a que reinicie Android Studio
4. Intenta sync nuevamente

### ❌ Error: "SDK not found"
**Solución:**
1. **Tools** → **SDK Manager**
2. En la pestaña **SDK Platforms**
3. Selecciona **Android 13** (API 33)
4. Haz clic en **Apply**
5. Acepta la licencia
6. Espera a que descargue

### ❌ Error: "Target device is not responding"
**Solución:**
1. Desconecta y reconecta el dispositivo USB
2. O reinicia el emulador
3. Intenta ejecutar nuevamente

### ❌ Error: "Build Failed"
**Solución:**
1. **Build** → **Clean Project**
2. **Build** → **Rebuild Project**
3. Espera a que compile
4. Si persiste, elimina la carpeta `.gradle` y `build`

### ❌ Emulador muy lento
**Solución:**
1. Asigna más RAM:
   - AVD Manager → ⚙️ (Settings) → Memory: 4GB
2. O usa un dispositivo físico

---

## 📋 Checklist de Instalación

- [ ] Android Studio instalado
- [ ] JDK 11 instalado
- [ ] SDK 33 descargado
- [ ] Proyecto descargado/clonado
- [ ] Gradle sincronizado exitosamente
- [ ] Dispositivo conectado o emulador ejecutándose
- [ ] App ejecutada sin errores
- [ ] Cálculos funcionan correctamente

---

## 📚 Archivos Importantes del Proyecto

```
App_Tabhost/
├── README.md                          ← Guía completa
├── GUIA_RAPIDA.md                     ← Instrucciones rápidas
├── DOCUMENTACION_TECNICA.md           ← Detalles técnicos
├── INSTRUCCIONES_INSTALACION.md       ← Este archivo
├── build.gradle                       ← Configuración raíz
├── settings.gradle                    ← Módulos del proyecto
└── app/
    ├── build.gradle                   ← Configuración de la app
    ├── proguard-rules.pro             ← Minificación
    └── src/main/
        ├── AndroidManifest.xml        ← Declaraciones de permisos
        ├── java/com/example/
        │   └── tabhost_geometricas/
        │       └── MainActivity.kt     ← CÓDIGO PRINCIPAL
        └── res/
            ├── layout/
            │   └── activity_main.xml   ← INTERFAZ PRINCIPAL
            └── values/
                ├── strings.xml         ← Textos
                ├── colors.xml          ← Colores
                └── styles.xml          ← Estilos
```

---

## 🎓 Para Profesores

### Compartir con Estudiantes
1. Comparte el link del repositorio GitHub
2. Los estudiantes clonan el proyecto
3. Siguen estos pasos de instalación
4. ¡Listo para aprender!

### Posibles Ejercicios
1. Agregar más figuras (Pentágono, Hexágono)
2. Agregar historial de cálculos
3. Agregar modo oscuro
4. Crear tests unitarios
5. Compilar y distribur APK

---

## 📞 Soporte Técnico

### Si tienes problemas:
1. Verifica que andriod Studio esté actualizado
2. Limpia la caché (File → Invalidate Caches)
3. Elimina la carpeta `.gradle` y `build`
4. Reinicia Android Studio
5. Intenta nuevamente

### Comandos útiles en Terminal:
```bash
# Ver logs de la app
adb logcat

# Listar dispositivos conectados
adb devices

# Instalar APK
adb install app/build/outputs/apk/debug/app-debug.apk

# Desinstalar app
adb uninstall com.example.tabhost_geometricas
```

---

## ✅ ¡Listo!

Si llegaste aquí sin errores, ¡tu aplicación está lista para usar! 🎉

Disfruta explorando Android, Kotlin y el desarrollo de apps.

**¡Éxito! 🚀**

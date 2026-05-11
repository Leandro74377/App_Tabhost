# 🧪 Pruebas de Verificación - Figuras Geométricas

Este documento contiene pruebas que puedes realizar para verificar que la aplicación funciona correctamente.

---

## ✅ Prueba 1: Cuadrado

### Entrada:
- Lado: **5**

### Resultado Esperado:
- Área: **25.00 cm²**
- Perímetro: **20.00 cm**

### Pasos:
1. Toca la pestaña **"Cuadrado"**
2. Ingresa `5` en el campo de lado
3. Toca **"Calcular"**
4. Verifica los resultados

**✓ Pasa** si ambos resultados coinciden

---

## ✅ Prueba 2: Cuadrado con Decimales

### Entrada:
- Lado: **7.5**

### Resultado Esperado:
- Área: **56.25 cm²**
- Perímetro: **30.00 cm**

### Pasos:
1. Toca la pestaña **"Cuadrado"**
2. Limpia el campo (borrar 5)
3. Ingresa `7.5`
4. Toca **"Calcular"**
5. Verifica los resultados

**✓ Pasa** si ambos resultados coinciden

---

## ✅ Prueba 3: Rectángulo

### Entrada:
- Base: **10**
- Altura: **5**

### Resultado Esperado:
- Área: **50.00 cm²**
- Perímetro: **30.00 cm**

### Pasos:
1. Toca la pestaña **"Rectángulo"**
2. Ingresa `10` en base
3. Ingresa `5` en altura
4. Toca **"Calcular"**
5. Verifica los resultados

**✓ Pasa** si ambos resultados coinciden

---

## ✅ Prueba 4: Rectángulo Cuadrado

### Entrada:
- Base: **3**
- Altura: **3**

### Resultado Esperado:
- Área: **9.00 cm²**
- Perímetro: **12.00 cm**

### Pasos:
1. Toca la pestaña **"Rectángulo"**
2. Ingresa `3` en base y altura
3. Toca **"Calcular"**
4. Verifica que funcione igual que un cuadrado

**✓ Pasa** si ambos resultados coinciden

---

## ✅ Prueba 5: Triángulo (Válido)

### Entrada:
- Base: **6**
- Altura: **4**
- Lado A: **5**
- Lado B: **5**
- Lado C: **6**

### Resultado Esperado:
- Área: **12.00 cm²**
- Perímetro: **16.00 cm**

### Pasos:
1. Toca la pestaña **"Triángulo"**
2. Ingresa los valores como arriba
3. Toca **"Calcular"**
4. Verifica los resultados

**✓ Pasa** si ambos resultados coinciden

---

## ✅ Prueba 6: Triángulo Equilátero

### Entrada:
- Base: **10**
- Altura: **8.66**
- Lado A: **10**
- Lado B: **10**
- Lado C: **10**

### Resultado Esperado:
- Área: **43.30 cm²**
- Perímetro: **30.00 cm**

### Pasos:
1. Toca la pestaña **"Triángulo"**
2. Ingresa los valores
3. Toca **"Calcular"**
4. Verifica los resultados

**✓ Pasa** si ambos resultados coinciden

---

## ✅ Prueba 7: Triángulo (No Válido)

### Entrada:
- Base: **10**
- Altura: **5**
- Lado A: **1**
- Lado B: **2**
- Lado C: **10**

### Resultado Esperado:
- Área: **"No forma un triángulo válido"**
- Perímetro: **"No forma un triángulo válido"**

### Pasos:
1. Toca la pestaña **"Triángulo"**
2. Ingresa los valores (lados que NO forman triángulo)
3. Toca **"Calcular"**
4. Verifica que muestre mensaje de error

**✓ Pasa** si muestra mensaje de error

---

## ✅ Prueba 8: Círculo

### Entrada:
- Radio: **5**

### Resultado Esperado:
- Área: **78.54 cm²**
- Perímetro: **31.42 cm**

### Pasos:
1. Toca la pestaña **"Círculo"**
2. Ingresa `5` en radio
3. Toca **"Calcular"**
4. Verifica los resultados

**✓ Pasa** si ambos resultados coinciden

---

## ✅ Prueba 9: Círculo con Radio Decimal

### Entrada:
- Radio: **2.5**

### Resultado Esperado:
- Área: **19.63 cm²**
- Perímetro: **15.71 cm**

### Pasos:
1. Toca la pestaña **"Círculo"**
2. Ingresa `2.5` en radio
3. Toca **"Calcular"**
4. Verifica los resultados

**✓ Pasa** si ambos resultados coinciden

---

## ✅ Prueba 10: Validación - Campo Vacío (Cuadrado)

### Entrada:
- Lado: **(vacío)**

### Resultado Esperado:
- Área: **"Por favor ingresa el lado"**
- Perímetro: **"Por favor ingresa el lado"**

### Pasos:
1. Toca la pestaña **"Cuadrado"**
2. NO ingreses nada
3. Toca **"Calcular"**
4. Verifica que muestre mensaje

**✓ Pasa** si muestra mensaje de error

---

## ✅ Prueba 11: Validación - Valor Negativo (Rectángulo)

### Entrada:
- Base: **-5**
- Altura: **10**

### Resultado Esperado:
- Área: **"Los valores deben ser mayores a 0"**
- Perímetro: **"Los valores deben ser mayores a 0"**

### Pasos:
1. Toca la pestaña **"Rectángulo"**
2. Ingresa `-5` en base
3. Ingresa `10` en altura
4. Toca **"Calcular"**
5. Verifica que muestre mensaje

**✓ Pasa** si muestra mensaje de error

---

## ✅ Prueba 12: Validación - Cero (Círculo)

### Entrada:
- Radio: **0**

### Resultado Esperado:
- Área: **"El valor debe ser mayor a 0"**
- Perímetro: **"El valor debe ser mayor a 0"**

### Pasos:
1. Toca la pestaña **"Círculo"**
2. Ingresa `0` en radio
3. Toca **"Calcular"**
4. Verifica que muestre mensaje

**✓ Pasa** si muestra mensaje de error

---

## ✅ Prueba 13: Navegación Entre Pestañas

### Pasos:
1. Toca **"Cuadrado"**
2. Ingresa un valor y calcula
3. Toca **"Rectángulo"**
4. Ingresa valores y calcula
5. Toca **"Triángulo"**
6. Ingresa valores y calcula
7. Toca **"Círculo"**
8. Ingresa valores y calcula

**✓ Pasa** si puedes navegar sin problemas y cada pestaña funciona correctamente

---

## ✅ Prueba 14: Recálculo Multiple (Cuadrado)

### Pasos:
1. Toca **"Cuadrado"**
2. Ingresa `5` → Calcula
3. Borra y ingresa `10` → Calcula
4. Borra y ingresa `15` → Calcula

### Resultado Esperado:
- Los resultados deben actualizarse cada vez

**✓ Pasa** si los resultados se actualizan correctamente

---

## ✅ Prueba 15: Decimales Precisos

### Entrada (Círculo):
- Radio: **3.14159**

### Pasos:
1. Toca **"Círculo"**
2. Ingresa `3.14159`
3. Calcula
4. Verifica que el resultado tenga 2 decimales

### Resultado Esperado:
- Área: **30.96 cm²** (aproximadamente)
- Perímetro: **19.74 cm** (aproximadamente)

**✓ Pasa** si la precisión es de 2 decimales

---

## 📊 Resumen de Pruebas

| # | Prueba | Tipo | Estado |
|---|--------|------|--------|
| 1 | Cuadrado básico | Funcionalidad | ☐ |
| 2 | Cuadrado decimales | Funcionalidad | ☐ |
| 3 | Rectángulo | Funcionalidad | ☐ |
| 4 | Rectángulo cuadrado | Funcionalidad | ☐ |
| 5 | Triángulo válido | Funcionalidad | ☐ |
| 6 | Triángulo equilátero | Funcionalidad | ☐ |
| 7 | Triángulo no válido | Validación | ☐ |
| 8 | Círculo | Funcionalidad | ☐ |
| 9 | Círculo decimales | Funcionalidad | ☐ |
| 10 | Campo vacío | Validación | ☐ |
| 11 | Valor negativo | Validación | ☐ |
| 12 | Cero | Validación | ☐ |
| 13 | Navegación | Interfaz | ☐ |
| 14 | Recálculo múltiple | Funcionalidad | ☐ |
| 15 | Precisión decimales | Precisión | ☐ |

---

## 🎯 Criterios de Aceptación

✅ **La aplicación aprueba si:**
- Todas las pruebas de funcionalidad funcionan
- Todas las validaciones muestran mensajes correctos
- La navegación entre pestañas es fluida
- Los resultados tienen 2 decimales
- No hay crashes

---

## 🚀 Casos de Prueba Adicionales (Avanzados)

### Prueba A: Números Muy Grandes
- Cuadrado con lado: 1000000
- Verificar que el cálculo sea correcto

### Prueba B: Números Muy Pequeños
- Círculo con radio: 0.0001
- Verificar precisión

### Prueba C: Presión Rápida de Botones
- Presionar "Calcular" varias veces seguidas
- Verificar que no haya crashes

### Prueba D: Rotación de Pantalla
- Girar el dispositivo durante un cálculo
- Verificar que los datos se mantengan

---

## 📝 Notas para Profesores

- Estas pruebas pueden usarse para:
  - Verificar que la app funciona
  - Enseñar a estudiantes cómo hacer testing
  - Encontrar bugs
  - Mejorar la app
  
- Se pueden crear tests automatizados basados en estas pruebas
- Los estudiantes pueden crear más pruebas

---

**Última actualización:** 2026

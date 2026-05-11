package com.example.tabhost_geometricas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TabHost
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    // Cuadrado
    private lateinit var etLadoCuadrado: EditText
    private lateinit var btnCalcularCuadrado: Button
    private lateinit var tvAreaCuadrado: TextView
    private lateinit var tvPerimetroCuadrado: TextView

    // Rectángulo
    private lateinit var etBaseRectangulo: EditText
    private lateinit var etAlturaRectangulo: EditText
    private lateinit var btnCalcularRectangulo: Button
    private lateinit var tvAreaRectangulo: TextView
    private lateinit var tvPerimetroRectangulo: TextView

    // Triángulo
    private lateinit var etBaseTriangulo: EditText
    private lateinit var etAlturaTriangulo: EditText
    private lateinit var etLadoA: EditText
    private lateinit var etLadoB: EditText
    private lateinit var etLadoC: EditText
    private lateinit var btnCalcularTriangulo: Button
    private lateinit var tvAreaTriangulo: TextView
    private lateinit var tvPerimetroTriangulo: TextView

    // Círculo
    private lateinit var etRadioCirculo: EditText
    private lateinit var btnCalcularCirculo: Button
    private lateinit var tvAreaCirculo: TextView
    private lateinit var tvPerimetroCirculo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar TabHost
        val tabHost = findViewById<TabHost>(android.R.id.tabhost)
        tabHost.setup()

        // Crear pestaña Cuadrado
        tabHost.addTab(
            tabHost.newTabSpec("Cuadrado")
                .setIndicator("Cuadrado")
                .setContent(R.id.tab1)
        )

        // Crear pestaña Rectángulo
        tabHost.addTab(
            tabHost.newTabSpec("Rectangulo")
                .setIndicator("Rectángulo")
                .setContent(R.id.tab2)
        )

        // Crear pestaña Triángulo
        tabHost.addTab(
            tabHost.newTabSpec("Triangulo")
                .setIndicator("Triángulo")
                .setContent(R.id.tab3)
        )

        // Crear pestaña Círculo
        tabHost.addTab(
            tabHost.newTabSpec("Circulo")
                .setIndicator("Círculo")
                .setContent(R.id.tab4)
        )

        // Inicializar componentes Cuadrado
        initializeCuadrado()

        // Inicializar componentes Rectángulo
        initializeRectangulo()

        // Inicializar componentes Triángulo
        initializeTriangulo()

        // Inicializar componentes Círculo
        initializeCirculo()
    }

    private fun initializeCuadrado() {
        etLadoCuadrado = findViewById(R.id.et_lado_cuadrado)
        btnCalcularCuadrado = findViewById(R.id.btn_calcular_cuadrado)
        tvAreaCuadrado = findViewById(R.id.tv_area_cuadrado)
        tvPerimetroCuadrado = findViewById(R.id.tv_perimetro_cuadrado)

        btnCalcularCuadrado.setOnClickListener {
            calcularCuadrado()
        }
    }

    private fun calcularCuadrado() {
        val ladoStr = etLadoCuadrado.text.toString()

        if (ladoStr.isEmpty()) {
            tvAreaCuadrado.text = "Por favor ingresa el lado"
            tvPerimetroCuadrado.text = "Por favor ingresa el lado"
            return
        }

        val lado = ladoStr.toDouble()

        if (lado <= 0) {
            tvAreaCuadrado.text = "El valor debe ser mayor a 0"
            tvPerimetroCuadrado.text = "El valor debe ser mayor a 0"
            return
        }

        val area = lado * lado
        val perimetro = lado * 4

        tvAreaCuadrado.text = "Área: %.2f cm²".format(area)
        tvPerimetroCuadrado.text = "Perímetro: %.2f cm".format(perimetro)
    }

    private fun initializeRectangulo() {
        etBaseRectangulo = findViewById(R.id.et_base_rectangulo)
        etAlturaRectangulo = findViewById(R.id.et_altura_rectangulo)
        btnCalcularRectangulo = findViewById(R.id.btn_calcular_rectangulo)
        tvAreaRectangulo = findViewById(R.id.tv_area_rectangulo)
        tvPerimetroRectangulo = findViewById(R.id.tv_perimetro_rectangulo)

        btnCalcularRectangulo.setOnClickListener {
            calcularRectangulo()
        }
    }

    private fun calcularRectangulo() {
        val baseStr = etBaseRectangulo.text.toString()
        val alturaStr = etAlturaRectangulo.text.toString()

        if (baseStr.isEmpty() || alturaStr.isEmpty()) {
            tvAreaRectangulo.text = "Por favor ingresa todos los valores"
            tvPerimetroRectangulo.text = "Por favor ingresa todos los valores"
            return
        }

        val base = baseStr.toDouble()
        val altura = alturaStr.toDouble()

        if (base <= 0 || altura <= 0) {
            tvAreaRectangulo.text = "Los valores deben ser mayores a 0"
            tvPerimetroRectangulo.text = "Los valores deben ser mayores a 0"
            return
        }

        val area = base * altura
        val perimetro = 2 * (base + altura)

        tvAreaRectangulo.text = "Área: %.2f cm²".format(area)
        tvPerimetroRectangulo.text = "Perímetro: %.2f cm".format(perimetro)
    }

    private fun initializeTriangulo() {
        etBaseTriangulo = findViewById(R.id.et_base_triangulo)
        etAlturaTriangulo = findViewById(R.id.et_altura_triangulo)
        etLadoA = findViewById(R.id.et_lado_a)
        etLadoB = findViewById(R.id.et_lado_b)
        etLadoC = findViewById(R.id.et_lado_c)
        btnCalcularTriangulo = findViewById(R.id.btn_calcular_triangulo)
        tvAreaTriangulo = findViewById(R.id.tv_area_triangulo)
        tvPerimetroTriangulo = findViewById(R.id.tv_perimetro_triangulo)

        btnCalcularTriangulo.setOnClickListener {
            calcularTriangulo()
        }
    }

    private fun calcularTriangulo() {
        val baseStr = etBaseTriangulo.text.toString()
        val alturaStr = etAlturaTriangulo.text.toString()
        val ladoAStr = etLadoA.text.toString()
        val ladoBStr = etLadoB.text.toString()
        val ladoCStr = etLadoC.text.toString()

        if (baseStr.isEmpty() || alturaStr.isEmpty() || ladoAStr.isEmpty() || 
            ladoBStr.isEmpty() || ladoCStr.isEmpty()) {
            tvAreaTriangulo.text = "Por favor ingresa todos los valores"
            tvPerimetroTriangulo.text = "Por favor ingresa todos los valores"
            return
        }

        val base = baseStr.toDouble()
        val altura = alturaStr.toDouble()
        val ladoA = ladoAStr.toDouble()
        val ladoB = ladoBStr.toDouble()
        val ladoC = ladoCStr.toDouble()

        if (base <= 0 || altura <= 0 || ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            tvAreaTriangulo.text = "Los valores deben ser mayores a 0"
            tvPerimetroTriangulo.text = "Los valores deben ser mayores a 0"
            return
        }

        // Verificar que forma un triángulo válido
        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            tvAreaTriangulo.text = "No forma un triángulo válido"
            tvPerimetroTriangulo.text = "No forma un triángulo válido"
            return
        }

        val area = (base * altura) / 2
        val perimetro = ladoA + ladoB + ladoC

        tvAreaTriangulo.text = "Área: %.2f cm²".format(area)
        tvPerimetroTriangulo.text = "Perímetro: %.2f cm".format(perimetro)
    }

    private fun initializeCirculo() {
        etRadioCirculo = findViewById(R.id.et_radio_circulo)
        btnCalcularCirculo = findViewById(R.id.btn_calcular_circulo)
        tvAreaCirculo = findViewById(R.id.tv_area_circulo)
        tvPerimetroCirculo = findViewById(R.id.tv_perimetro_circulo)

        btnCalcularCirculo.setOnClickListener {
            calcularCirculo()
        }
    }

    private fun calcularCirculo() {
        val radioStr = etRadioCirculo.text.toString()

        if (radioStr.isEmpty()) {
            tvAreaCirculo.text = "Por favor ingresa el radio"
            tvPerimetroCirculo.text = "Por favor ingresa el radio"
            return
        }

        val radio = radioStr.toDouble()

        if (radio <= 0) {
            tvAreaCirculo.text = "El valor debe ser mayor a 0"
            tvPerimetroCirculo.text = "El valor debe ser mayor a 0"
            return
        }

        val pi = Math.PI
        val area = pi * radio * radio
        val perimetro = 2 * pi * radio

        tvAreaCirculo.text = "Área: %.2f cm²".format(area)
        tvPerimetroCirculo.text = "Perímetro: %.2f cm".format(perimetro)
    }
}

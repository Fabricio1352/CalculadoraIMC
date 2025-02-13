package aldaco.fabricio.asignacion4_calculadora_imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCosto: Button = findViewById(R.id.btnCosto)
        val btnSedan: Button = findViewById(R.id.btnSedan)
        val btnCamioneta: Button = findViewById(R.id.btnCamioneta)
        val btnDeportivo: Button = findViewById(R.id.btnDeportivo)
        val tvCostoPoliza: TextView = findViewById(R.id.tvCostoPoliza)
        val tvTotal: TextView = findViewById(R.id.tvTotal)
        var costoTotal = 0

        btnSedan.setOnClickListener {
            tvCostoPoliza.setText("Poliza $500")
            costoTotal = 500
        }
        btnCamioneta.setOnClickListener {
            tvCostoPoliza.setText("Poliza $700")
            costoTotal = 700
        }
        btnDeportivo.setOnClickListener {
            tvCostoPoliza.setText("Poliza $1200")
            costoTotal = 1200
        }

        val etAnos: EditText = findViewById(R.id.etAnos)

        btnCosto.setOnClickListener {
            val anos = etAnos.text.toString().toIntOrNull() ?: 1

            costoTotal = costoTotal * anos
            tvTotal.setText("Total: $" + costoTotal)
            println("El costo es $costoTotal")
        }
    }
}

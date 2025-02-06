package aldaco.fabricio.asignacion4_calculadora_imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import aldaco.fabricio.asignacion4_calculadora_imc.ui.theme.Asignacion4_calculadora_IMCTheme
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : ComponentActivity() {

    // variables
    var peso =0.0
    var estatura = 0.0
    var imc =0.0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //evento clicl boton

        val calcular: Button = findViewById(R.id.btnCalcular)
        val peso2: TextView = findViewById(R.id.etPeso)
        val estatura2: TextView = findViewById(R.id.etEstatura)
        val tvImc: TextView = findViewById(R.id.tvImc)


        calcular.setOnClickListener {
            peso = peso2.text.toString().toDoubleOrNull() ?: 0.0
            estatura = estatura2.text.toString().toDoubleOrNull() ?: 0.0

            imc = peso / estatura

            tvImc.setText("IMC: "+ String.format("%.2f", imc))

        }
    }


}





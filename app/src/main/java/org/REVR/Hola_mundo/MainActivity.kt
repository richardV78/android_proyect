package org.REVR.Hola_mundo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.REVR.Hola_mundo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        starApp()
        }
    private fun starApp(){

        binding.btnEvaluar.setOnClickListener{
            val name = binding.etName.text.toString()
            val age = binding.etAge.text.toString().toInt()
            val massageStr  = if (age >= 18 ) "Mayor de edad" else "Menos de edad"
            val str = "Hola $name eres $massageStr"
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
        }
    }
}
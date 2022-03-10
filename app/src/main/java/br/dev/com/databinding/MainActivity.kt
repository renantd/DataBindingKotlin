package br.dev.com.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import br.dev.com.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnEnviar.setOnClickListener {
            Toast.makeText(this , "OK" , Toast.LENGTH_LONG).show()
        }

    }
}
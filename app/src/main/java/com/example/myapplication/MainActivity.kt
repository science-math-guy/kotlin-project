package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import  com.example.myapplication.data.Character
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val jean = Character(
            name = "Jean",
            surname = "Dupont",
            age = 22,
            job = "developper"
        )

        Log.i("MainActivity", "Prenom = ${jean.surname}")
        Log.i("MainActivity", "humeur = ${jean.getHumeurSmiley()}")

        initOnClick()

    }

    private fun initOnClick(){
        binding.validateButton.setOnClickListener { onClickValidate() }
    }

    private fun onClickValidate(){
        //todo
        val name = binding.nameEditText.text.toString()
        val surname = binding.surnameEditText.text.toString()
        val age = binding.ageEditText.text.toString()

        if(name.isNotBlank() && surname.isNotBlank() && age.isNotBlank() ) {
            printError("Inscription validée")
        }
        else{
            printError("Valeurs manquantes")
        }

    }

    private fun printError(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
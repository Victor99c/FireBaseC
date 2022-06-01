package com.example.firebasec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database
        val myRef = database.reference

       /* myRef.child("Usuario").child("1").setValue(User("Juan","Cortes", "juan@gmail.com", "juan1234"))
        myRef.child("Usuario").child("2").setValue(User("Gloria","Vargas", "glovar@gmail.com", "glovar"))
        myRef.child("Usuario").child("3").setValue(User("Victor","Hernandez", "viche@gmail.com", "viche"))
        myRef.child("Usuario").child("4").setValue(User("Manuel","Gutierrez", "mangu@gmail.com", "mangu"))
        myRef.child("Usuario").child("5").setValue(User("Adrin","Olalde", "adrol@gmail.com", "adrol"))
        myRef.child("Usuario").child("6").setValue(User("Leonardo","Pantoja", "leopan@gmail.com", "leopan"))
        myRef.child("Usuario").child("7").setValue(User("Axel","Romero", "axelrm@gmail.com", "axelrm"))
        myRef.child("Usuario").child("8").setValue(User("Jose","Gonzalez", "jogo@gmail.com", "jogo"))
        myRef.child("Usuario").child("9").setValue(User("Daniela","Ayala", "danay@gmail.com", "danay"))
        myRef.child("Usuario").child("10").setValue(User("Yamir","Garcia", "yaga@gmail.com", "yaga"))
*/



        myRef.child("Usuario").get().addOnSuccessListener { response ->
            Log.d("Respuesta", response.value.toString())
        }.addOnFailureListener{
            Log.e("Respuesta", "Error getting db")
        }

    }
    }

package com.isc.listasdefrutas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas: ArrayList<String> = ArrayList()
        frutas.add("Manzana")
        frutas.add("Banana")
        frutas.add("Limon")
        frutas.add("Uva")
        frutas.add("Kiwi")
        frutas.add("Mango")
        frutas.add("Naranja")
        frutas.add("Fresa")
        frutas.add("Sandia")

        var lista = findViewById<ListView>(R.id.lista)
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        lista.adapter = adaptador

        lista.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, frutas.get(position), Toast.LENGTH_SHORT).show()
            if(position==0){
                val intent = Intent(this,ManzanaActivity::class.java)
                startActivity(intent)
            }
            else if(position==1){
                val intent = Intent(this,BananaActivity::class.java)
                startActivity(intent)
            }
            if(position==2){
                val intent = Intent(this,LimonActivity::class.java)
                startActivity(intent)
            }
            if(position==3){
                val intent = Intent(this,UvaActivity::class.java)
                startActivity(intent)
            }
            if(position==4){
                val intent = Intent(this,KiwiActivity::class.java)
                startActivity(intent)
            }
            if(position==5){
                val intent = Intent(this,MangoActivity::class.java)
                startActivity(intent)
            }
            if(position==6){
                val intent = Intent(this,NaranjaActivity::class.java)
                startActivity(intent)
            }
            if(position==7){
                val intent = Intent(this,FresaActivity::class.java)
                startActivity(intent)
            }
            if(position==8){
                val intent = Intent(this,SandiaActivity::class.java)
                startActivity(intent)
            }

        }
    }
}
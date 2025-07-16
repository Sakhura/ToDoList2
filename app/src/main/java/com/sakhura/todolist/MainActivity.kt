package com.sakhura.todolist

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sakhura.todolist.adapter.TareasAdapter
import com.sakhura.todolist.model.Tarea
import com.sakhura.todolist.utils.SwipeToDeleteCallback

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: TareasAdapter
    private val listaTareas = mutableListOf<Tarea>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNuevaTarea = findViewById<EditText>(R.id.etNuevaTarea)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val tvContador = findViewById<TextView>(R.id.tvContador)
        val rvTareas = findViewById<RecyclerView>(R.id.rvTareas)

        adapter = TareasAdapter(listaTareas) {
            actualizarContador(tvContador)
        }

        rvTareas.layoutManager = LinearLayoutManager(this)
        rvTareas.adapter = adapter

        val swipeHandler = SwipeToDeleteCallback { pos ->
            adapter.eliminarTarea(pos)
            actualizarContador(tvContador)
        }
        ItemTouchHelper(swipeHandler).attachToRecyclerView(rvTareas)

        btnAgregar.setOnClickListener {
            val texto = etNuevaTarea.text.toString().trim()
            if (texto.isNotEmpty()) {
                val nuevaTarea = Tarea(System.currentTimeMillis(), texto)
                adapter.agregarTarea(nuevaTarea)
                etNuevaTarea.text.clear()
                actualizarContador(tvContador)
            }
        }

        actualizarContador(tvContador)
    }

    private fun actualizarContador(tv: TextView) {
        val pendientes = adapter.getTareas().count { !it.completada }
        tv.text = "$pendientes tareas pendientes"
    }
}

package com.sakhura.todolist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sakhura.todolist.model.Tarea
import com.sakhura.todolist.R


class TareasAdapter(
    private val tareas: MutableList<Tarea>,
    private val onCheckedChanged: (Tarea) -> Unit
) : RecyclerView.Adapter<TareasAdapter.TareaViewHolder>() {

    inner class TareaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cbCompletada: CheckBox = itemView.findViewById(R.id.cbCompletada)
        val tvTextoTarea: TextView = itemView.findViewById(R.id.tvTextoTarea)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TareaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tarea, parent, false)
        return TareaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TareaViewHolder, position: Int) {
        val tarea = tareas[position]
        holder.tvTextoTarea.text = tarea.texto
        holder.cbCompletada.isChecked = tarea.completada

        holder.cbCompletada.setOnCheckedChangeListener(null)
        holder.cbCompletada.setOnCheckedChangeListener { _, isChecked ->
            tarea.completada = isChecked
            onCheckedChanged(tarea)
        }
    }

    override fun getItemCount(): Int = tareas.size

    fun eliminarTarea(pos: Int) {
        tareas.removeAt(pos)
        notifyItemRemoved(pos)
    }

    fun agregarTarea(tarea: Tarea) {
        tareas.add(0, tarea)
        notifyItemInserted(0)
    }

    fun getTareas(): List<Tarea> = tareas
}
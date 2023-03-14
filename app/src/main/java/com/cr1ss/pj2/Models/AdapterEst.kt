package com.cr1ss.pj2.Models

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cr1ss.pj2.databinding.ItemEstudianteBinding

class AdapterEst: RecyclerView.Adapter<AdapterEst.ViewHolder>(){

    inner class ViewHolder(val binding: ItemEstudianteBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = ItemEstudianteBinding.inflate(layoutInflater,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nc=estud[position]
        holder.binding.nombrecomp.text = nc.name
        holder.binding.ptsestud.text = nc.points.toString()
    }

    override fun getItemCount(): Int =estud.size

    private val estud = mutableListOf<Estudiantes>()
    fun loadData(items: List<Estudiantes>){
        estud.addAll(items)
        notifyItemRangeInserted(0,estud.size)
    }
    fun borrar(position: Int){
        estud.removeAt(position)
        notifyItemRemoved(position)
    }

    fun masuno(position: Int){
        estud[position].points=estud[position].points+1
        notifyItemChanged(position)
    }
    fun mastres(position: Int){
        estud[position].points=estud[position].points+3
        notifyItemChanged(position)
    }
    fun mascinco(position: Int){
        estud[position].points=estud[position].points+5
        notifyItemChanged(position)
    }
    fun menosuno(position: Int){
        estud[position].points=estud[position].points-1
        notifyItemChanged(position)
    }
    fun menostres(position: Int){
        estud[position].points=estud[position].points-3
        notifyItemChanged(position)
    }
    fun menoscinco(position: Int){
        estud[position].points=estud[position].points-5
        notifyItemChanged(position)
    }
}
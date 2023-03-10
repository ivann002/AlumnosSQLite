package com.example.alumnossqlite

import android.graphics.BitmapFactory
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.alumnossqlite.databinding.UsuariosEsqueletoBinding

class UsuariosViewHolder (vista: View): RecyclerView.ViewHolder(vista){
    private val miBinding= UsuariosEsqueletoBinding.bind(vista)
    fun inflar(profesor:Usuarios,
               onItemDelete:(Int)->Unit,
               onItemUpdate:(Usuarios)->Unit)
    {
        miBinding.tvId.text=profesor.id.toString()
        miBinding.tvNombre.text=profesor.nombre
        miBinding.tvAsignatura.text=profesor.asig
        miBinding.tvEmail.text=profesor.email

        val byteArray = profesor.imagen
        val bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray?.size ?:0)
        miBinding.imageView2.setImageBitmap(bitmap)

        miBinding.btnBorrar.setOnClickListener{
            onItemDelete(adapterPosition)
        }
        itemView.setOnClickListener { onItemUpdate(profesor) }
    }
}
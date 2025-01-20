package com.example.pizza

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

import com.example.pizza.placeholder.PlaceholderContent.PlaceholderItem
import com.example.pizza.databinding.CatalogItemBinding

class CatalogRecyclerViewAdapter(
    private val pizzas: MutableList<PlaceholderItem>
) : RecyclerView.Adapter<CatalogRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            CatalogItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pizza = pizzas[position]
        holder.rate?.text = pizza.rate
        holder.name?.text = pizza.name
        holder.consist?.text = pizza.consist
        holder.weight?.text = pizza.weight
        holder.price?.text = pizza.price
        pizza.image?.let {
            val drawable = ContextCompat.getDrawable(holder.itemView.context, it)
            holder.image?.setImageDrawable(drawable)
        }
    }

    override fun getItemCount(): Int = pizzas.size

    inner class ViewHolder(binding: CatalogItemBinding) : RecyclerView.ViewHolder(binding.root) {
        var rate : TextView? = null
        var name : TextView? = null
        var consist : TextView? = null
        var weight : TextView? = null
        var price : TextView? = null
        var image: ImageView? = null
        init {
            rate = binding.rateText
            name = binding.cardName
            consist = binding.cardConsist
            weight = binding.cardWeight
            price = binding.cardPrice
            image = binding.cardImage
        }
    }

}
package com.example.pizza.placeholder

import android.graphics.Bitmap
import com.example.pizza.Pizza
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */

    val ITEMS: MutableList<PlaceholderItem> = ArrayList()

    /**
     * A map of sample (placeholder) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, PlaceholderItem> = HashMap()

    private val COUNT = 25

    init {
        val pizzaArray = arrayOf(
            Pizza(5.0, "Пеперони", "Свинина, паприка, перец чили", "700г", 500, null),
            Pizza(5.0, "Чили", "Свинина, паприка, перец чили", "700г", 500, null)
        )
        for (pizza in pizzaArray) {
            val item = PlaceholderItem(pizza.rate.toString(), pizza.name, pizza.consist, pizza.weight.toString(), pizza.price.toString(), image = "image")
            addItem(item)
        }
    }

    private fun addItem(item: PlaceholderItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.name, item)
    }

    private fun createPlaceholderItem(rate: String, name: String, consist: String, weight: String, price: String, image: Bitmap): PlaceholderItem {
        return PlaceholderItem(rate, name, consist, weight, price, image.toString())
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A placeholder item representing a piece of content.
     */
    data class PlaceholderItem(
        val rate: String,
        val name: String,
        val consist: String,
        val weight: String,
        val price: String,
        val image: String
    )
}
package com.example.pizza.placeholder

import android.media.Image
import com.example.pizza.Pizza
import com.example.pizza.R
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
            Pizza(5.0, "Пеперони", "Свинина, паприка, перец чили", "700г", 500, R.drawable.peperony),
            Pizza(4.9, "Бефстроганов", "Пряная говядина, шампиньоны, ароматный грибной соус, маринованные огурчики, моцарелла, красный лук, фирменный соус альфредо", "750г", 549, R.drawable.befstroganov),
            Pizza(4.7, "Говядина с песто", "Пряная говядина, соус песто, шампиньоны, сладкий перец, моцарелла, красный лук, фирменный соус альфредо", "800г", 500, R.drawable.govyadina_s_pesto),
            Pizza(5.0, "Кола-барбекю", "Пряная говядина, пикантная пепперони, острые колбаски чоризо, соус кола-барбекю, моцарелла и фирменный томатный соус", "900г", 599, R.drawable.kola_barbeku),
            Pizza(4.5, "Насыщенный вечер на двоих", "пицца 30 см с пряной говядиной на выбор, Дэнвич с говядиной, два напитка", "2000г", 1249, R.drawable.na_dvoix),
            Pizza(4.8, "Мясной микс", "Пряная говядина, баварские колбаски, пикантная пепперони, бекон, моцарелла и фирменный томатный соус", "590г", 699, R.drawable.myasnoi_mix),
            Pizza(5.0, "Дэнвич с говядиной", "Хрустящая чиабатта с ароматной пряной говядиной и цыпленком с соусами бургер и барбекю, свежими томатами и моцареллой", "170г", 349, R.drawable.denvich)
        )
        for (pizza in pizzaArray) {
            val item = PlaceholderItem(pizza.rate.toString(), pizza.name, pizza.consist, pizza.weight, pizza.price.toString(), pizza.image)
            addItem(item)
        }
    }

    private fun addItem(item: PlaceholderItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.name, item)
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
        val image: Int
    )
}
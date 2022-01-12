package com.android.kotlinlearning.Rastaurant1

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.android.kotlinlearning.R
import kotlinx.android.synthetic.main.food_item.view.*

class CastomAdapter1  : BaseAdapter {
    var foodlist=ArrayList<Food>()
    var context: Context?=null
    constructor(context:Context?, foodlist:ArrayList<Food>):super(){

        this.context=context
            this.foodlist=foodlist
    }
    override fun getCount(): Int {
       return foodlist.size
    }

    override fun getItem(position: Int): Any {
    return foodlist[position]
    }

    override fun getItemId(position: Int): Long {
         return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var food=this.foodlist[position]
        var inflater=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var foodview=inflater.inflate(R.layout.food_item,null)
         foodview.food_imageview.setImageResource(food.image!!)
        foodview.food_imageview.setOnClickListener {
            var intent=Intent(context,FoodDetails::class.java)
            intent.putExtra("name",food.name!!)
            intent.putExtra("des",food.des!!)
            intent.putExtra("Image",food.image!!)
            context!!.startActivity(intent)
        }
        foodview.food_name_text.text=food.name!!
        return foodview
    }

}
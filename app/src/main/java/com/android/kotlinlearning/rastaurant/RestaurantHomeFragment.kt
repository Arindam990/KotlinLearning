package com.android.kotlinlearning.rastaurant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.kotlinlearning.R
import com.android.kotlinlearning.R.layout.fragment_restaurant_home
import com.android.kotlinlearning.databinding.FragmentRestaurantHomeBinding


class RestaurantHomeFragment : Fragment(fragment_restaurant_home) {
    private lateinit var binding: FragmentRestaurantHomeBinding

    private val data = ArrayList<ItemsViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {

        binding = FragmentRestaurantHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerview.layoutManager = LinearLayoutManager(requireActivity())




        data.add(ItemsViewModel(R.drawable.french_fries, "French Fries"))
        data.add(ItemsViewModel(R.drawable.coffee_pot, "Coffee Pot"))
        data.add(ItemsViewModel(R.drawable.strawberry_ice_cream, "Strawberry Ice Cream"))
        data.add(ItemsViewModel(R.drawable.sugar_cubes, "Sugar Cube"))
        data.add(ItemsViewModel(R.drawable.honey, "Honey "))
        data.add(ItemsViewModel(R.drawable.espresso, "Espresso"))
        data.add(ItemsViewModel(R.drawable.french_fries, "Food Item "))
        data.add(ItemsViewModel(R.drawable.coffee_pot, "Coffee Pot"))
        data.add(ItemsViewModel(R.drawable.strawberry_ice_cream, "Strawberry Ice Cream"))
        data.add(ItemsViewModel(R.drawable.sugar_cubes, "Sugar Cube"))
        data.add(ItemsViewModel(R.drawable.honey, "Honey "))
        data.add(ItemsViewModel(R.drawable.espresso, "Espresso"))
        data.add(ItemsViewModel(R.drawable.coffee_pot, "Coffee Pot"))
        data.add(ItemsViewModel(R.drawable.strawberry_ice_cream, "Strawberry Ice Cream"))
        data.add(ItemsViewModel(R.drawable.sugar_cubes, "Sugar Cube"))
        data.add(ItemsViewModel(R.drawable.honey, "Honey "))
        data.add(ItemsViewModel(R.drawable.espresso, "Espresso"))

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)


        // Setting the Adapter with the recyclerview
        binding.recyclerview.adapter = adapter


    }

}









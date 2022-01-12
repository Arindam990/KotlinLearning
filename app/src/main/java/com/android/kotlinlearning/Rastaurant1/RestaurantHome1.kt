package com.android.kotlinlearning.Rastaurant1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.kotlinlearning.R
import com.android.kotlinlearning.databinding.FragmentRestraurant1Binding
import kotlinx.android.synthetic.main.fragment_restraurant1.*

class RestaurantHome1 : Fragment() {
 private lateinit var binding: FragmentRestraurant1Binding
 private val foodlist = ArrayList<Food>()
 //val adapter:CastomAdapter1?=null

 override fun onCreateView(
 inflater: LayoutInflater,
 container: ViewGroup?,
 savedInstanceState: Bundle?


 ): View? {

 binding = FragmentRestraurant1Binding.inflate(inflater, container, false)
 return binding.root
 }

 override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
 super.onViewCreated(view, savedInstanceState)
 //binding.gridview.layoutManager = LinearLayoutManager(requireActivity())
 foodlist.add(Food(  "Baboon"," Baboons are primates comprising the genus Papio, one of the 23 genera of Old World monkeys. There are six species of baboon: the hamadryas baboon, the Guinea baboon, the olive baboon, the yellow baboon, the Kinda baboon and the chacma baboon.",R.drawable.baboon))
 foodlist.add(Food("Bulldog","The Bulldog, also known as the English Bulldog or British Bulldog, is a medium-sized dog breed. It is a muscular, hefty dog with a wrinkled face and a distinctive pushed-in nose. The Kennel Club, the American Kennel Club, and the United Kennel Club oversee breeding records",R.drawable.bulldog))
 foodlist.add(Food("Panda"," The giant panda, also known as the panda bear, is a bear native to South Central China. It is characterised by its bold black-and-white coat and rotund body. The name \"giant panda\" is sometimes used to distinguish it from the red panda, a neighboring musteloid",R.drawable.panda))
 foodlist.add(Food("White Tiger","The white tiger or bleached tiger is a leucistic pigmentation variant of the Bengal tiger, Siberian tiger and hybrids between the two ",R.drawable.white_tiger))
 foodlist.add(Food("Swallow Bird","The swallows, martins, and saw-wings, or Hirundinidae, are a family of passerine birds found around the world on all continents, including occasionally in Antarctica. Highly adapted to aerial feeding, they have a distinctive appearance ",R.drawable.swallow_bird))
 foodlist.add(Food("Zebra","Zebras are African equines with distinctive black-and-white striped coats. There are three living species: the Grévy's zebra, plains zebra, and the mountain zebra. Zebras share the genus Equus with horses and asses, the three groups being the only living members of the family Equidae",R.drawable.zebra))
  foodlist.add(Food(  "Baboon"," Baboons are primates comprising the genus Papio, one of the 23 genera of Old World monkeys. There are six species of baboon: the hamadryas baboon, the Guinea baboon, the olive baboon, the yellow baboon, the Kinda baboon and the chacma baboon.",R.drawable.baboon))
  foodlist.add(Food("Bulldog","The Bulldog, also known as the English Bulldog or British Bulldog, is a medium-sized dog breed. It is a muscular, hefty dog with a wrinkled face and a distinctive pushed-in nose. The Kennel Club, the American Kennel Club, and the United Kennel Club oversee breeding records",R.drawable.bulldog))
  foodlist.add(Food("Panda"," The giant panda, also known as the panda bear, is a bear native to South Central China. It is characterised by its bold black-and-white coat and rotund body. The name \"giant panda\" is sometimes used to distinguish it from the red panda, a neighboring musteloid",R.drawable.panda))
  foodlist.add(Food("White Tiger","The white tiger or bleached tiger is a leucistic pigmentation variant of the Bengal tiger, Siberian tiger and hybrids between the two ",R.drawable.white_tiger))
  foodlist.add(Food("Swallow Bird","The swallows, martins, and saw-wings, or Hirundinidae, are a family of passerine birds found around the world on all continents, including occasionally in Antarctica. Highly adapted to aerial feeding, they have a distinctive appearance ",R.drawable.swallow_bird))
  foodlist.add(Food("Zebra","Zebras are African equines with distinctive black-and-white striped coats. There are three living species: the Grévy's zebra, plains zebra, and the mountain zebra. Zebras share the genus Equus with horses and asses, the three groups being the only living members of the family Equidae",R.drawable.zebra))

val adapter =CastomAdapter1(requireContext(),foodlist)

  gridview.adapter=adapter

 }

 }
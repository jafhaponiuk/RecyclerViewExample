package com.example.recyclerviewexample.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewexample.SuperHero
import com.example.recyclerviewexample.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    //val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName)
    //val realName = view.findViewById<TextView>(R.id.tvRealName)
    //val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    //val photo = view.findViewById<ImageView>(R.id.ivSuperHero)

    fun render(superHeroModel: SuperHero, onClickListener: (SuperHero) -> Unit) {
        //superHero.text = superHeroModel.superhero
        //realName.text = superHeroModel.realName
        //publisher.text = superHeroModel.publisher
        //Glide.with(photo.context).load(superHeroModel.photo).into(photo)

        binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)

        /* itemView.setOnClickListener {
            Toast.makeText(
                binding.ivSuperHero.context,
                superHeroModel.superhero,
                Toast.LENGTH_SHORT
            ).show()
        } */

        itemView.setOnClickListener { onClickListener(superHeroModel) }
    }
}
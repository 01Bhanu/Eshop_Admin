package com.bhanu01.eshopadmin.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhanu01.eshopadmin.R
import com.bhanu01.eshopadmin.databinding.ItemCategoryLayoutBinding
import com.bhanu01.eshopadmin.model.CategoryModel
import com.bumptech.glide.Glide

class CategoryAdapter(var context : Context, val list :ArrayList<CategoryModel>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){

    inner class CategoryViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var binding = ItemCategoryLayoutBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.item_category_layout,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.binding.textView2.text = list[position].text
        Glide.with(context).load(list[position].img).into(holder.binding.imageView2)

    }
}
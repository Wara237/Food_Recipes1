package com.example.e_commerceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.e_commerceapp.adapter.MainCategoryAdapter
import com.example.e_commerceapp.adapter.SubCategoryAdapter
import com.example.e_commerceapp.entities.Recipes
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    var arrMainCategory=ArrayList<Recipes>()
    var arrSubCategory=ArrayList<Recipes>()

    var mainCategoryAdapter=MainCategoryAdapter()
    var subCategoryAdapter=SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Temporary data
        arrMainCategory.add(Recipes(1,"Chicken"))
        arrMainCategory.add(Recipes(1,"Dessert"))
        arrMainCategory.add(Recipes(1,"Mouton"))
        arrMainCategory.add(Recipes(1,"Lamb"))

        mainCategoryAdapter.setData(arrMainCategory)

        arrSubCategory.add(Recipes(1,"Chicken and mushroom hotpot"))
        arrSubCategory.add(Recipes(1,"kapsalon"))
        arrSubCategory.add(Recipes(1,"Mouton and mustard pie"))
        arrSubCategory.add(Recipes(1,"banana pancakes"))

        subCategoryAdapter.setData(arrSubCategory)

        rv_main_category.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_main_category.adapter=mainCategoryAdapter

        rv_sub_category.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_sub_category.adapter=subCategoryAdapter
    }
}
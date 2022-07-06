package com.example.e_commerceapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.e_commerceapp.dao.RecipeDao
import com.example.e_commerceapp.entities.Recipes

@Database(entities = [Recipes::class], version = 1, exportSchema = false)
abstract class RecipeDatabase:RoomDatabase() {
    companion object{
        var recipeDatabase:RecipeDatabase?=null

        @Synchronized
        fun getDatabase(context: Context):RecipeDatabase{
            if(recipeDatabase !=null){
                recipeDatabase=Room.databaseBuilder(
                    context,
                    RecipeDatabase::class.java,
                    "recip.db"
                ).build()
            }
            return recipeDatabase!!
        }
    }

    abstract  fun recipeData():RecipeDao
}
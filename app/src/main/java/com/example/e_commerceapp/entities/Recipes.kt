package com.example.e_commerceapp.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName="Recipes")
data class Recipes(
        @PrimaryKey(autoGenerate = true)
        var id:Int = 0,

       @ColumnInfo(name="dishName")
       var  dishName:String
):Serializable

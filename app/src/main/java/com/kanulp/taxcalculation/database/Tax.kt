package com.kanulp.taxcalculation.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tax")
data class Tax(@PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id : Int,
                @ColumnInfo(name = "name") val name:String,
                @ColumnInfo(name = "income") val income:Int,
                @ColumnInfo(name = "afterTaxIncome") val afterTaxIncome:Int,
                @ColumnInfo(name = "rrsp") val RRSP:Int,
                )

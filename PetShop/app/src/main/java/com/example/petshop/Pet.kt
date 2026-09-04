package com.example.petshop

import android.R

abstract class Pet(val name: String, var age: Int) {
    abstract fun speak(): String
}
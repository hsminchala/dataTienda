package com.example.Tienda.repository

import com.example.Tienda.model.Product
import org.springframework.data.jpa.repository.JpaRepository


interface ProductRepository: JpaRepository<Product, Long> {
    fun findById(id: Long?): Product?
}
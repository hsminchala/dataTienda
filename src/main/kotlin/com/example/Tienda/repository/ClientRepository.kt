package com.example.Tienda.repository

import com.example.Tienda.model.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository: JpaRepository<Client, Long> {
    fun findById(id: Long?): Client?
}
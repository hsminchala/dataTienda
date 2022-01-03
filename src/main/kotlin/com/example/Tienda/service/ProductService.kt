package com.example.Tienda.service


import com.example.Tienda.model.Product
import com.example.Tienda.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService {
    @Autowired
    lateinit var productRepository: ProductRepository


    fun list(): List<Product> {
        return productRepository.findAll()
    }
    fun save(product: Product):Product{
        return productRepository.save(product)
    }
}

package learetechno.api.kotlin.restful.repository

import learetechno.api.kotlin.restful.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String>
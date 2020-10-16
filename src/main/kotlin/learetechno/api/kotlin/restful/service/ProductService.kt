package learetechno.api.kotlin.restful.service

import learetechno.api.kotlin.restful.model.CreateProductRequest
import learetechno.api.kotlin.restful.model.ListProductRequest
import learetechno.api.kotlin.restful.model.ProductResponse
import learetechno.api.kotlin.restful.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String) : ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>

}
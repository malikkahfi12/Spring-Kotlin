package learetechno.api.kotlin.restful.model

import java.util.*
import javax.persistence.Column
import javax.persistence.Id

class ProductResponse (

        val id: String,

        val name: String,

        val price: Long,

        val quantity: Int,

        val createdAt: Date,

        val updatedAt: Date?
)
package learetechno.api.kotlin.restful.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "api_keys")
data class ApiKey (
        @Id
        val id: String
)
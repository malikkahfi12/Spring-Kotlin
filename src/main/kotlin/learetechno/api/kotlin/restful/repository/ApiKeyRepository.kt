package learetechno.api.kotlin.restful.repository

import learetechno.api.kotlin.restful.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository : JpaRepository<ApiKey, String>
package learetechno.api.kotlin.restful.auth

import learetechno.api.kotlin.restful.error.UnauthorizedException
import learetechno.api.kotlin.restful.repository.ApiKeyRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.ui.ModelMap
import org.springframework.web.context.request.WebRequest
import org.springframework.web.context.request.WebRequestInterceptor

@Component
class ApiKeyInterceptor(val apiKeyRepository: ApiKeyRepository) : WebRequestInterceptor {
    val log = LoggerFactory.getLogger(ApiKeyInterceptor::class.java);

    override fun preHandle(request: WebRequest) {
        val apiKey = request.getHeader("X-Api-Key")
        if (apiKey == null){
            log.info("api key null")
            throw UnauthorizedException()
        }

        if (!apiKeyRepository.existsById(apiKey)){
            log.info("api key not found")
            throw UnauthorizedException()
        }
    }

    override fun postHandle(request: WebRequest, model: ModelMap?) {
        // nothing
    }

    override fun afterCompletion(request: WebRequest, ex: Exception?) {
        // nothing
    }

}
package learetechno.api.kotlin.restful.controller

import learetechno.api.kotlin.restful.error.NotFoundException
import learetechno.api.kotlin.restful.error.UnauthorizedException
import learetechno.api.kotlin.restful.model.WebResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class ErrorController {

    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHandler(constraintViolationException: ConstraintViolationException) : WebResponse<String>{
        return WebResponse(
                code = 400,
                status = "BAD REQUEST",
                data = constraintViolationException.message!!
        )
    }

    @ExceptionHandler(value = [NotFoundException::class])
    fun notFound(notFoundException: NotFoundException): WebResponse<String>{
        return WebResponse(
                code = 404,
                status = "NOT FOUND",
                data = "Data Not Found"
        )
    }

    @ExceptionHandler(value = [UnauthorizedException::class])
    fun unathorized(unauthorizedException: UnauthorizedException): WebResponse<String>{
        return WebResponse(
                code = 401,
                status = "Unathorized",
                data = "Please put your X-Api-Key"
        )
    }
}
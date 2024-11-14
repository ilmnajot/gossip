package uz.ilmnajot.api_gossip.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlerController {

    @ExceptionHandler(BadException.class)
    public HttpStatus badException(BadException e) {
        ErrorDetails errorDetails = new ErrorDetails(e.getMessage(), false, HttpStatus.BAD_REQUEST, );
    }
}

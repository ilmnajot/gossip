package uz.ilmnajot.api_gossip.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomBaseException extends RuntimeException {
    private final HttpStatus httpStatus;

    public CustomBaseException(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    protected CustomBaseException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

}

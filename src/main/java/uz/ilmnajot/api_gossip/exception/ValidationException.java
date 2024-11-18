package uz.ilmnajot.api_gossip.exception;

import org.springframework.http.HttpStatus;

public class ValidationException extends CustomBaseException{
    public ValidationException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}

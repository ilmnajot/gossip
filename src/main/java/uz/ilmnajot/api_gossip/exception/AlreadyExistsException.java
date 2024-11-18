package uz.ilmnajot.api_gossip.exception;

import org.springframework.http.HttpStatus;

public class AlreadyExistsException extends CustomBaseException {
    public AlreadyExistsException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}

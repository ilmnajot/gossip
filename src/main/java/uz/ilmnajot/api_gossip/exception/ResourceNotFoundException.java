package uz.ilmnajot.api_gossip.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends CustomBaseException {
    public ResourceNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}

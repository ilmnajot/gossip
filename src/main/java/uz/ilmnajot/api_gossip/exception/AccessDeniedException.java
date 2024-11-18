package uz.ilmnajot.api_gossip.exception;

import org.springframework.http.HttpStatus;

public class AccessDeniedException extends CustomBaseException {

    public AccessDeniedException(String message) {
        super(message, HttpStatus.FORBIDDEN);
    }
}

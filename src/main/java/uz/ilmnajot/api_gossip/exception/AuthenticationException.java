package uz.ilmnajot.api_gossip.exception;

import org.springframework.http.HttpStatus;

public class AuthenticationException extends CustomBaseException {

    public AuthenticationException(String message) {
        super(message, HttpStatus.UNAUTHORIZED);
    }
}

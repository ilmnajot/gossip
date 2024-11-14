package uz.ilmnajot.api_gossip.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {

    private String message;
    private boolean success;
    private HttpStatus status;
    private Object details;

}

package uz.ilmnajot.api_gossip.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class ErrorResponse {

    private String message;
    private int status;
    private LocalDateTime timestamp;
    private Object details;

    public ErrorResponse(String message, int status, Object details) {
        this.message = message;
        this.status = status;
        this.timestamp = LocalDateTime.now();
        this.details = details;
    }


}

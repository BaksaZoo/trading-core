package hu.baksa.trading.core.error;

import org.springframework.http.HttpStatus;

public record ErrorResponse(HttpStatus status, String message) {
}

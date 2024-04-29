package com.traini8.traini8registry.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DuplicateContactPhoneException extends RuntimeException {
    public DuplicateContactPhoneException(String message) {
        super(message);
    }
}

package com.orchestrix.auth_service.exception;

import org.springframework.http.HttpStatus;

public class InvalidCredentialsException extends AuthServiceException {
    public InvalidCredentialsException(String message) {
        super(HttpStatus.UNAUTHORIZED, message);
    }
}

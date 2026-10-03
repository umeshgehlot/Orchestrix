package com.orchestrix.worker_service.common.exception;

public class HttpTargetException extends RuntimeException {
    public HttpTargetException(String message) {
        super(message);
    }
}
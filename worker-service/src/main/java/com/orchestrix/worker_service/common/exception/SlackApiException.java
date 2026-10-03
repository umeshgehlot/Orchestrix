package com.orchestrix.worker_service.common.exception;

public class SlackApiException extends RuntimeException {
    public SlackApiException(String message) {
        super(message);
    }
}
package com.orchestrix.worker_service.common.exception;

public class WorkerExecutionException extends RuntimeException {
    public WorkerExecutionException(String message) {
        super(message);
    }
}

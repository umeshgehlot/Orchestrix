package com.orchestrix.workflowservice.domain.execution;

public enum TaskExecutionStatus {
    PENDING,
    RUNNING,
    WAITING,
    SUCCESS,
    FAILED,
    RETRYING
}
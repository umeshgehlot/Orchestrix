package com.orchestrix.workflowservice.application.execution.event;

import com.orchestrix.workflowservice.domain.execution.TaskExecutionStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskFailedEvent(
        UUID workflowExecutionId,
        UUID taskExecutionId,
        UUID nodeId,
        String nodeType,
        TaskExecutionStatus status,
        String message,
        LocalDateTime completedAt
) {
}

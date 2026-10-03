package com.orchestrix.workflowservice.presentation.dto.response;

import com.orchestrix.workflowservice.domain.execution.TaskExecutionStatus;

import java.time.Instant;
import java.util.UUID;

public record TaskExecutionResponse(
        UUID taskExecutionId,
        UUID nodeId,
        String nodeType,
        TaskExecutionStatus status,
        Instant startedAt,
        Instant completedAt,
        String errorMessage
) {
}

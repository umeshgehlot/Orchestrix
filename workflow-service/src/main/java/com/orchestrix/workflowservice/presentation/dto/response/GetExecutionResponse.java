package com.orchestrix.workflowservice.presentation.dto.response;

import com.orchestrix.workflowservice.domain.execution.WorkflowExecutionStatus;

import java.time.Instant;
import java.util.UUID;

public record GetExecutionResponse(
        UUID executionId,
        UUID workflowId,
        WorkflowExecutionStatus status,
        Instant startedAt,
        Instant completedAt
) {
}

package com.orchestrix.workflowservice.presentation.dto.response;

import com.orchestrix.workflowservice.domain.execution.WorkflowExecutionStatus;

import java.util.UUID;

public record StartExecutionResponse(
        UUID workflowId,
        WorkflowExecutionStatus status
) {}
package com.orchestrix.workflowservice.application.execution.event;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.UUID;

public record TaskCreatedEvent(
        UUID workflowExecutionId,
        UUID taskExecutionId,
        UUID nodeId,
        String nodeType,
        JsonNode configuration
) {
}
package com.orchestrix.workflowservice.presentation.dto.response;

import java.util.UUID;

public record EdgeDefinitionResponse(
        UUID sourceNodeId,
        UUID targetNodeId
) {
}
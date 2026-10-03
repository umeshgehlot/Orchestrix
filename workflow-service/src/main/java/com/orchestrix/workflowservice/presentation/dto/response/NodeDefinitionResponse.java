package com.orchestrix.workflowservice.presentation.dto.response;

import com.fasterxml.jackson.databind.JsonNode;
import com.orchestrix.workflowservice.domain.node.NodeType;
import java.util.Map;
import java.util.UUID;

public record NodeDefinitionResponse(
        UUID id,
        String nodeKey,
        NodeType nodeType,
        Double positionX,
        Double positionY,
        JsonNode configuration
) {
}
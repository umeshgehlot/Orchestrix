package com.orchestrix.workflowservice.presentation.dto.request;

import com.fasterxml.jackson.databind.JsonNode;
import com.orchestrix.workflowservice.application.execution.condtion.ConditionOperator;

public record ConditionConfig(
        String field,
        ConditionOperator operator,
        JsonNode value

) {}
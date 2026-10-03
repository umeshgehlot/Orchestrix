package com.orchestrix.workflowservice.presentation.dto.request;

import com.orchestrix.workflowservice.domain.edge.BranchType;

public record EdgeDefinitionRequest(
        String sourceClientId,
        String targetClientId,
        BranchType branchType
) {
}
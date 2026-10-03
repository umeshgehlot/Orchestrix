package com.orchestrix.workflowservice.domain.node;

public enum NodeType {
    START,
    END,

    TASK,
    EMAIL,
    HTTP_REQUEST,
    SLACK,

    CONDITION,
    APPROVAL,
    DELAY
}
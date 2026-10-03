package com.orchestrix.worker_service.adapter.out.kafka;


import com.orchestrix.worker_service.domain.enums.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskSucceededEvent(
        UUID workflowExecutionId,
        UUID taskExecutionId,
        UUID nodeId,
        String nodeType,
        TaskStatus status,
        String message,
        LocalDateTime completedAt
) {
}

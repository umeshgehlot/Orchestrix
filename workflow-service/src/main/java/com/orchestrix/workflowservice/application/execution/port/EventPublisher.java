package com.orchestrix.workflowservice.application.execution.port;

import com.orchestrix.workflowservice.application.execution.event.TaskCreatedEvent;

public interface EventPublisher {
    void publishTaskCreated(TaskCreatedEvent event);
}

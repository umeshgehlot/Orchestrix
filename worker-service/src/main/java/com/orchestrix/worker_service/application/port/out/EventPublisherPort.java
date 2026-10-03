package com.orchestrix.worker_service.application.port.out;

import com.orchestrix.worker_service.domain.model.WorkerResult;
import com.orchestrix.worker_service.domain.model.WorkerTask;

public interface EventPublisherPort {
    void publishTaskCompleted(WorkerTask task, WorkerResult result);
}

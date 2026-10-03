package com.orchestrix.worker_service.application.port.in;

import com.orchestrix.worker_service.domain.model.WorkerResult;
import com.orchestrix.worker_service.domain.model.WorkerTask;

public interface ExecuteTaskUseCase {
    WorkerResult execute(WorkerTask task);
}

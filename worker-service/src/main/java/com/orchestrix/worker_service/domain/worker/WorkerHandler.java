package com.orchestrix.worker_service.domain.worker;

import com.orchestrix.worker_service.domain.model.WorkerResult;
import com.orchestrix.worker_service.domain.model.WorkerTask;

public interface WorkerHandler {

    String getType();

    WorkerResult execute(WorkerTask task);
}

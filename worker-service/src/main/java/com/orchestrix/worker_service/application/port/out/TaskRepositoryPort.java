package com.orchestrix.worker_service.application.port.out;

import com.orchestrix.worker_service.domain.model.WorkerTask;

import java.util.Optional;
import java.util.UUID;

public interface TaskRepositoryPort {
    WorkerTask save(WorkerTask task);

    Optional<WorkerTask> findById(UUID id);

}

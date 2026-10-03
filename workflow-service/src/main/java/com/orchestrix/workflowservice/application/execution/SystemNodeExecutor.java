package com.orchestrix.workflowservice.application.execution;

import com.orchestrix.workflowservice.application.execution.state.TaskStateMachine;
import com.orchestrix.workflowservice.domain.execution.TaskExecution;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class SystemNodeExecutor {
    private final TaskStateMachine taskStateMachine;
    public void execute(TaskExecution taskExecution) {

        log.info("Executing system node {}",
                taskExecution.getNode().getNodeType());
        taskStateMachine.startTaskExecution(taskExecution);
        taskStateMachine.completeTaskExecution(taskExecution);
        log.info("Completed system node {}",
                taskExecution.getNode().getNodeType());

    }

}
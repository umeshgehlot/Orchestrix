package com.orchestrix.workflowservice.application.execution.resolver;

import com.orchestrix.workflowservice.domain.execution.TaskExecution;
import com.orchestrix.workflowservice.domain.execution.WorkflowExecution;
import com.orchestrix.workflowservice.domain.node.WorkflowNode;

import java.util.List;

public interface DependencyResolver {

    List<WorkflowNode> resolveNextNodes(
            TaskExecution taskExecution
    );

}
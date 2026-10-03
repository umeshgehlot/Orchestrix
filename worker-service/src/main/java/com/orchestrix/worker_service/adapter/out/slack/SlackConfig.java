package com.orchestrix.worker_service.adapter.out.slack;

public record SlackConfig(
        String channel,
        String message
) {
}

package com.orchestrix.worker_service.adapter.out.http;

import java.util.Map;

public record HttpConfig(String url,
                         String method,
                         Map<String, String> headers,
                         String body) {

}

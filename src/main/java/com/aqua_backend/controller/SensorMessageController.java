package com.aqua_backend.controller;

import com.aqua_backend.model.SensorMessage;
import com.aqua_backend.service.SensorMessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class SensorMessageController {

    private final SensorMessageService service;

    public SensorMessageController(SensorMessageService service) {
        this.service = service;
    }

    @PostMapping("/ingest")
    public SensorMessage ingest(@RequestBody CreateMessageRequest req) {
        return service.save(req.message());
    }

    @GetMapping("/messages")
    public List<SensorMessage> all() {
        return service.findAll();
    }

    // Minimal request DTO (Java 21 record)
    public record CreateMessageRequest(String message) {}
}

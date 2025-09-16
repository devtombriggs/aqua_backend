package com.aqua_backend.service;

import com.aqua_backend.model.SensorMessage;
import com.aqua_backend.repository.SensorMessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorMessageService {

    private final SensorMessageRepository repo;

    public SensorMessageService(SensorMessageRepository repo){
        this.repo = repo;
    }

    public SensorMessage save(String message){
        SensorMessage m = new SensorMessage();
        m.setMessage(message);
        return repo.save(m);
    }

    public List<SensorMessage> findAll(){
        return repo.findAll();
    }
}

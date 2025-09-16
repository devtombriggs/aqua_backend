package com.aqua_backend.repository;

import com.aqua_backend.model.SensorMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorMessageRepository extends JpaRepository<SensorMessage, Long> {}
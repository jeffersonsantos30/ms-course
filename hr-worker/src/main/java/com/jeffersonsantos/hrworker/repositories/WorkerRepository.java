package com.jeffersonsantos.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffersonsantos.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository <Worker, Long> {

}

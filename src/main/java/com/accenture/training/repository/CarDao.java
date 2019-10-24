package com.accenture.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.training.entity.CarEntity;


public interface CarDao extends JpaRepository<CarEntity,Integer> {
}

package com.springboot.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.parking.entity.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
    
}

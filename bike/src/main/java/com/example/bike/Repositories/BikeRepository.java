package com.example.bike.Repositories;

import com.example.bike.Models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {


}

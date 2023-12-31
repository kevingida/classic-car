package com.gida.classicCarserver.car.repository;

import com.gida.classicCarserver.car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findBySold(boolean sold);
}

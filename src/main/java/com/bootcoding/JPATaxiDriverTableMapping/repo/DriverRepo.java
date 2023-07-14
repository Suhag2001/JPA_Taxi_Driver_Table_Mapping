package com.bootcoding.JPATaxiDriverTableMapping.repo;

import com.bootcoding.JPATaxiDriverTableMapping.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<Driver,Integer> {
}

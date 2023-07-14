package com.bootcoding.JPATaxiDriverTableMapping.repo;

import com.bootcoding.JPATaxiDriverTableMapping.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepo extends JpaRepository<Rating,Integer>{
}

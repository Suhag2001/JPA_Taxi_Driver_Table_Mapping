package com.bootcoding.JPATaxiDriverTableMapping.controller;

import com.bootcoding.JPATaxiDriverTableMapping.entity.Driver;
import com.bootcoding.JPATaxiDriverTableMapping.entity.Rating;
import com.bootcoding.JPATaxiDriverTableMapping.repo.DriverRepo;
import com.bootcoding.JPATaxiDriverTableMapping.repo.RatingRepo;
import com.bootcoding.JPATaxiDriverTableMapping.request.DriverRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DriverController {


     @Autowired
     private DriverRepo repo;
     @Autowired
     private RatingRepo rrepo;

    @PostMapping("/insertData")
    public ResponseEntity<Rating> insertData(@RequestBody DriverRequest driverRequest){

        Driver driver = new Driver();
        driver.setName(driverRequest.getName());
        driver.setEmail(driverRequest.getEmail());
        driver.setAddress(driverRequest.getAddress());
        driver.setMobile(driverRequest.getMobile());
        driver =repo.save(driver);

        Rating rating = new Rating(driverRequest);
        rating.setDriver(driver);
        rating = rrepo.save(rating);


        return new ResponseEntity<Rating>(rating, HttpStatus.CREATED);

    }



}

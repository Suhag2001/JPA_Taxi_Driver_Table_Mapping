package com.bootcoding.JPATaxiDriverTableMapping.entity;

import com.bootcoding.JPATaxiDriverTableMapping.request.DriverRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "RatingTable")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int trips;
    private int accepted;
    private int cancelled;


    @JoinColumn(name = "driver_id")
    @OneToOne
    private Driver driver;

    public Rating(DriverRequest req){
       this.trips = req.getTrips();
       this.accepted = req.getAccepted();
       this.cancelled = req.getCancelled();

    }


//    @OneToOne
//    private Driver driver;
}

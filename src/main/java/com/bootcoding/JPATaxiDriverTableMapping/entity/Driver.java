package com.bootcoding.JPATaxiDriverTableMapping.entity;

import com.bootcoding.JPATaxiDriverTableMapping.request.DriverRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "DriverTable")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private long mobile;
    private String email;

//    @OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
//    private Rating rating;



}

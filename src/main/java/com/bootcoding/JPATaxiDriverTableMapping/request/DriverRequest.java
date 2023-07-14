package com.bootcoding.JPATaxiDriverTableMapping.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DriverRequest {
    private String name ;
    private String address;
    private long mobile;
    private String email;
    private int trips;
    private int accepted;
    private int cancelled;

}

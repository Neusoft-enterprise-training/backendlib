package com.neusoft.hotel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.neusoft.hotel.customer.mapper","com.neusoft.hotel.employee.mapper"})

public class HotelWebAppByPtTeamApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelWebAppByPtTeamApplication.class, args);
    }

}

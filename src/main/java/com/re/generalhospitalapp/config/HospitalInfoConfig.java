package com.re.generalhospitalapp.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HospitalInfoConfig {
    @Value("${hospital.name}")
    private String hospitalName;

    @Value("${hospital.hotline}")
    private String hospitalHotline;

    @PostConstruct
    public void printHospitalInfo(){
        System.out.println("Tên bệnh viện: " + hospitalHotline);
        System.out.println("Hotline: " + hospitalHotline);
    }
}

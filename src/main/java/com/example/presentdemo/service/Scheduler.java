package com.example.presentdemo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Scheduler {
    @Scheduled(fixedDelay = 1000, initialDelay = 1000)
    public void printTimeTask(){
        long time = System.currentTimeMillis();
        System.out.println("Scheduler1 check at time: " + new Date(time).toString());
    }

//    @Scheduled(cron = "*/10 * * * * *")
    @Scheduled(cron = "0 * * * * *")
    public void cronTest(){
        long time = System.currentTimeMillis();
        System.out.println("Scheduler2 check at time: " + new Date(time).toString());
    }
}

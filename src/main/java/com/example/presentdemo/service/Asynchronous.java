package com.example.presentdemo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class Asynchronous {

//    @Async("asyncExecutor")
    @Async
    public void testAsync(){
        for(int i = 0; i<5000; i++){
            System.out.println("Thread1: "  + i);
        }
    }

//    @Async("asyncExecutor")
    @Async
    public void testAsync2(){
        for(int i = 0; i<5000; i++){
            System.out.println("Thread2: "  + i);
        }
    }
}

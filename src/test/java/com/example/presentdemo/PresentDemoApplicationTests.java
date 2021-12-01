package com.example.presentdemo;

import com.example.presentdemo.service.Asynchronous;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootTest
@EnableAsync
class PresentDemoApplicationTests {

//    @Bean(name = "asyncExecutorNew") // tên của Executor
//    public Executor asyncExecutor()
//    {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(5);
//        executor.setMaxPoolSize(5);
//        executor.setQueueCapacity(100);
//        executor.setThreadNamePrefix("AsynchThread-");
//        executor.initialize();
//        return executor;
//    }
    @Autowired
    Asynchronous asynchronous;

    @Test
    void contextLoads() {
        asynchronous.testAsync();
        asynchronous.testAsync2();
    }

}

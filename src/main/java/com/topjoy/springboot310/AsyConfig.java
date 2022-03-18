package com.topjoy.springboot310;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class AsyConfig {
     public Executor taskExecutor(){
         ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();
         executor.setCorePoolSize(10);
         executor.setMaxPoolSize(200);
         executor.setQueueCapacity(10);
         executor.initialize();
         return executor;
     }

}

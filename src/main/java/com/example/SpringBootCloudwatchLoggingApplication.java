package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCloudwatchLoggingApplication {

    Logger log = LoggerFactory.getLogger(SpringBootCloudwatchLoggingApplication.class);
    
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCloudwatchLoggingApplication.class, args);      
        new SpringBootCloudwatchLoggingApplication().foo();
        
        // THIS IS NEEDED OTHERWISE YOU WILL NOT SEE LOGS! There is an internal queue that gets flushed every 5 seconds
        try { Thread.sleep(10000); } catch (InterruptedException e) {}

    }
    
    public void foo() {
        log.debug("DEBUG");
        log.info("INFO");
        log.error("ERROR!");        
        log.warn("WARNING!");
    }
}
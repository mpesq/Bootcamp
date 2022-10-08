package com.openbootcamp.demospringrest.config;

import com.openbootcamp.demospringrest.services.BootcamperService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        this.packages("com.openbootcamp.demospringrest.controllers");
    }

    @Bean public BootcamperService bootcamperService() {
        return new BootcamperService();
    }
}

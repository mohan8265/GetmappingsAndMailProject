package com.Mohan.GetMappingsAndSendMails;

import com.Mohan.GetMappingsAndSendMails.Objects.Mobile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationAnnotation {

    @Bean
    public Mobile getMobileObj(){
        System.out.println("inside Bean methode of Mobile obj");
        return new Mobile("Realme");
    }

}

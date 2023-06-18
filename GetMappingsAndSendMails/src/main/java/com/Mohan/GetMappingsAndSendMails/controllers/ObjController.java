package com.Mohan.GetMappingsAndSendMails.controllers;

import com.Mohan.GetMappingsAndSendMails.Objects.Employee;
import com.Mohan.GetMappingsAndSendMails.Objects.Mobile;
import com.Mohan.GetMappingsAndSendMails.mail.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjController {
    @Autowired
    private Employee employee; // Injecting dependency of Employee class which has @Component Annotation inside the objects package

    @Autowired
    private Mobile mobile; // Injecting Dependency of Mobile class whose object created by ConfigurationAnnotation class which used  @Configuration and @Bean Annotations

    @Autowired
    private MailSender mailSender; // Injecting Dependency of MailSender class by @Component Annotation

    @GetMapping("employee")
    public String getEmployeeDetails(){
        String str = employee.toString();
        mailSender.sendMail(str);
        return str;
    }
    @GetMapping("mobile")
    public String getMobileDetails(){
        String str = mobile.getBrandName();
        mailSender.sendMail(str);
        return str;
    }

}

package com.Mohan.GetMappingsAndSendMails.Objects;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String name = "Mohan";
    private Integer age = 25;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

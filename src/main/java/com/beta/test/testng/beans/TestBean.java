package com.beta.test.testng.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
    public String returnHello(){
        return "Hello";
    }
}

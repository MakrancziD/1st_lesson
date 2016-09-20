package org.elosztott.src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.System;

@Component
public class FirstComponent {

    final private FirstService service;

    @Autowired
    public FirstComponent(FirstService service) {
        this.service = service;
    }

    public void printWelcome() {
        System.out.println(this.service.getWelcome());
    }
}
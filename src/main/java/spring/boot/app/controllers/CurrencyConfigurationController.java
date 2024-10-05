package spring.boot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.app.Course;
import spring.boot.app.CurrencyServiceConfiguration;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/configuration")
    public CurrencyServiceConfiguration retrieveAllCourses() {
        return configuration;
    }
}

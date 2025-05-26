package com.erp.sistema.erp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "<h1>ERP Application running in background...</h1>";
    }

    @GetMapping("/info")
    public String info() {
        return "<h1>ERP Application Information</h1>" +
               "<p>Java version: " + System.getProperty("java.version") + "</p>" +
               "<p>Java home: " + System.getProperty("java.home") + "</p>";
    }
}

package com.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    
    @GetMapping("/api/config")
    public String health() {
        return "82-config-server RUNNING - Port 8888 - Central Config Server - Tier 8 LAST! - Config Repo: file:./config-repo - Serving configs for 78,79,80,81!";
    }
}
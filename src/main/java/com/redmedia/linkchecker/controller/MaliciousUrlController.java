package com.redmedia.linkchecker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redmedia.linkchecker.model.MaliciousUrl;
import com.redmedia.linkchecker.service.MaliciousUrlService;

import java.util.List;

@RestController
@RequestMapping("/malicious-urls")
public class MaliciousUrlController {

    private final MaliciousUrlService maliciousUrlService;

    @Autowired
    public MaliciousUrlController(MaliciousUrlService maliciousUrlService) {
        this.maliciousUrlService = maliciousUrlService;
    }

    @GetMapping
    public List<MaliciousUrl> getAllMaliciousUrls() {
        return maliciousUrlService.getAllMaliciousUrls();
    }
}

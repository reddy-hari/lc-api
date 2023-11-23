package com.redmedia.linkchecker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.redmedia.linkchecker.model.MaliciousUrl;
import com.redmedia.linkchecker.repository.MaliciousUrlRepository;
import java.util.List;

@Service
public class MaliciousUrlService {
    private final MaliciousUrlRepository maliciousUrlRepository;

    @Autowired
    public MaliciousUrlService(MaliciousUrlRepository maliciousUrlRepository) {
        this.maliciousUrlRepository = maliciousUrlRepository;
    }

    public List<MaliciousUrl> getAllMaliciousUrls() {
        return maliciousUrlRepository.findAll();
    }
}

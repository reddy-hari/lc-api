package com.redmedia.linkchecker.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.redmedia.linkchecker.model.MaliciousUrl;

public interface MaliciousUrlRepository extends JpaRepository<MaliciousUrl, Long> {
    List<MaliciousUrl> findAll();
}

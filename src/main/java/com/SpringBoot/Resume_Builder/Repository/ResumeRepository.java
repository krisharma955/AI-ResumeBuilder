package com.SpringBoot.Resume_Builder.Repository;

import com.SpringBoot.Resume_Builder.Entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {
}

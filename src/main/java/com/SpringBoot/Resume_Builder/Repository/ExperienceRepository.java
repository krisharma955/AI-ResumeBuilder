package com.SpringBoot.Resume_Builder.Repository;

import com.SpringBoot.Resume_Builder.Entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}

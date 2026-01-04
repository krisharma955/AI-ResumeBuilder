package com.SpringBoot.Resume_Builder.Repository;

import com.SpringBoot.Resume_Builder.Entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
}

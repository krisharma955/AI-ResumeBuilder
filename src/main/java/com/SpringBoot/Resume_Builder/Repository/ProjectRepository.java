package com.SpringBoot.Resume_Builder.Repository;

import com.SpringBoot.Resume_Builder.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProjectRepository extends JpaRepository<Project, Long> {
}

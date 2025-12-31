package com.SpringBoot.Resume_Builder.Service;

import com.SpringBoot.Resume_Builder.Entity.Project;
import com.SpringBoot.Resume_Builder.Entity.Skill;
import org.jspecify.annotations.Nullable;

public interface ProjectService {
    Project createProject(Long userId, Long resumeId, Project project);

    Project getProjectById(Long id, Long userId);

    Project getProjectByResumeId(Long resumeId, Long userId);

    Project updateProject(Long id, Project project, Long userId);

    Void deleteProject(Long id, Long userId);

    Project enhanceProject(Long id, Long userId);
}

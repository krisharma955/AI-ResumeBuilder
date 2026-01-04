package com.SpringBoot.Resume_Builder.Service.impl;

import com.SpringBoot.Resume_Builder.Entity.Project;
import com.SpringBoot.Resume_Builder.Service.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public Project createProject(Long userId, Long resumeId, Project project) {
        return null;
    }

    @Override
    public Project getProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public Project getProjectByResumeId(Long resumeId, Long userId) {
        return null;
    }

    @Override
    public Project updateProject(Long id, Project project, Long userId) {
        return null;
    }

    @Override
    public Void deleteProject(Long id, Long userId) {
        return null;
    }

    @Override
    public Project enhanceProject(Long id, Long userId) {
        return null;
    }
}

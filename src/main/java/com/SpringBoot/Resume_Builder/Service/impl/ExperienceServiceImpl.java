package com.SpringBoot.Resume_Builder.Service.impl;

import com.SpringBoot.Resume_Builder.Entity.Experience;
import com.SpringBoot.Resume_Builder.Service.ExperienceService;
import org.springframework.stereotype.Service;

@Service
public class ExperienceServiceImpl implements ExperienceService {
    @Override
    public Experience createExperience(Long resumeId, Experience experience, Long userId) {
        return null;
    }

    @Override
    public Experience getExperienceByResumeId(Long resumeId, Long userId) {
        return null;
    }

    @Override
    public Experience updateExperience(Long id, Experience experience, Long userId) {
        return null;
    }

    @Override
    public Experience getExperienceById(Long id, Long userId) {
        return null;
    }

    @Override
    public Void deleteExperience(Long id, Long userId) {
        return null;
    }

    @Override
    public Experience enhanceExperience(Long id, Long userId) {
        return null;
    }
}

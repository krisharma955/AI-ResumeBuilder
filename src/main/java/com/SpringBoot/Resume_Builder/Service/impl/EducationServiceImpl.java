package com.SpringBoot.Resume_Builder.Service.impl;

import com.SpringBoot.Resume_Builder.Entity.Education;
import com.SpringBoot.Resume_Builder.Service.EducationService;
import org.springframework.stereotype.Service;

@Service
public class EducationServiceImpl implements EducationService {
    @Override
    public Education createEducation(Long userId, Long resumeId, Education education) {
        return null;
    }

    @Override
    public Education getEducationById(Long id, Long userId) {
        return null;
    }

    @Override
    public Education getEducationByResumeId(Long resumeId, Long userId) {
        return null;
    }

    @Override
    public Education updateEducation(Long id, Education education, Long userId) {
        return null;
    }

    @Override
    public Void deleteEducation(Long id, Long userId) {
        return null;
    }

    @Override
    public Education enhanceEducation(Long id, Long userId) {
        return null;
    }
}

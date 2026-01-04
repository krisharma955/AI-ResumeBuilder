package com.SpringBoot.Resume_Builder.Service.impl;

import com.SpringBoot.Resume_Builder.Entity.Resume;
import com.SpringBoot.Resume_Builder.Service.ResumeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {
    @Override
    public Resume createResume(Long userId, Resume resume) {
        return null;
    }

    @Override
    public Resume getResumeById(Long id, Long userId) {
        return null;
    }

    @Override
    public List<Resume> getUserResumes(Long userId) {
        return List.of();
    }

    @Override
    public Resume updateResume(Long id, Resume resume, Long userId) {
        return null;
    }

    @Override
    public Void deleteResume(Long id, Long userId) {
        return null;
    }
}

package com.SpringBoot.Resume_Builder.Service;

import com.SpringBoot.Resume_Builder.Entity.Resume;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ResumeService {
    Resume createResume(Long userId, Resume resume);

    Resume getResumeById(Long id, Long userId);

    List<Resume> getUserResumes(Long userId);

    Resume updateResume(Long id, Resume resume, Long userId);

    Void deleteResume(Long id, Long userId);
}

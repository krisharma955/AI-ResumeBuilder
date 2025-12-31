package com.SpringBoot.Resume_Builder.Service;

import com.SpringBoot.Resume_Builder.Entity.Education;
import org.jspecify.annotations.Nullable;

public interface EducationService {
    Education createEducation(Long userId, Long resumeId, Education education);

    Education getEducationById(Long id, Long userId);

    Education getEducationByResumeId(Long resumeId, Long userId);

    Education updateEducation(Long id, Education education, Long userId);

    Void deleteEducation(Long id, Long userId);

    Education enhanceEducation(Long id, Long userId);
}

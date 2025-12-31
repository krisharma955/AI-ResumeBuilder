package com.SpringBoot.Resume_Builder.Service;

import com.SpringBoot.Resume_Builder.Entity.Experience;
import org.jspecify.annotations.Nullable;

public interface ExperienceService {
    Experience createExperience(Long resumeId, Experience experience, Long userId);

    Experience getExperienceByResumeId(Long resumeId, Long userId);

    Experience updateExperience(Long id, Experience experience, Long userId);

    Experience getExperienceById(Long id, Long userId);

    Void deleteExperience(Long id, Long userId);

    Experience enhanceExperience(Long id, Long userId);
}

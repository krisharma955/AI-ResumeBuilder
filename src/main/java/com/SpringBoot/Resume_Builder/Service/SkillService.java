package com.SpringBoot.Resume_Builder.Service;

import com.SpringBoot.Resume_Builder.Entity.Skill;
import org.jspecify.annotations.Nullable;

public interface SkillService {
    Skill createSkill(Long userId, Long resumeId, Skill skill);

    Skill getSkillById(Long id, Long userId);

    Skill getSkillByResumeId(Long resumeId, Long userId);

    Skill updateSkill(Long id, Skill skill, Long userId);

    Void deleteSkill(Long id, Long userId);
}

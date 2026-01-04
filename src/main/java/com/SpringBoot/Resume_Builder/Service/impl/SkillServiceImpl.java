package com.SpringBoot.Resume_Builder.Service.impl;

import com.SpringBoot.Resume_Builder.Entity.Skill;
import com.SpringBoot.Resume_Builder.Service.SkillService;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {
    @Override
    public Skill createSkill(Long userId, Long resumeId, Skill skill) {
        return null;
    }

    @Override
    public Skill getSkillById(Long id, Long userId) {
        return null;
    }

    @Override
    public Skill getSkillByResumeId(Long resumeId, Long userId) {
        return null;
    }

    @Override
    public Skill updateSkill(Long id, Skill skill, Long userId) {
        return null;
    }

    @Override
    public Void deleteSkill(Long id, Long userId) {
        return null;
    }
}

package com.SpringBoot.Resume_Builder.Controller;

import com.SpringBoot.Resume_Builder.Entity.Skill;
import com.SpringBoot.Resume_Builder.Service.SkillService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/skill")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class SkillController {

    SkillService skillService;

    @PostMapping("/resume/{resumeId}")
    public ResponseEntity<Skill> createSkill(@PathVariable Long resumeId, @RequestBody Skill skill) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(skillService.createSkill(userId, resumeId, skill));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Skill> getSkillById(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(skillService.getSkillById(id, userId));
    }

    @GetMapping("/resume/{resumeId}")
    public ResponseEntity<Skill> getEducationByResumeId(@PathVariable Long resumeId) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(skillService.getSkillByResumeId(resumeId, userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Skill> updateEducation(@PathVariable Long id, @RequestBody Skill skill) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(skillService.updateSkill(id, skill, userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEducation(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(skillService.deleteSkill(id, userId));
    }

}

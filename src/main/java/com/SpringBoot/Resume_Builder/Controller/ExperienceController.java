package com.SpringBoot.Resume_Builder.Controller;

import com.SpringBoot.Resume_Builder.Entity.Experience;
import com.SpringBoot.Resume_Builder.Service.ExperienceService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/experience")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ExperienceController {

    ExperienceService experienceService;

    @PostMapping("/resume/{resumeId}")
    public ResponseEntity<Experience> createExperience(@PathVariable Long resumeId, @RequestBody Experience experience) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(experienceService.createExperience(resumeId, experience, userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Experience> getExperienceById(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(experienceService.getExperienceById(id, userId));
    }

    @GetMapping("/resume/{resumeId}")
    public ResponseEntity<Experience> getExperienceByResumeId(@PathVariable Long resumeId) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(experienceService.getExperienceByResumeId(resumeId, userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Experience> updateExperience(@PathVariable Long id, @RequestBody Experience experience) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(experienceService.updateExperience(id, experience, userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExperience(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(experienceService.deleteExperience(id, userId));
    }

    @PostMapping("/{id}/enhance")
    public ResponseEntity<Experience> enhanceExperienceWithAI(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(experienceService.enhanceExperience(id, userId));
    }


}

package com.SpringBoot.Resume_Builder.Controller;

import com.SpringBoot.Resume_Builder.Entity.Education;
import com.SpringBoot.Resume_Builder.Service.EducationService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/education")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class EducationController {

    EducationService educationService;

    @PostMapping("/resume/{resumeId}")
    public ResponseEntity<Education> createEducation(@PathVariable Long resumeId, @RequestBody Education education) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(educationService.createEducation(userId, resumeId, education));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Education> getEducationById(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(educationService.getEducationById(id, userId));
    }

    @GetMapping("/resume/{resumeId}")
    public ResponseEntity<Education> getEducationByResumeId(@PathVariable Long resumeId) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(educationService.getEducationByResumeId(resumeId, userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Education> updateEducation(@PathVariable Long id, @RequestBody Education education) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(educationService.updateEducation(id, education, userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEducation(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(educationService.deleteEducation(id, userId));
    }

    @PostMapping("/{id}/enhance")
    public ResponseEntity<Education> enhanceEducationWithAI(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(educationService.enhanceEducation(id, userId));
    }

}

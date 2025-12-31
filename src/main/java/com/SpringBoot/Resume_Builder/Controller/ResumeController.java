package com.SpringBoot.Resume_Builder.Controller;

import com.SpringBoot.Resume_Builder.Entity.Resume;
import com.SpringBoot.Resume_Builder.Service.ResumeService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/resume")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ResumeController {

    ResumeService resumeService;

    @PostMapping
    public ResponseEntity<Resume> createResume(@RequestBody Resume resume) {
        Long userId = 1L; //from Spring Security
        return ResponseEntity.status(HttpStatus.CREATED).body(resumeService.createResume(userId, resume));
    }

    @GetMapping
    public ResponseEntity<List<Resume>> getMyResumes() {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(resumeService.getUserResumes(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resume> getResumeById(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(resumeService.getResumeById(id, userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Resume> updateResume(@PathVariable Long id, @RequestBody Resume resume) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(resumeService.updateResume(id, resume, userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResume(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(resumeService.deleteResume(id, userId));
    }

}

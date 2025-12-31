package com.SpringBoot.Resume_Builder.Controller;

import com.SpringBoot.Resume_Builder.Entity.Project;
import com.SpringBoot.Resume_Builder.Service.ProjectService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProjectController {

    ProjectService projectService;

    @PostMapping("/resume/{resumeId}")
    public ResponseEntity<Project> createProject(@PathVariable Long resumeId, @RequestBody Project project) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(userId, resumeId, project));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(projectService.getProjectById(id, userId));
    }

    @GetMapping("/resume/{resumeId}")
    public ResponseEntity<Project> getProjectByResumeId(@PathVariable Long resumeId) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(projectService.getProjectByResumeId(resumeId, userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Project> updateEducation(@PathVariable Long id, @RequestBody Project project) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(projectService.updateProject(id, project, userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEducation(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(projectService.deleteProject(id, userId));
    }

    @PostMapping("/{id}/enhance")
    public ResponseEntity<Project> enhanceProjectWithAI(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(projectService.enhanceProject(id, userId));
    }

}

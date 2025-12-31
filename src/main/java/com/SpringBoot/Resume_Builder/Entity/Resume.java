package com.SpringBoot.Resume_Builder.Entity;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Resume {

    Long id;

    User user; //ManyToOne

    String title;

    List<Education> educationList = new ArrayList<>(); //OneToMany

    List<Experience> experienceList = new ArrayList<>(); //OneToMany

    List<Skill> skillsList = new ArrayList<>(); //OneToMany

    List<Project> projectsList = new ArrayList<>(); //OneToMany

    Boolean isGenerated = false;

    Instant createdAt;

    Instant updatedAt;

}

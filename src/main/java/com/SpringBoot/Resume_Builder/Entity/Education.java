package com.SpringBoot.Resume_Builder.Entity;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Education {

    Long id;

    Resume resume; //ManyToOne

    String institution;

    String degree;

    String fieldOfStudy;

    LocalDate startDate;

    LocalDate endDate;

    Double gpa;

    String description;

    String aiEnhancedDescription;

}

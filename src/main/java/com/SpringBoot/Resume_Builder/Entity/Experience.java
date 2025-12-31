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
public class Experience {

    Long id;

    Resume resume; //ManyToOne

    String company;

    String position;

    String location;

    LocalDate startDate;

    LocalDate endDate;

    Boolean currentlyWorking;

    String description;

    String aiEnhancedDescription;

    String achievements;

}

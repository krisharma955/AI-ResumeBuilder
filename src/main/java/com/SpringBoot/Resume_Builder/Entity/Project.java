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
public class Project {

    Long id;

    Resume resume; //ManyToOne

    String name;

    String description;

    String aiEnhancedDescription;

    String technologies; // can be a list

    String url;

    String role;

}

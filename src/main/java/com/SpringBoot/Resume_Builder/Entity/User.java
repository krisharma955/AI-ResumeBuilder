package com.SpringBoot.Resume_Builder.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "users")
public class User {

    Long id; //PK

    String firstName;
    String lastName;

    String email; //unique

    String phoneNumber; //unique

    String professionalSummary;

    List<Resume> resumeList = new ArrayList<>(); //OneToMany

    Instant createdAt;

    Instant updatedAt;

    Instant deletedAt; //Soft-delete

}

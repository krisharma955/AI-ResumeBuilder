package com.SpringBoot.Resume_Builder.Entity;

import com.SpringBoot.Resume_Builder.Enums.SkillCategory;
import com.SpringBoot.Resume_Builder.Enums.SkillLevel;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Skill {

    Long id;

    Resume resume; //ManyToOne

    String name;

    SkillLevel level;

    SkillCategory category;

}

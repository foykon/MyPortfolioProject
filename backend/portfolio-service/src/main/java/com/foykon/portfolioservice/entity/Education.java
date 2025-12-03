package com.foykon.portfolioservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "EDUCATIONS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Education extends PortfolioEntity {

    @Column(name = "SCHOOL_NAME", nullable = false)
    private String schoolName;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "POINT")
    private double point;

    @ManyToMany
    @JoinTable(
            name = "EDUCATION_SKILLS",
            joinColumns = @JoinColumn(name = "EDUCATION_ID"),
            inverseJoinColumns = @JoinColumn(name = "SKILL_ID")
    )
    private Set<Skill> gainedSkills = new HashSet<>();


}

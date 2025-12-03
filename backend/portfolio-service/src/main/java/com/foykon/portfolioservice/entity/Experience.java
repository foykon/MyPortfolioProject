package com.foykon.portfolioservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "EXPERIENCES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Experience extends PortfolioEntity{

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "COMPANY")
    private String company;

    @Column(name = "LOCATION")
    private String location;

    @Enumerated(EnumType.STRING)
    @Column(name = "EMPLOYMENT_TYPE")
    private EmploymentType employmentType;

    @Enumerated(EnumType.STRING)
    @Column(name = "LOCATION_TYPE")
    private LocationType locationType;

    @ManyToMany
    @JoinTable(
            name = "EXPERIENCE_SKILLS",
            joinColumns = @JoinColumn(name = "EXPERIENCE_ID"),
            inverseJoinColumns = @JoinColumn(name = "SKILL_ID")
    )
    private Set<Skill> gainedSkills = new HashSet<>();



}

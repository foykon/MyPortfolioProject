package com.foykon.portfolioservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PROJECTS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project extends PortfolioEntity{

    @Column(name = "TITLE", nullable = false)
    private String title;

    @ManyToMany
    @JoinTable(
            name = "PROJECT_SKILLS",
            joinColumns = @JoinColumn(name = "PROJECT_ID"),
            inverseJoinColumns = @JoinColumn(name = "SKILL_ID")
    )
    private Set<Skill> usedSkills = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "PROJECT_GALLERY",
            joinColumns = @JoinColumn(name = "PROJECT_ID"),
            inverseJoinColumns = @JoinColumn(name = "MEDIA_ID")
    )
    private Set<Media> gallery = new HashSet<>();

}

package com.foykon.portfolioservice.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "USER_PROFILES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile extends BaseEntity {

    @Column(name = "USERNAME", nullable = false, unique = true)
    private String username;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "FULL_NAME", nullable = false)
    private String fullName;

    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column(name = "SUMMARY", length = 4000)
    private String summary;

    @OneToOne
    @JoinColumn(name = "PROFILE_IMAGE_ID")
    private Media profileImage;

    @OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Project> projects = new ArrayList<>();

    @OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Experience> experiences = new ArrayList<>();

    @OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Education> educations = new ArrayList<>();

    @OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SocialMedia> socialMedias = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "USER_SKILLS",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "SKILL_ID")
    )
    private Set<Skill> skills = new HashSet<>();

}
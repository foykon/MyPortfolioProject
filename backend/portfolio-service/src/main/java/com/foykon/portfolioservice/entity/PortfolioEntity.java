package com.foykon.portfolioservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@MappedSuperclass
@Getter
@Setter
public abstract class PortfolioEntity extends BaseEntity {

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "COVER_IMAGE_ID")
    private Media coverImage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserProfile userProfile;
}

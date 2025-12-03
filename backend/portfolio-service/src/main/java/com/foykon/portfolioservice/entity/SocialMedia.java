package com.foykon.portfolioservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "SOCIAL_MEDIAS")
@Getter
@Setter
public class SocialMedia extends BaseEntity {

    @Column(name = "PLATFORM_NAME", nullable = false)
    private String platformName;

    @Column(name = "URL", nullable = false)
    private String url;

    @Column(name = "ICON_CODE")
    private String iconCode;

    @Column(name = "DISPLAY_ORDER")
    private Integer displayOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserProfile userProfile;
}

package com.foykon.portfolioservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MEDIAS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Media extends BaseEntity {

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "MEDIA_TYPE")
    private String mediaType;

    @Column(name = "FILE_URL", nullable = false)
    private String fileUrl;

    @Column(name = "CONTENT_TYPE")
    private String contentType;

    @Column(name = "FILE_SIZE")
    private Long fileSize;
}

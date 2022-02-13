package com.tyrontundrom.blog.model;


import com.tyrontundrom.blog.jpa.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

@Entity
@Table(name = "posts")
@Getter
@Setter
@RequiredArgsConstructor
class Post extends BaseEntity {


    @NotBlank
    @Column
    private String title;

    @Lob
    @Column
    @NotEmpty
    private String content;

    @Column
    private Instant createdOn;

    @Column
    private Instant updatedOn;

    @Column
    @NotBlank
    private String username;
}

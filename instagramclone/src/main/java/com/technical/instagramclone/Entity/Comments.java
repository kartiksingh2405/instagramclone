package com.technical.instagramclone.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity(name = "/Comments")
public class Comments {

    @Id
    @GeneratedValue
    private int id;

    private String commentId;
    private String userId;
    private String postId;
    private Timestamp timestamp;
    private String comment;

}

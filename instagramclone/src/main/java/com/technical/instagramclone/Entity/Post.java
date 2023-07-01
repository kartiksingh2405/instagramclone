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
@Entity(name="Post")
public class Post {

    @Id
    @GeneratedValue
    private int id;

    private String postId;
    private String userId;
    private String postPath;
    private Timestamp timestamp;
    private int likeCount;
}

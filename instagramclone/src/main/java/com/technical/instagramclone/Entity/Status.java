package com.technical.instagramclone.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity(name="Status")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Status {

    @Id
    @GeneratedValue
    private int id;

    private String statusId;
    private String userId;
    private String path;
    private String userName;
    private Timestamp timestamp;



}

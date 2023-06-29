package com.technical.instagramclone.Repository;

import com.technical.instagramclone.Entity.Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository

public interface StatusRepo extends CrudRepository<Status, Integer> {

    Status save(Status save);
    ArrayList<Status>findAll();
}

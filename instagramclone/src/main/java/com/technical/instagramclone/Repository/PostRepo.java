package com.technical.instagramclone.Repository;

import com.technical.instagramclone.Entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface  PostRepo extends CrudRepository<Post, Integer> {

    Post save(Post post);
    ArrayList<Post> findAll();

}


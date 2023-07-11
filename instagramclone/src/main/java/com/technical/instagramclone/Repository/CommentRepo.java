package com.technical.instagramclone.Repository;

import com.technical.instagramclone.Entity.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommentRepo extends CrudRepository<Comments, Integer> {

    Comments save(Comments comment);
    ArrayList<Comments> findAllByPostId(String postId);
    ArrayList<Comments> findAll();
}

package com.technical.instagramclone.Service;

import com.technical.instagramclone.Entity.Post;
import com.technical.instagramclone.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    public Post submitPostToDataBase(Post post){

        return postRepo.save(post);
    }

    public ArrayList<Post> retrievePostFromDB() {
        return postRepo.findAll();
    }
}

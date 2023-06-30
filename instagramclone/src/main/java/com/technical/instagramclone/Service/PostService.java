package com.technical.instagramclone.Service;

import com.technical.instagramclone.Entity.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

    public Post submitPostToDataBase(Post post){
        return new Post();
    }

    public ArrayList<Post> retrievePostFromDB() {
        return new ArrayList<Post>();
    }
}

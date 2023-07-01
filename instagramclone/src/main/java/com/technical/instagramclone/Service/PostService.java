package com.technical.instagramclone.Service;

import com.technical.instagramclone.Entity.Post;
import com.technical.instagramclone.Entity.Status;
import com.technical.instagramclone.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    @Autowired
    UserService userService;

    public Post submitPostToDataBase(Post post){

        return postRepo.save(post);
    }

    public ArrayList<Post> retrievePostFromDB() {

        ArrayList<Post> postList=postRepo.findAll();

        for(int i=0;i<postList.size();i++) {
            Post postItem=postList.get(i);
            postItem.setUserName(userService.displayUserMetaData(postItem.getUserId()).getUserName());
        }

        return postList;
    }
}

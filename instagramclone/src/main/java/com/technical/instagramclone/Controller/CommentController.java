package com.technical.instagramclone.Controller;

import com.technical.instagramclone.Entity.Comments;
import com.technical.instagramclone.Entity.Post;
import com.technical.instagramclone.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/comments")
public class CommentController {


    @PostMapping("")
    private Comments submitComment(@RequestBody Comments comment){

        return new Comments();
    }

    @GetMapping("/{postId}")
    private ArrayList<Comments> getCommentsForPost(@PathVariable("postId") String postId){
        return new ArrayList<Comments>();
    }

}

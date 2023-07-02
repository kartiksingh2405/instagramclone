package com.technical.instagramclone.Controller;

import com.technical.instagramclone.Entity.Comments;
import com.technical.instagramclone.Service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/comments")
public class CommentController {


    @Autowired
    CommentsService commentsService;

    @PostMapping("")
    private Comments submitComment(@RequestBody Comments comment){

        return commentsService.submitCommentToDB(comment);
    }

    @GetMapping("/{postId}")
    private ArrayList<Comments> getCommentsForPost(@PathVariable("postId") String postId){
        return commentsService.getAllCommentsForDB(postId);
    }

}

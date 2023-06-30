package com.technical.instagramclone.Controller;

import com.technical.instagramclone.Entity.Post;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/post")
public class PostController {

    @PostMapping("")
    private Post submitUserPost(@RequestBody Post post){
        return new Post();
    }

    @GetMapping("/post")
    private ArrayList<Post> getAllPost(){
        return new ArrayList<Post>();
    }
}

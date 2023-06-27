package com.technical.instagramclone.Controller;

import com.technical.instagramclone.Entity.Users;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("")
    private boolean submitUser(@RequestBody Users users) {
        return true;
    }

    @GetMapping("/{userid}")
    private Users getUserDetail(@PathVariable("userid") String userId) {
        return new Users();
    }

}

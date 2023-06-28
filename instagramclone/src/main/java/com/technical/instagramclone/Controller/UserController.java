package com.technical.instagramclone.Controller;

import com.technical.instagramclone.Entity.Users;
import com.technical.instagramclone.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("")
    private boolean submitUser(@RequestBody Users users) {
        userService.submitMetaDataOfUser(users);
        return true;
    }

    @GetMapping("/{userid}")
    private Users getUserDetail(@PathVariable("userid") String userId) {
        userService.displayUserMetaData(userId);
        return new Users();
    }

}

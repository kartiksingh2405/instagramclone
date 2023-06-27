package Controller;

import Entity.Users;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("")
    private boolean submitUser() {
        return true;
    }

    @GetMapping("/{userid}")
    private Users getUserDetail(@PathVariable("userid") String userId) {
        return new Users();
    }

}

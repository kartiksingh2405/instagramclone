package com.technical.instagramclone.Controller;

import com.technical.instagramclone.Entity.Status;
import com.technical.instagramclone.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    StatusService statusService;

    @PostMapping("")
    private Status submitStatus(@RequestBody Status status) {
        return statusService.submitDataIntoDB(status);
    }
    @GetMapping("")
    private ArrayList<Status> getAllStatus(){
        return statusService.retrieveStatus();
    }

}

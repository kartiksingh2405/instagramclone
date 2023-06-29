package com.technical.instagramclone.Service;

import com.technical.instagramclone.Entity.Status;
import com.technical.instagramclone.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Service
public class StatusService {

    public Status submitDataIntoDB(Users user) {
        return new Status();
    }

    public ArrayList<Status> retrieveStatus() {
        return new ArrayList<Status>();
    }

}

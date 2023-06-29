package com.technical.instagramclone.Service;

import com.technical.instagramclone.Entity.Status;
import com.technical.instagramclone.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StatusService {


    @Autowired
    StatusRepo statusRepo;


    public Status submitDataIntoDB(Status status) {

        return statusRepo.save(status);
    }

    public ArrayList<Status> retrieveStatus() {
        return statusRepo.findAll();
    }

}

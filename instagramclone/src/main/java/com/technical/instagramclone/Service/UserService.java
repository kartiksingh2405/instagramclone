package com.technical.instagramclone.Service;

import com.technical.instagramclone.Entity.Users;
import com.technical.instagramclone.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public Users submitMetaDataOfUser(Users user) {
        return new Users();
    }

    public Users displayUserMetaData(String userid) {
        return new Users();
    }

}

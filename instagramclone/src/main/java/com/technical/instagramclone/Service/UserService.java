package com.technical.instagramclone.Service;

import com.technical.instagramclone.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {



    public Users submitMetaDataOfUser(Users user) {
        return new Users();
    }

    public Users displayUserMetaData(String userid) {
        return new Users();
    }

}

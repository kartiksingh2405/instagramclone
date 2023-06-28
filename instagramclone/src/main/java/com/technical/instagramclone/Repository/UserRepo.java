package com.technical.instagramclone.Repository;

import com.technical.instagramclone.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends CrudRepository<Users,Integer> {



    Users save(Users user);
    Users findByUserId(String userId);
}

package com.technical.instagramclone.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends CrudRepository<Users,Integer> {
}

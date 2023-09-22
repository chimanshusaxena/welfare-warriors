package com.welfare.warriors.paYouthVote.repository;


import com.welfare.warriors.paYouthVote.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
    //@Query(value = "{ 'email' : ?0 }", fields = "{ '_id' : 0, 'email' : 1 }")
    public User findByEmail(String email);

}

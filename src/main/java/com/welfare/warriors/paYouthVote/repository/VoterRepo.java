package com.welfare.warriors.paYouthVote.repository;


import com.welfare.warriors.paYouthVote.model.Voter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoterRepo extends MongoRepository<Voter,String> {
    public Voter findByEmail(String email);

}

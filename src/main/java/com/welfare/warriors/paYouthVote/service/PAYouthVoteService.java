package com.welfare.warriors.paYouthVote.service;

import com.welfare.warriors.paYouthVote.model.User;
import com.welfare.warriors.paYouthVote.model.Voter;
import com.welfare.warriors.paYouthVote.repository.UserRepo;
import com.welfare.warriors.paYouthVote.repository.VoterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PAYouthVoteService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private VoterRepo voterRepo ;

    public User fetchUserByEmail(String email) {
       return userRepo.findByEmail(email);
    }

    public Object fetchVoterByEmail(String email) { return voterRepo.findByEmail(email);
    }

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public Voter saveVoter(Voter voter) {
        return voterRepo.save(voter);
    }
}

package com.welfare.warriors.paYouthVote.controller;

import com.welfare.warriors.paYouthVote.model.User;
import com.welfare.warriors.paYouthVote.model.Voter;
import com.welfare.warriors.paYouthVote.service.PAYouthVoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
public class PAYouthVoteController {

    private final PAYouthVoteService service;

    @Autowired
    public PAYouthVoteController(PAYouthVoteService service) {
        this.service = service;
    }

    @PostMapping(value="/user/save")
    public ResponseEntity<User> saveUser(User user, Errors error){
        return ResponseEntity.status(HttpStatus.OK).body(service.saveUser(user));
    }
    @RequestMapping(value="/user")
    public ResponseEntity<String> getUser(String email){

        return ResponseEntity.status(HttpStatus.OK).body(service.fetchUserByEmail(email).toString());

    }
    @PostMapping(value="/voter/save")
    public ResponseEntity<Voter> saveVoter(Voter voter, Errors error){
        return ResponseEntity.status(HttpStatus.OK).body(service.saveVoter(voter));
    }

    @RequestMapping(value="/voter")
    public ResponseEntity<String> getVoter(String email){

        return ResponseEntity.status(HttpStatus.OK).body(service.fetchVoterByEmail(email).toString());

    }


}

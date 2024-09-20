package com.aws.practise.service;

import com.aws.practise.exception.CustomGlobalException;
import com.aws.practise.model.User;
import com.aws.practise.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {

        //Add validation specific to user
        try {
            User userResponse = userRepository.save(user);
            return userResponse;
        } catch (CustomGlobalException cge) {
            log.info("Exception Occureed"+cge.getCode()+" "+cge.getMessage());
            throw new CustomGlobalException(cge.getCode(),cge.getMessage());
        } catch(Exception e) {
            log.info("Exception occured"+e);
            throw new CustomGlobalException("500", "An unexpected error occurred while creating the user."); // Throw new exception
        }
    }


}

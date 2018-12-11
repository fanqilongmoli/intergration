package com.fanqilong.intergration.user;

import com.fanqilong.intergration.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUser(){
        return userRepository.findAll();
    }
}

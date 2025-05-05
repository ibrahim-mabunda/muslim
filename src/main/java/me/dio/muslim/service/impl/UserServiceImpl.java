package me.dio.muslim.service.impl;

import me.dio.muslim.service.UserService;
import me.dio.muslim.domain.repository.UserRepository;

import org.springframework.stereotype.Service;

import me.dio.muslim.domain.model.User; 

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User update(long id, User userToUpdate) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found with id: " + id);
        }
        userToUpdate.setId(id);
        return userRepository.save(userToUpdate);
    }
    
    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != 0 && userRepository.existsById(userToCreate.getId())) {
            throw new RuntimeException("User already exists with id: " + userToCreate.getId());
        }
        return userRepository.save(userToCreate);               
    }
}

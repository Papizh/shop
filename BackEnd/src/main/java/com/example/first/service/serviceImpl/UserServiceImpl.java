package com.example.first.service.serviceImpl;

import com.example.first.dto.LoginRequest;
import com.example.first.dto.UserRequest;
import com.example.first.dto.UserResponse;
import com.example.first.entity.User;
import com.example.first.repository.UserRepository;
import com.example.first.security.tokenUtils.TokenTool;
import com.example.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenTool tokenTool;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findOne(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public UserResponse save(UserRequest userRequest) {
        User user = new User();

        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user = userRepository.save(user);
        return new UserResponse(user);
    }

    @Override
    public UserResponse update(Long id, UserRequest userRequest) {
        User user = userRepository.findOne(id);
        user.setName(userRequest.getName());

        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        return new UserResponse(userRepository.save(user));
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Override

    public String login(LoginRequest loginRequest) {
        User user = userRepository.findOneByEmail(loginRequest.getLogin());
        if (user != null) {
            if (user.getPassword().equals(loginRequest.getPassword())) {
                return tokenTool.createToken(user.getEmail(), user.getRole().name());
            } else {
                throw new IllegalArgumentException("Wrong input data");
            }
        } else {
            throw new IllegalArgumentException("Wrong input data");
        }
    }


    @Override
    public UserResponse create(UserRequest userRequest) throws IOException {
        User user = new User();
        user.setEmail(userRequest.getEmail());
        user.setName(userRequest.getName());
        user.setPassword(userRequest.getPassword());
        user.setRole(userRequest.getRole());
        return new UserResponse(userRepository.save(user));
    }
}

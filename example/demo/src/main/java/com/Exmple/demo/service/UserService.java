package com.Exmple.demo.service;

import com.Exmple.demo.dto.UserDto;
import com.Exmple.demo.model.User;
import com.Exmple.demo.repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public List<UserDto> getAllUsers(){
        List<User> userList = userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDto>>(){}.getType());
        //This method retrieves a list of User entities from the repository and converts it into a list of UserDto objects using ModelMapper.

    }

    public UserDto saveUser(UserDto userDto) {
        userRepo.save(modelMapper.map(userDto, User.class));
        return userDto;
        //This method saves a UserDto by mapping it to a User entity, storing it in the repository, and then returning the original UserDto object.
    }

    public String deleteUser(int id) {
//        userRepo.delete(userRepo.getReferenceById(id));
        userRepo.deleteById(id);
        return "User Deleted";
    }
    public String deleteUser(UserDto userDto) {
        userRepo.delete(modelMapper.map(userDto, User.class));
        return "User Deleted";
    }


    public String getUserById(int id) {
        userRepo.getUserById(id);
//        userRepo.findById(id).orElse(null);
        return "User Deleted";
    }
}

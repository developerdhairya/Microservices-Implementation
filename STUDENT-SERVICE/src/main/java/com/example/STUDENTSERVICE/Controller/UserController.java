package com.example.STUDENTSERVICE.Controller;

import com.example.STUDENTSERVICE.DTO.CreateUserDTO;
import com.example.STUDENTSERVICE.DTO.UserDepartmentDTO;
import com.example.STUDENTSERVICE.Entity.UserEntity;
import com.example.STUDENTSERVICE.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public UserEntity createUser(@RequestBody CreateUserDTO createUserDTO) {
        log.info("Inside saveUser of UserController");
        return userService.createUser(createUserDTO);
    }

    @GetMapping("/{id}")
    public UserDepartmentDTO getUserWithDepartment(@PathVariable("id") Integer userId) {
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }


}
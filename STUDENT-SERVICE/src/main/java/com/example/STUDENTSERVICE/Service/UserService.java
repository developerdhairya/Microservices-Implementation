package com.example.STUDENTSERVICE.Service;

import com.example.STUDENTSERVICE.DTO.CreateUserDTO;
import com.example.STUDENTSERVICE.DTO.Internal.DepartmentDTO;
import com.example.STUDENTSERVICE.DTO.UserDepartmentDTO;
import com.example.STUDENTSERVICE.Entity.UserEntity;
import com.example.STUDENTSERVICE.Repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service @Slf4j
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    public UserEntity createUser(CreateUserDTO createUserDTO) {
        UserEntity userEntity=new UserEntity();
        userEntity.setFirstName(createUserDTO.getFirstName());
        userEntity.setFirstName(createUserDTO.getLastName());
        userEntity.setEmailId(createUserDTO.getEmailId());
        userEntity.setDepartmentId(createUserDTO.getDepartmentId());
        return userRepository.save(userEntity);
    }

    public UserDepartmentDTO getUserWithDepartment(Integer id){
        log.info("Inside getUserWithDepartment of UserService");
        Optional<UserEntity> userOptional=userRepository.findById(id);
        if(userOptional.isEmpty()) return null;
        UserEntity user=userOptional.get();
        UserDepartmentDTO userDepartmentDTO=new UserDepartmentDTO();
        DepartmentDTO department= restTemplate.getForObject("http://DEPARTMENT-SERVICE:8081/departments/" + user.getDepartmentId(), DepartmentDTO.class);
        userDepartmentDTO.setUser(user);
        userDepartmentDTO.setDepartmentDTO(department);
        return userDepartmentDTO;
    }

}

package com.example.STUDENTSERVICE.DTO;

import com.example.STUDENTSERVICE.DTO.Internal.DepartmentDTO;
import com.example.STUDENTSERVICE.Entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class UserDepartmentDTO {
    private UserEntity user;
    private DepartmentDTO departmentDTO;
}

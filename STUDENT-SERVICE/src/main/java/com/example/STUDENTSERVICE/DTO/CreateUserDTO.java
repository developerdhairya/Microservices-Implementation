package com.example.STUDENTSERVICE.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CreateUserDTO {

    private String firstName;
    private String lastName;
    private String emailId;
    private Integer departmentId;

}

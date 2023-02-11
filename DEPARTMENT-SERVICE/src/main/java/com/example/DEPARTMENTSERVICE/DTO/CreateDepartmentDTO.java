package com.example.DEPARTMENTSERVICE.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CreateDepartmentDTO {
    private String name;
    private String address;
}

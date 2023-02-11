package com.example.DEPARTMENTSERVICE.Controller;


import com.example.DEPARTMENTSERVICE.DTO.CreateDepartmentDTO;
import com.example.DEPARTMENTSERVICE.Entity.DepartmentEntity;
import com.example.DEPARTMENTSERVICE.Service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public DepartmentEntity createDepartment(@RequestBody CreateDepartmentDTO createDepartmentDTO) {
        log.info("Inside saveDepartment method of DepartmentController");
        System.out.println(createDepartmentDTO);
        return departmentService.createDepartment(createDepartmentDTO);

    }

    @GetMapping("/{id}")
    public Optional<DepartmentEntity> findDepartmentById(@PathVariable("id") Integer id) {
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(id);
    }

    @GetMapping("/")
    public List<DepartmentEntity> getAllDepartments() {
        log.info("Inside get all departments");
        return departmentService.getAllDepartments();
    }

}

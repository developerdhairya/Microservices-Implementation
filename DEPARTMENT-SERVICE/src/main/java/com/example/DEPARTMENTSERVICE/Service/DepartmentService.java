package com.example.DEPARTMENTSERVICE.Service;

import com.example.DEPARTMENTSERVICE.DTO.CreateDepartmentDTO;
import com.example.DEPARTMENTSERVICE.Entity.DepartmentEntity;
import com.example.DEPARTMENTSERVICE.Repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service @Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentEntity createDepartment(CreateDepartmentDTO createDepartmentDTO) {
        log.info("Inside saveDepartment of DepartmentService");
        DepartmentEntity departmentEntity=new DepartmentEntity();
        departmentEntity.setName(createDepartmentDTO.getName());
        departmentEntity.setAddress(createDepartmentDTO.getAddress());
        System.out.println(departmentEntity);
        return departmentRepository.save(departmentEntity);
    }

    public Optional<DepartmentEntity> findDepartmentById(Integer id) {
        log.info("Inside findDepartment");
        System.out.println(id);
        return departmentRepository.findById(id);
    }

    public List<DepartmentEntity> getAllDepartments() {
        return departmentRepository.findAll();
    }
}

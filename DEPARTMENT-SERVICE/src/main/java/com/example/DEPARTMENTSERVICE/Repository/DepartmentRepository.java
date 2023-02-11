package com.example.DEPARTMENTSERVICE.Repository;

import com.example.DEPARTMENTSERVICE.Entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Integer> {

    Optional<DepartmentEntity> findById(Integer id);

}

package com.departmentweb.servicedepartment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.departmentweb.servicedepartment.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}

package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
// This interface extends Spring Data JPA’s JpaRepository,
// specifying the domain type as Employee and the id type as Long

    interface EmployeeRepository extends JpaRepository<Employee, Long> {

    }


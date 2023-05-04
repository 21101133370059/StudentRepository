package com.SpringBoot.MyString.repository;

import com.SpringBoot.MyString.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Long> {
}

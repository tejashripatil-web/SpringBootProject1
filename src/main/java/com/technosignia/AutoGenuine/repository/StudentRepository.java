package com.technosignia.AutoGenuine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technosignia.AutoGenuine.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{

}

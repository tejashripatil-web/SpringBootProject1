package com.technosignia.AutoGenuine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technosignia.AutoGenuine.entity.Jobcard;

@Repository
public interface JobcardRepository extends JpaRepository<Jobcard,Long>
{
   
}

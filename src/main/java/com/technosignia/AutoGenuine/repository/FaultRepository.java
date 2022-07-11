package com.technosignia.AutoGenuine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technosignia.AutoGenuine.entity.Fault;
@Repository
public interface FaultRepository extends JpaRepository<Fault,Long>{

}

package com.technosignia.AutoGenuine.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technosignia.AutoGenuine.dto.AddressDto;
import com.technosignia.AutoGenuine.entity.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address,Long>{

	List<Address> findByEmployeeId(Long id);

}

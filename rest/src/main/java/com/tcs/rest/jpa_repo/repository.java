package com.tcs.rest.jpa_repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.rest.bean.data;

public interface repository extends JpaRepository<data, Integer>  {
	
}

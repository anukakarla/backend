package com.te.carmaintenance.dao;

import org.springframework.data.repository.CrudRepository;

import com.te.carmaintenance.bean.Admin;

public interface AdminDao extends CrudRepository<Admin, Integer>{
	public Admin findByUsername(String name) ;


}

package com.zmb.burgerTracker.repositaries;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zmb.burgerTracker.models.Burger;

@Repository
public interface BurgerRepository extends CrudRepository<Burger,Long>{
	List<Burger> findAll();
}

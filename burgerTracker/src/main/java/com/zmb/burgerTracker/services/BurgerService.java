package com.zmb.burgerTracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zmb.burgerTracker.models.Burger;
import com.zmb.burgerTracker.repositaries.BurgerRepository;

@Service
public class BurgerService {
	// adding the burger repository as a dependency
    private final BurgerRepository burgerRepository;
    
    public BurgerService(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }
    // returns all the burger
    public List<Burger> allBurgers() {
        return burgerRepository.findAll();
    }
    // creates a burger
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
    // retrieves a burger
    public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }
    }
 // update a burger
    public Burger updateBurger(Burger b) {
        return burgerRepository.save(b);
    }
//deletes a burger
    public void deleteBurger(Long id) {
    	Optional<Burger> optionalBurger = burgerRepository.findById(id);
		if(optionalBurger.isPresent()) {
			burgerRepository.deleteById(id);
		}
    }
}

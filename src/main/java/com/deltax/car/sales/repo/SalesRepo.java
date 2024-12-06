package com.deltax.car.sales.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deltax.car.sales.model.SalesForm;

public interface SalesRepo  extends JpaRepository<SalesForm, Integer>{

}

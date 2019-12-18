package com.raghavx.demospringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raghavx.demospringdata.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

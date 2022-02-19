package com.devsuperior.myfirstproject.repositories;


import com.devsuperior.myfirstproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

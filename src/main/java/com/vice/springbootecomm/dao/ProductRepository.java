package com.vice.springbootecomm.dao;

import com.vice.springbootecomm.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepository extends JpaRepository<Product,Long> {
}

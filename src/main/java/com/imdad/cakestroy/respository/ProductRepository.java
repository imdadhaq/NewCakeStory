package com.imdad.cakestroy.respository;

import com.imdad.cakestroy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

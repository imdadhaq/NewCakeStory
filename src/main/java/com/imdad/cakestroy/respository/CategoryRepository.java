package com.imdad.cakestroy.respository;

import com.imdad.cakestroy.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}

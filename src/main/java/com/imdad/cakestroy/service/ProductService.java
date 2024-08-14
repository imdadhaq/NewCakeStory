package com.imdad.cakestroy.service;

import com.imdad.cakestroy.model.Category;
import com.imdad.cakestroy.model.Product;
import com.imdad.cakestroy.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}

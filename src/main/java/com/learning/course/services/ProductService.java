package com.learning.course.services;

import com.learning.course.entities.Category;
import com.learning.course.entities.Product;
import com.learning.course.repositories.CategoryRepository;
import com.learning.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
       Optional<Product> obj = productRepository.findById(id);
       return obj.get();
    }

}

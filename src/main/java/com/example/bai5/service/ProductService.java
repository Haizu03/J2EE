package com.example.bai5.service;

import com.example.bai5.model.Category;
import com.example.bai5.model.Product;
import com.example.bai5.repository.CategoryRepository;
import com.example.bai5.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        // đảm bảo category không null và là category có thật
        if (product.getCategory() == null || product.getCategory().getId() == null) {
            throw new IllegalArgumentException("Category không được để trống");
        }
        Category c = categoryRepository.findById(product.getCategory().getId()).orElse(null);
        if (c == null) {
            throw new IllegalArgumentException("Category không tồn tại: " + product.getCategory().getId());
        }
        product.setCategory(c);

        productRepository.save(product);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

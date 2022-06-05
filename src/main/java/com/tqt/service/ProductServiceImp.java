package com.tqt.service;

import com.tqt.mapper.ProductMapper;
import com.tqt.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService{

    @Autowired
    private ProductMapper productMapper;


    @Override
    public int insertProduct(Product product) {
        return productMapper.insertProduct(product);
    }

    @Override
    public int updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }

    @Override
    public int deleteProductById(long productId) {
        return productMapper.deleteProductById(productId);
    }

    @Override
    public List<Product> selectAllProduct() {
        return productMapper.selectAllProduct();
    }

    @Override
    public Product selectProductById(long productId) {
        return productMapper.selectProductById(productId);
    }
}

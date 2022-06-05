package com.tqt.service;

import com.tqt.model.Product;

import java.util.List;


public interface ProductService {

    public int insertProduct(Product product);
    public int updateProduct(Product product);
    public int deleteProductById(long productId);
    public List<Product> selectAllProduct();
    public Product selectProductById(long productId);
}

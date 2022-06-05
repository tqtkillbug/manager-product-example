package com.tqt.controller;


import com.tqt.model.Product;
import com.tqt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public ModelAndView productLisPage(){
        List<Product> productList = productService.selectAllProduct();
        ModelAndView modelAndView = new ModelAndView("/product-list");
        modelAndView.addObject("products", productList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/create-product")
    public ModelAndView newProduct(@ModelAttribute("product") Product product) {
        productService.insertProduct(product);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @GetMapping("/edit-product/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
       Product product = productService.selectProductById(id);
        ModelAndView modelAndView;
        if (product != null) {
            modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("product", product);
        } else {
            modelAndView = new ModelAndView("/error404");
        }
        return modelAndView;
    }

    @PostMapping("/edit-product")
    public ModelAndView updateProduct(@ModelAttribute("product") Product product) {
        Product productCurrent = productService.selectProductById(product.getId());
        product.setDelete(productCurrent.getDelete());
        productService.updateProduct(product);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @GetMapping("/delete-product/{id}")
    public ModelAndView showSuspended(@PathVariable Long id) {
        Product product = productService.selectProductById(id);
        ModelAndView modelAndView;
        if (product != null) {
            modelAndView = new ModelAndView("/delete-form");
            modelAndView.addObject("product", product);
        } else {
            modelAndView = new ModelAndView("/error404");
        }
        return modelAndView;
    }

    @PostMapping("/delete-product")
    public ModelAndView deleteCustomer(@ModelAttribute("product") Product product) {
        productService.deleteProductById(product.getId());
        ModelAndView modelAndView = new ModelAndView("/product-list");
        List<Product> productList = productService.selectAllProduct();
        modelAndView.addObject("products", productList);
        return modelAndView;
    }


}

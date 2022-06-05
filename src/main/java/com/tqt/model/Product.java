package com.tqt.model;

public class Product {

    private Long id;

    private String name;

    private Double price;

    private Long quantity;

    private Boolean isDelete;

    public Product() {
    }

    public Product(Long id, String name, Double price, Long quantity, Boolean isDelete) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isDelete = isDelete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isDelete=" + isDelete +
                '}';
    }
}

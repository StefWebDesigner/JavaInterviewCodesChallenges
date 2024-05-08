package org.example.models;


public class CustomerDTO {

    private String customerName;
    private Integer id;
    private String productOrdered;
    private Double productPrice;


    public CustomerDTO(String customerName, Integer id, String productOrdered, Double productPrice) {
        this.customerName = customerName;
        this.id = id;
        this.productOrdered = productOrdered;
        this.productPrice = productPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductOrdered() {
        return productOrdered;
    }

    public void setProductOrdered(String productOrdered) {
        this.productOrdered = productOrdered;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
}

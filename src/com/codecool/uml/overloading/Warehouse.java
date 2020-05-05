package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Product> productList = new ArrayList<>();

    public void addProductList(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory){
        List<Product> result = new ArrayList<>();
        for (Product product : productList){
            if(product.getProductCategory().equals(productCategory)){
                result.add(product);
            }

        }
        return result;
    }

    public List<Product> getAllProductsBy(Supplier supplier){
        List<Product> result = new ArrayList<>();
        for (Product product:productList){
            if(product.getSupplier().equals(supplier)){
                result.add(product);
            }
        }
        return result;
    }
}

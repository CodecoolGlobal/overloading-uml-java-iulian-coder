package com.codecool.uml.overloading;


import java.util.Currency;
import java.util.Date;

public class Webshop {

    

    public static void main(String[] args) {

        //Create Warehouse
        Warehouse warehouse =new Warehouse();

        //Create Supplier
        Supplier supplier1 = new Supplier();
        supplier1.setName("Rechinul SRL");
        supplier1.setDescription("OEM products");

        Supplier supplier2 = new Supplier();
        supplier2.setName("Ghiocel SRL");
        supplier2.setDescription("Discounter");

        //Create Product category
        ProductCategory productCategory1 = new ProductCategory();
        productCategory1.setName("Auto & Accessories");
        productCategory1.setDepartment("Auto");
        productCategory1.setDescription("Piese pentru masina");


        //Create Products
        Product product1 = new Product();
        product1.setName("Masina");
        product1.setDefaultPrice(19.9f);
        product1.setDefaultCurrency(Currency.getInstance("USD"));
        product1.setProductCategory(productCategory1);
        product1.setSupplier(supplier1);

        Product product2 = new Product();
        product2.setName("Cauciuc");
        product2.setDefaultPrice(20.4f);
        product2.setDefaultCurrency(Currency.getInstance("RON"));
        product2.setProductCategory(productCategory1);
        product2.setSupplier(supplier2);

        //Adding products to Warehouse
        warehouse.addProductList(product1);
        warehouse.addProductList(product2);

        //Show all products in the Warehouse
        System.out.println(warehouse.getProductList());
        System.out.println(warehouse.getAllProductsBy(supplier1));
        System.out.println(warehouse.getAllProductsBy(productCategory1));

       // Create Feature product
        ProductCategory drillMachine = new FeaturedProductCategory();
        ((FeaturedProductCategory) drillMachine).schedule(new Date(2019,10,10), new Date(2020,02,02));
        System.out.println(drillMachine);




    }
}

package by.epam.java_introduction.basic_of_oop.task2;

    /*
    Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
    нескольких товаров.
     */

import java.util.HashMap;
import java.util.Map;

public class Payment {

    private Map<Product, Integer> productList = new HashMap<>();
    private boolean transaction = false;


    public void addProduct(Product product, int quantities){
        productList.put(product,quantities);
    }

    public Map<Product, Integer> getProductList() {
        return productList;
    }

    public void setProductList(Map<Product, Integer> productList) {
        this.productList = productList;
    }

    public void totalAmount(){
        System.out.println(productList.entrySet().stream()
                .mapToDouble(product -> product.getKey().getPrice() * product.getValue().intValue())
                .sum());
    }

    public void printReceipt(){
        productList.entrySet()
                .stream()
                .forEach(products->
                        System.out.println("Name: " + products.getKey().getName() + " brand " + products.getKey().getBrand()
                       + " price " + products.getKey().getPrice() + " quantity: " + products.getValue()));
    }


    public class Product{
        private String name;
        private String brand;
        private double price;
        private double weight;

        public Product(String name, String brand, double price, double weight) {
            this.name = name;
            this.brand = brand;
            this.price = price;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }
    }
}

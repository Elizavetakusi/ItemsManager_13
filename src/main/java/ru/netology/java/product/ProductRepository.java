package ru.netology.java.product;

public class ProductRepository {
    private Product[] products = new Product[0];

    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];


        }
        tmp[tmp.length - 1] = product;
        products = tmp;

    }

    public Product[] findAll() {
        return products;
    }

    public void removeById(int removeId) {
        Product[] tmp = new Product[products.length - 1];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != removeId) {
                tmp[index] = product;
                index++;

            }
        }
        products = tmp;

    }


}





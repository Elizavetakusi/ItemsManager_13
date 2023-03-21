package ru.netology.java.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    @Test
    public void testAdd() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Моя весна", 500, "Александр Шубкин");
        Book book2 = new Book(2, "Моя любовь", 600, "Александра Иванова");
        Smartphone smartphone1 = new Smartphone(3, "Readmi5", 10000, "Xiaomi");
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, smartphone1};

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testSearchWhenFewProductsFound() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Моя весна", 500, "Александр Шубкин");
        Book book2 = new Book(2, "Моя любовь", 600, "Александра Иванова");
        Smartphone smartphone1 = new Smartphone(3, "Readmi5", 10000, "Xiaomi");
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        Product[] actual = manager.searchBy("Моя");
        Product[] expected = {book1, book2};
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testSearchWhenProductsNotFound() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Моя весна", 500, "Александр Шубкин");
        Book book2 = new Book(2, "Моя любовь", 600, "Александра Иванова");
        Smartphone smartphone1 = new Smartphone(3, "Readmi5", 10000, "Xiaomi");
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        Product[] actual = manager.searchBy("моя");
        Product[] expected = {};
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testSearchWhen1ProductFound() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Моя весна", 500, "Александр Шубкин");
        Book book2 = new Book(2, "Моя любовь", 600, "Александра Иванова");
        Smartphone smartphone1 = new Smartphone(3, "Readmi5", 10000, "Xiaomi");
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        Product[] actual = manager.searchBy("любовь");
        Product[] expected = {book2};
        Assertions.assertArrayEquals(expected, actual);


    }


}
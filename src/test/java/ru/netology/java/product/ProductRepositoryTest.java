package ru.netology.java.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    @Test
    public void testRemoveWhenProductExist() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Моя весна", 500, "Александр Шубкин");
        Book book2 = new Book(2, "Моя любовь", 600, "Александра Иванова");
        Smartphone smartphone1 = new Smartphone(3, "Readmi5", 10000, "Xiaomi");
        repo.add(book1);
        repo.add(book2);
        repo.add(smartphone1);
        repo.removeById(1);
        Product[] actual = repo.findAll();
        Product[] expected = {book2, smartphone1};
        Assertions.assertArrayEquals(expected, actual);


    }


}

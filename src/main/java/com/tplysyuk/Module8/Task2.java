package com.tplysyuk.Module8;


import org.apache.commons.lang3.RandomStringUtils;

import java.sql.SQLOutput;
import java.util.*;

public class Task2 {

    private static List<Book> generateBooks(int booksQuantity) {
        ArrayList<Book> result = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < booksQuantity; i++) {
            double price = r.nextInt(98) + 1;
            String name = RandomStringUtils.randomAlphabetic(r.nextInt(7) + 3);
            Book newBook = new Book(name, price);
            result.add(newBook);

        }
        return result;
    }

    public static void main(String[] args) {
        List<Book> books = generateBooks(10);
        books.stream().forEach(System.out::println);
        //System.out.println();

        double totalPrice = books.stream().map(Book::getPrice).reduce(0.00, (subtotal, price) -> subtotal + price);
        System.out.println(totalPrice);

        books.stream().map(Book::getName).forEach(System.out::println);

        books.stream().map(Book::getName).filter(name -> name.contains("a") || name.contains("A")).forEach(System.out::println);

        Book mostExpensive = books.stream().max(Comparator.comparing(Book::getPrice)).get();
        System.out.println(mostExpensive);

        long longNames = books.stream().map(Book::getName).filter(name->name.length()==5).count();
        System.out.println(longNames);

        books.stream().filter(book->book.getPrice()<30).forEach(System.out::println);

        Book book1 = new Book ("myBook", 5);
        Book book2 = new Book ("myBook", 5);
        Map<Book,String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1,"myLibrary");
        mapWithBook.entrySet().stream().filter(entry ->entry.getKey().getName().equals(book2.getName()) ).map(entry ->entry.getValue()).forEach(System.out::println);

            }
}
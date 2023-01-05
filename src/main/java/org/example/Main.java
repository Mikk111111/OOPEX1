package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> arrBook = new ArrayList<>();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        arrBook.add(new Book("Home",23,1999));
        arrBook.add(new Book("Foreign",93,1699));
        arrBook.add(new Book("Similar",233,1349));
        arrBook.add(book1);
        arrBook.add(book2);
        arrBook.add(book3);
        book1.setTitle("Kakadu");
        book2.setTitle("Kaka2");
        book3.setTitle("Kaka");
        book1.setPages(345);
        book2.setPages(245);
        book3.setPages(35);
        book1.setReleaseYear(2022);
        book2.setReleaseYear(2);
        book3.setReleaseYear(1022);
        for(int i = 0; i<arrBook.size();i++)
        {
            System.out.println(arrBook.get(i).getTitle());
        }

    }
}
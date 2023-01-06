package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> arrPlant = new ArrayList<>();
        Plant plant1 = new Plant();
        Plant plant2 = new Plant();
        arrPlant.add(new Plant("Saula","Lasaula",true,"Mars",2,true));
        arrPlant.add(new Plant("Tree","Latree",false,"Earth",45,false));
        arrPlant.add(plant1);
        arrPlant.add(plant2);
        plant1.setName("Koja");
        plant2.setName("Kija");
        plant1.setLatinName("Lakoja");
        plant2.setLatinName("Lakija");
        plant1.setAnnual(true);
        plant2.setAnnual(false);
        plant1.setOrigin("LT");
        plant2.setOrigin("EN");
        plant1.setHeight(1.45);
        plant2.setHeight(0.5);
        plant1.setEdible(false);
        plant2.setEdible(true);

        //arrPlant.get(1).setName("null");
        for(int i = 0; i<arrPlant.size();i++)
        {
            System.out.println(arrPlant.get(i));
        }
    }
    public static void EX1()
    {
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
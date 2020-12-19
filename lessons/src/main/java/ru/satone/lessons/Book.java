/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.satone.lessons;

/**
 *
 * @author saton
 */
public class Book {
    String name;
    Type bookType;
    String author;
    public Book(String name, String author, Type type){
        bookType = type;
        this.name = name;
        this.author = author;
    }
}

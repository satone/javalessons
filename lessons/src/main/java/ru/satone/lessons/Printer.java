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
public class Printer {
    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}

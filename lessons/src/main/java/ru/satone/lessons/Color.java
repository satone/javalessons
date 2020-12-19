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
public enum Color {
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
    private String code;

    private Color(String code) {
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}

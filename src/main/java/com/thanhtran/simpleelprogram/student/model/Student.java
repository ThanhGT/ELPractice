/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhtran.simpleelprogram.student.model;

/**
 *
 * @author Thanh Tran
 */
public class Student {
    
    private String name;
    private boolean fullTime;

    public Student(String name, boolean fullTime) {
        this.name = name;
        this.fullTime = fullTime;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }
    
    
    
}

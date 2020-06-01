package com.example.demo;

import java.io.Serializable;

public class TempPojo {

    int id;
    String name;
    int temp;

    public TempPojo(int id, String name, int temp) {
        this.id = id;
        this.name = name;
        this.temp = temp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}

package com.company.Library;
import java.util.Date;
public class Users {

    private int id;
    private String name;
    private Date startDateAb;


    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setStartDateAb(Date startDateAb) {
        this.startDateAb = startDateAb;
    }
}

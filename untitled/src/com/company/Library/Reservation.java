package com.company.Library;
import java.util.Date;
public class Reservation {

    private Users user;
    private Book book;
    private Date startDate;
    private Date endDate;


    public Reservation (Users newUser, Book newBook, Date newStartDate, Date newEndDate){

        this.user = newUser;
        this.book = newBook;
        this.startDate = newStartDate;
        this.endDate = newEndDate;

    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}

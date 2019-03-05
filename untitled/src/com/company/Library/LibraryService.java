package com.company.Library;


import com.company.Library.Users;

public class LibraryService {

    public Users[] users =  new Users[50];
    public Book[] books = new Book[]{
            new Book(1,"Titlu1"),
            new Book(2,"Titlu2")
    };
    public Reservation [] Reservations = new Reservation[50];
    public int reservationCurrent = 0;
    public int userCount = 0;
    public Book[] listAll(){
        return books;
    }

    public void addBooks(Book newBook){

    }

    public Users getUserById(int id){
        for(Users element : users){
            if(element.getId() == id)return element;
        }
        Users error = new Users();
        error.setName("Error");
        return error;
    }

    public int existsByName (String name){
        for(int i = 0 ;i < books.length;++i)
            System.out.println(books[i].getTitle());
        return 0;
    }

    public void addReservations(Reservation newReservation){
        Reservations[reservationCurrent] = newReservation;
        reservationCurrent ++;
    }



    private Book getBookById(int id){
        for (Book book:books){
            if(book.getId() == id)return book;
        }
        Book error  =  new Book();
        error.setTitle("Error");
        return error;
    }
}

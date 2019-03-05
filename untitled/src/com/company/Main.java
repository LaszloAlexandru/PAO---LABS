package com.company;

import com.company.Library.LibraryService;
import com.company.Library.Users;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Users A = new Users();
        A.setName("Gion");
        System.out.println(A.getName());
        LibraryService B = new LibraryService();
        B.existsByName("Title1");
    }
}

package com.company;

import java.util.Scanner;

public class StudentInput {
    private Scanner scanner = new Scanner(System.in);


    Library library = new Library();

    //this method takes users input and shows current name if exists else shows invalid enter
    public void currentInput() {
        String str = scanner.nextLine();
        if (library.getList().contains(str)) {
            System.out.println("Your choice is: " + str + "\n");
        } else {
            System.out.println("Invalid enter, please try again" + "\n");
        }
    }
// stdout full list
    public void showFullList() {
        System.out.println(library.getList().toString());
        System.out.println();
    }
//stdout full list in  Alphabetical order
    public void showAlphabeticalList() {
        library.alphabeticalList();
        System.out.println();
    }
    //stdout full list in  reverse order
    public void showReverseList() {
        library.reverseList();
        System.out.println();
    }
}

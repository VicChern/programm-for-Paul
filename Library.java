package com.company;

import java.util.*;

public class Library {
    private ArrayList <String> list = new ArrayList<>();

    // adding some data to our list
    public ArrayList<String> getList() {

        list.add("Algebra");
        list.add("Geometry");
        list.add("Chemistry");
        list.add("Physics");
        list.add("Biology");
        list.add("English");
        list.add("Russian");
        list.add("German");
        list.add("Japan");
        list.add("Jumping");
        list.add("Fighting");
        list.add("Present");
        list.add("Past");
        list.add("Simple");
        list.add("Test");
        list.add("Driving");
        list.add("AI Learning");
        list.add("Studing");
        list.add("MBA");
        list.add("Climbing");
        list.add("Reading");
        list.add("Writing");
        list.add("Algorithms");
        list.add("Java");

        return list;
    }

    // shows list in alphabetical order
    public void alphabeticalList (){
        Collections.sort(list);
        System.out.println(list);
    }
//    shows list in descending order
    public void reverseList (){
        Collections.reverse(list);
        System.out.println(list);
    }

}

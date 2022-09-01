package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<People> Person = new ArrayList<>();

        Person.add(new People( "Dima"));
        Person.add(new People( "Dima"));
        Person.add(new People( "Olga"));
        Person.add(new People("Saule"));

        System.out.print("Person name = " + Person);


            }
        }

package org.example;

public abstract class AbstractPeople {
    public static String name;
    public AbstractPeople(String name) {

    AbstractPeople.name = name;
   }
   @Override
    public String toString() {
        return name ;
    }
  }
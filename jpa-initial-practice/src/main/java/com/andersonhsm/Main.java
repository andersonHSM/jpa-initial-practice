package com.andersonhsm;

import domain.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Carlos da Silva", "carlos@gmail.com");
        Person p2 = new Person(2, "Joaquina Torres", "joaquina@gmail.com");
        Person p3 = new Person(3, "Ana Maria", "ana@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
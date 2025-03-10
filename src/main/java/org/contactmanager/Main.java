package org.contactmanager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> contacts= FileHandler. readContactsFromFile();
        for (Contact contat:contacts) {
            System.out.println("name "+ contat.getName());
            System.out.println("mobile "+ contat.getMobile());
            System.out.println("Email "+ contat.getEmail());

        }
    }
}
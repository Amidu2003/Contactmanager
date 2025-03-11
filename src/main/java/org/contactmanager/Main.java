package org.contactmanager;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> contacts= FileHandler. readContactsFromFile();

        JFrame frame = new JFrame("Contact manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLayout(new BorderLayout());

        contactManager contactUI = new contactManager(contacts);
        JScrollPane scrollPane = new JScrollPane(contactUI);
        frame.add(scrollPane,BorderLayout.CENTER);

        frame.setVisible(true);




     }
}
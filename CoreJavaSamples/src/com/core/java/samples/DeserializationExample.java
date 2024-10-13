package com.core.java.samples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        Employee employee = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            employee = (Employee) in.readObject();  // Deserializing the object
            in.close();
            fileIn.close();
            System.out.println("Deserialized Employee:");
            System.out.println("Name: " + employee.name);
            System.out.println("ID: " + employee.id);
            System.out.println("Password: " + employee.password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


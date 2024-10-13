package com.core.java.samples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class ObjectDeserializationExample {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee emp = (Employee) ois.readObject();  // Reading the object
            System.out.println("Name: " + emp.name + ", ID: " + emp.id);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

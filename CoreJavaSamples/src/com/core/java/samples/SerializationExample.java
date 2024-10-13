package com.core.java.samples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;  // Ensures compatibility across versions
    String name;
    int id;

    transient String password;  // This field won't be serialized

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Kumar", 101);
        Employee emp = new Employee("Praveen", 101, "Demo@1234");
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);  // Serializing the object
            out.close();
            fileOut.close();
            System.out.println("Employee object has been serialized and saved as employee.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.assignment.employeemanagement.model;

import jakarta.persistence.*;

import java.util.concurrent.atomic.AtomicInteger;

@Entity
@Table(name = "employees")
public class Employee {
    private static final AtomicInteger count = new AtomicInteger(0);
    @Id
    private int id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "email")
    private String Email;

    //Default constructor
    public Employee() {this.id = count.incrementAndGet();}

    public Employee(String first_name, String last_name, String email) {
        this.id = count.incrementAndGet();
        this.first_name = first_name;
        this.last_name = last_name;
        Email = email;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getFirst_name() {return first_name;}
    public void setFirst_name(String first_name) {this.first_name = first_name;}
    public String getLast_name() {return last_name;}
    public void setLast_name(String last_name) {this.last_name = last_name;}
    public String getEmail() {return Email;}
    public void setEmail(String email) {Email = email;}
}

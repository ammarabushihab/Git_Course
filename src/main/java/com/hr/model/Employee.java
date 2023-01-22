package com.hr.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HR_Employee")
public class Employee  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @UniqueElements(message = "The Id Already Registered")
    private  long id;
@NotEmpty(message = "The First Name Is required Field")
    private  String firstName;
@NotEmpty(message = "The Last Name is a Required Field ")
    private  String  lastName ;

@NotNull(message = "The Salary Should be insert")
private  double salary;
    @Column(name = "Location")
    private String location ;
//    @UniqueElements(message = "The Email is Already Exist")
    @jakarta.validation.constraints.Email(message = "The Email should be correct")

    private String Email;
//@UniqueElements(message = "Phone Number already exist ")
//@Max(value = 10,message = "The Allow is 10 Digit's")
//@Min(value = 5,message = "The Minimum is 5 Digit")
@NotBlank(message = "Cannot be Empty")
    private String Phone;

    @ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="department_Id")
    private Department department;

//    public Employee(    ) {
//    }
//
//    public Employee(long id, String firstName, String lastName, double salary, String location) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.salary = salary;
//        this.location = location;}
//
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    //Getters
//
//
//    public long getId() {
//        return id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public String getLocation() {
//        return location;
//    }


    }



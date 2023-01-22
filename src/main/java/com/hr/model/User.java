package com.hr.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User_details ")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long userId;
    @NotBlank
    @Column(name = "First_Name ")
    private String userF_Name ;
    @NotBlank
@Column(name = "Last_Name ")
    private  String userL_Name;
@Email
@NotBlank
@Column(name = "User_Email")
private  String userEmail;
@NotBlank
    @Column(name = "User_Mobile_Number")
    private String userMobile;
@Column(name = "User_Salary")
private int salary;

    }


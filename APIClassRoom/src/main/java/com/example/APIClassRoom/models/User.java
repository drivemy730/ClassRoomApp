package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class User
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer userId;

    @Column( length = 100, nullable = false )
    private String userName;

    @Column( length = 100, unique = true, nullable = false)
    private String userEmail;

    @Column( length = 255, nullable = false)
    private String userPassword;

    @Column( name = "user_phone_number", length = 20, nullable = true )
    private String userPhoneNumber;

    @Column( nullable = false)
    @Enumerated(EnumType.STRING) // usé esta anotacion para que JPA traiga el string de la clase y no su posicion.
    private UserType userType;


    //RELATIONS//

    //relationship with Student
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Student> studentList;

    // Constructors
    public User() {
    }

    public User(Integer userId, String userName, String userEmail, String userPassword, String userPhoneNumber, UserType userType) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userPhoneNumber = userPhoneNumber;
        this.userType = userType;
    }

    //Getters and setters

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }




}

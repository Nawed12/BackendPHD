package com.example.backendphd.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class StudentDTO {


    private int studentid;

    private String name;

    private Long mobile;

    private String email;

    private String city;

    private String state;

    private int pincode;

    private int tenth;

    private int twelveth;

    private int graduation;

    private String password;


    public StudentDTO(int studentid, String name, Long mobile, String email, String city, String state, int pincode, int tenth, int twelveth, int graduation, String password) {
        this.studentid = studentid;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.tenth = tenth;
        this.twelveth = twelveth;
        this.graduation = graduation;
        this.password = password;
    }

    public StudentDTO() {
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getTenth() {
        return tenth;
    }

    public void setTenth(int tenth) {
        this.tenth = tenth;
    }

    public int getTwelveth() {
        return twelveth;
    }

    public void setTwelveth(int twelveth) {
        this.twelveth = twelveth;
    }

    public int getGraduation() {
        return graduation;
    }

    public void setGraduation(int graduation) {
        this.graduation = graduation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentid=" + studentid +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                ", tenth=" + tenth +
                ", twelveth=" + twelveth +
                ", graduation=" + graduation +
                ", password='" + password + '\'' +
                '}';
    }
}

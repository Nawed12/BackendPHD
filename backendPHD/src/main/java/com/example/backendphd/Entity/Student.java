package com.example.backendphd.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name="student_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentid;

    @Column(name="name", length = 255)
    private String name;

    @Column(name="mobile", length = 255)
    private Long mobile;


    @Column(name="email", length = 255)
    private String email;


     @Column(name="city", length = 255)
    private String city;

     @Column(name="state", length = 255)
    private String state;

     @Column(name="pincode", length = 255)
    private int pincode;

     @Column(name="tenth", length = 255)
    private int tenth;

     @Column(name="twelveth", length = 255)
    private int twelveth;

     @Column(name="graduation", length = 255)
    private int graduation;

    @Column(name="password", length = 255)
    private String password;


    public Student(int studentid, String name, Long mobile, String email, String city, String state, int pincode, int tenth, int twelveth, int graduation, String password) {
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

    public Student() {
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
        return "Student{" +
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

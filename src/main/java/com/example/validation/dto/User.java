package com.example.validation.dto;

//import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;

@Getter
@Setter
@ToString
//@AllArgsConstructor
public class User {
    @NotBlank
    private String name;
    @Min(value=0)
    @Max(value=99)
    private int age;
    @Email
    private String email;
    @Pattern(regexp = "^01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$", message = "10 ~ 11 자리의 숫자만 입력 가능합니다.")
    private String phoneNumber;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", email='" + email + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
//    }
}

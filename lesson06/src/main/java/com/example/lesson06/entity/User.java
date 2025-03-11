package com.example.lesson06.entity;
import lombok.*;

import jakarta.persistence.*;
@Entity
@Table(name = "users")
@NoArgsConstructor // Tạo constructor không tham số (cần cho JPA)
@AllArgsConstructor
@Getter
@Setter

public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "username", unique = true)
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "isactive")
    private Boolean isactive;
}

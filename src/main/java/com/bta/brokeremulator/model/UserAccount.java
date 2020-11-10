package com.bta.brokeremulator.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USER_ACCOUNT")
@SuperBuilder
@Getter
@Setter
@NoArgsConstructor

public class UserAccount implements Serializable {
    private static final long serialVersionUID =4L;


    @Id
    @SequenceGenerator(name ="USER_ACCOUNT_SEQ", sequenceName = "USER_ACCOUNT_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_ACCOUNT_SEQ")
    private Long id;

    @Column(name="username", length = 50,nullable = false, unique = true)
    private String username;

    @Column(name="password", length = 50,nullable = false)
    private String password;

    @Column(name="email", length = 50,nullable = false, unique = true)
    private String email;

    @Column(name="phone", length = 50,nullable = false, unique = true)
    private  String phone;

    @Column(name="address", length = 50,nullable = false)
    private  String address;

    @Column(name="first_name", length = 50,nullable = false)
    private  String firstName;

    @Column(name="last_name", length = 50,nullable = false)
    private  String lastName;



}

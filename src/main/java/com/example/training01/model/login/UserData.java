package com.example.training01.model.login;

import lombok.Data;

@Data
public class UserData {

    private String uID;

    private String uName;

    private String firstname;

    private String lastname;

    private String email;

    private String image;

    private boolean login = false;
}

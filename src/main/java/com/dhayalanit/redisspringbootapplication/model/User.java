package com.dhayalanit.redisspringbootapplication.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Setter
@Getter
@ToString
@Document(collation = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String serialNumber;
    private String address;
    private String phone;

}

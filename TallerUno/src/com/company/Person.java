package com.company;

import java.util.Date;

public class Person
{
    //variables nativas de la clase
    public String documentType;
    public String documentNumber;
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    public String phoneNumber;

    //constructores
    public Person()
    {
        documentType="CC";
        documentNumber="1053777489";
        name="Angela";
        lastName1="Espinosa";
        lastName2="Granada";
        //dateBirth=1987-06-17;
        height=163;
        phoneNumber="3193452785";
    }

    public Person(String documentType, String documentNumber,  String name, String lastName1, String lastName2, Date dateBirth, float height, String phoneNumber)
    {
        this();
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
        this.phoneNumber = phoneNumber;
    }
    //fin constructores



}

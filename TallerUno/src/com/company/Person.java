package com.company;

import java.util.Date;

public class Person
{
    //variables nativas de la clase
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    //constructores
    public Person()
    {
        name="Angela";
        lastName1="Espinosa";
        lastName2="Granada";
        //dateBirth=1987-06-17;
        height=163;
    }

    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height)
    {
        this();
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    //fin constructores



}

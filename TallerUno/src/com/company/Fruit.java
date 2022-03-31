package com.company;

public class Fruit
{
    //variables nativas de la clase
    public int idFruit;
    public String name;
    private float averageWeight;
    public String[] colors;

    //constructores
    public Fruit()
    {
        idFruit=001;
        name="Manzana";
        averageWeight=10;
        String[] colors={"verde"};
    }

    public Fruit(int idFruit, String name, float averageWeight, String color)
    {
        this();
        this.idFruit = idFruit;
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = new String[]{color};
    }
    //fin constructores

}

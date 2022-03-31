package com.company;

public class Fruit {
    //variables nativas de la clase
    public int idFruit;
    public String name;
    private float averageWeight;
    public String[] colors;

    //constructores
    public Fruit() {
        idFruit = 001;
        name = "Manzana";
        averageWeight = 10;
        String[] colors = {"verde"};
    }

    public Fruit(int idFruit, String name, float averageWeight, String color) {
        this();
        this.idFruit = idFruit;
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = new String[]{color};
    }
    //fin constructores

    //métodos

    public int getIdFruit()
    {
        return idFruit;
    }

    public void setIdFruit(int idFruit)
    {
        this.idFruit = idFruit;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public float getAverageWeight()
    {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight)
    {
        this.averageWeight = averageWeight;
    }

    public String[] getColors()
    {
        return colors;
    }

    public void setColors(String color)
    {
        this.colors = new String[]{color};
    }
    //fin metodos
}

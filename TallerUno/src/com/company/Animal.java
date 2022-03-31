package com.company;

public class Animal
{
    //variables nativas de la clase
    private int idAnimal;
    protected String animalName;
    public String animalSpecies;
    public int animalAge;

    //constructores
    public Animal()
    {
        idAnimal=00001;
        animalName="Sammy";
        animalSpecies="Perro";
        animalAge=10;

    }

    public Animal(int idAnimal, String animalName, String animalSpecies, int animalAge)
    {
        this();
        this.idAnimal=idAnimal;
        this.animalName=animalName;
        this.animalSpecies=animalSpecies;
        this.animalAge=animalAge;
    }
    //fin constructores

    //metodos
    private int getIdAnimal()
    {
        return idAnimal;
    }

    private void setIdAnimal(int idAnimal)
    {
        this.idAnimal=idAnimal;
    }

    protected String getAnimalName()
    {
        return animalName;
    }

    protected void setAnimalName(String animalName)
    {
        this.animalName=animalName;
    }

    public String getAnimalSpecies()
    {
        return animalSpecies;
    }

    public void setAnimalSpecies(String animalSpecies)
    {
        this.animalSpecies=animalSpecies;
    }

    public int getAnimalAge()
    {
        return animalAge;
    }

    public void setAnimalAge(int animalAge)
    {
        this.animalAge=animalAge;
    }
    //fin métodos
}

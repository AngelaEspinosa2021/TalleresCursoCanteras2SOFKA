package com.company;

public class Vehicle
{
    //variables nativas de la clase
    private int idVehicle;
    public String vehicleBrand;
    public String vehicleModel;
    protected String vehiclePlate;
    private int vehicleMileage;

    //constructores
    public Vehicle()
    {
        idVehicle=00001;
        vehicleBrand="Mazda";
        vehicleModel="2022";
        vehiclePlate="ABC-000";
        vehicleMileage=10000;
    }

    public Vehicle(int idVehicle, String vehicleBrand, String vehicleModel, String vehiclePlate, int vehicleMileage)
    {
        this();
        this.idVehicle=idVehicle;
        this.vehicleBrand=vehicleBrand;
        this.vehicleModel=vehicleModel;
        this.vehiclePlate=vehiclePlate;
        this.vehicleMileage=vehicleMileage;
    }
    //fin constructores

    //métodos
    private int getIdVehicle()
    {
        return idVehicle;
    }

    private void setIdVehicle(int idVehicle)
    {
        this.idVehicle=idVehicle;
    }

    public String getVehicleBrand()
    {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand)
    {
        this.vehicleBrand=vehicleBrand;
    }

    public String getVehicleModel()
    {
        return getVehicleBrand();
    }

    public void setVehicleModel(String vehicleModel)
    {
        this.vehicleModel=vehicleModel;
    }

    protected String getVehiclePlate()
    {
        return vehiclePlate;
    }

    protected void setVehiclePlate(String vehiclePlate)
    {
        this.vehiclePlate=vehiclePlate;
    }

    private int getVehicleMileage()
    {
        return vehicleMileage;
    }

    public void setVehicleMileage(int vehicleMileage)
    {
        this.vehicleMileage=vehicleMileage;
    }

}

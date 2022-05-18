package com.chaitanya.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//This annotation marks the class as being a domain object that we want to persist to the database
@Document
public class Vehicle
{
    //@Id marks a field in a model class as the primary key:
    @Id
    private int vehicleId;
    private String vehicleBrandName;
    private String vehicleModel;
    private String price;
    private int noOfSeats;
    private String fuelType;
    private String transmissionType;
    private String engineType;
    private String dimensions;

    public Vehicle()
    {

    }

    public Vehicle(int vehicleId, String vehicleBrandName, String vehicleModel,String price, int noOfSeats, String fuelType, String transmissionType, String engineType, String dimensions)
    {
        this.vehicleId = vehicleId;
        this.vehicleBrandName = vehicleBrandName;
        this.vehicleModel = vehicleModel;
        this.price = price;
        this.noOfSeats = noOfSeats;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineType = engineType;
        this.dimensions = dimensions;
    }

    public int getVehicleId()
    {
        return vehicleId;
    }
    public void setVehicleId(int vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public String getVehicleBrandName()
    {
        return vehicleBrandName;
    }
    public void setVehicleBrandName(String vehicleBrandName)
    {
        this.vehicleBrandName = vehicleBrandName;
    }

    public String getVehicleModel()
    {
        return vehicleModel;
    }
    public void setVehicleModel(String vehicleModel)
    {
        this.vehicleModel = vehicleModel;
    }

    public String getPrice()
    {
        return price;
    }
    public void setPrice(String price)
    {
        this.price = price;
    }

    public int getNoOfSeats()
    {
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats)
    {
        this.noOfSeats = noOfSeats;
    }

    public String getFuelType()
    {
        return fuelType;
    }
    public void setFuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }

    public String getTransmissionType()
    {
        return transmissionType;
    }
    public void setTransmissionType(String transmissionType)
    {
        this.transmissionType = transmissionType;
    }

    public String getEngineType()
    {
        return engineType;
    }
    public void setEngineType(String engineType)
    {
        this.engineType = engineType;
    }

    public String getDimensions()
    {
        return dimensions;
    }
    public void setDimensions(String dimensions)
    {
        this.dimensions = dimensions;
    }

    //@Override annotation denotes that the child class method overrides the base class method.
    @Override
    public String toString()
    {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleBrandName='" + vehicleBrandName + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", price=" + price +
                ", noOfSeats=" + noOfSeats +
                ", fuelType='" + fuelType + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", engineType='" + engineType + '\'' +
                ", dimensions='" + dimensions + '\'' +
                '}';
    }
}

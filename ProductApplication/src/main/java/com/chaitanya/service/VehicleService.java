package com.chaitanya.service;

import com.chaitanya.domain.Vehicle;
import com.chaitanya.exception.VehicleAlreadyExistsException;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface VehicleService
{
    Vehicle saveVehicleDetails(Vehicle vehicle) throws VehicleAlreadyExistsException;

    List<Vehicle> getAllProducts();

    Vehicle updateProduct(Vehicle vehicle, int id);

    boolean deleteProductById(int id);

    List<Vehicle> getVehicleByVehicleId(int id);
}

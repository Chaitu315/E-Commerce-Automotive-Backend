package com.chaitanya.service;

import com.chaitanya.domain.Vehicle;
import com.chaitanya.exception.VehicleAlreadyExistsException;
import com.chaitanya.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service annotation is used at the class level to mark a service implementation including business logic, calculations, etc.
@Service
public class VehicleServiceImpl implements VehicleService
{
    private VehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository vehicleRepository)
    {
        this.vehicleRepository =vehicleRepository;
    }

    //@Override annotation indicates that the child class method is over-writing its base class method
    @Override
    public Vehicle saveVehicleDetails(Vehicle vehicle) throws VehicleAlreadyExistsException
    {
        if(vehicleRepository.findById(vehicle.getVehicleId()).isPresent())
        {
            throw new VehicleAlreadyExistsException();
        }
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllProducts()
    {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle updateProduct(Vehicle vehicle, int id)
    {
        if(vehicleRepository.findById(id).isEmpty())
        {
            return null;
        }

        return vehicleRepository.save(vehicle);
    }

    @Override
    public boolean deleteProductById(int id)
    {
        vehicleRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Vehicle> getVehicleByVehicleId(int id)
    {
        return vehicleRepository.findByVehicleId(id);
    }
}

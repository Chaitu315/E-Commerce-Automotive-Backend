package com.chaitanya.repository;

import com.chaitanya.domain.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository annotation is used on java classes which directly access to the database.
//The repository does all the operations related to the database.
@Repository
public interface VehicleRepository extends MongoRepository<Vehicle,Integer>
{
    List<Vehicle> findByVehicleId(int vehicleId);
}

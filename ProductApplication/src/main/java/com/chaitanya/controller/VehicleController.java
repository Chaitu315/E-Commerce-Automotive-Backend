package com.chaitanya.controller;

import com.chaitanya.domain.Vehicle;
import com.chaitanya.exception.VehicleAlreadyExistsException;
import com.chaitanya.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//it is a combination of @Controller and @ResponseBody
//RestController is used for making restful web services
@RestController
//@RequestMapping is used to map web requests onto specific handler classes and/or handler methods
@RequestMapping("/api/v1")
//It is used to enable cross-origin request
//it allows restricting the resources implemented in web browsers and data transfers between browsers and servers.
@CrossOrigin(origins = "*")
public class VehicleController
{
    private ResponseEntity responseEntity;
    private VehicleService vehicleService;


    //It injects object dependency implicitly. When we use this annotation, the spring container auto-wires the bean by its matching data type.
    @Autowired
    public VehicleController(VehicleService vehicleService)
    {
        this.vehicleService = vehicleService;
    }

    //@PostMapping annotation is used for mapping HTTP POST requests onto specific handler methods
    @PostMapping("addProduct")
    //the Spring framework wraps the incoming HTTP request body to that parameter.
    //ResponseEntity represents the whole HTTP response: status code, headers, and body
    public ResponseEntity<?> saveVehicle(@RequestBody Vehicle vehicle) throws VehicleAlreadyExistsException
    {
        try
        {
            vehicleService.saveVehicleDetails(vehicle);
            responseEntity = new ResponseEntity(vehicle , HttpStatus.CREATED);
        }
        catch (VehicleAlreadyExistsException e)
        {
            throw new VehicleAlreadyExistsException();
        }
        catch (Exception e)
        {
            responseEntity = new ResponseEntity<>("Error  !!!Try after sometime", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;
    }

    @GetMapping("/products")
    public ResponseEntity<?> getProducts()
    {
        return new ResponseEntity<>(vehicleService.getAllProducts(),HttpStatus.OK);
    }

    @PutMapping("/product/{vehicleId}")
    //@PathVariable annotation is used to extract the value from the URI
    public ResponseEntity<?> updateProductById(@RequestBody Vehicle vehicle,@PathVariable int vehicleId)
    {
        return new ResponseEntity<>(vehicleService.updateProduct(vehicle,vehicleId), HttpStatus.OK);
    }

    @DeleteMapping("/product/{vehicleId}")
    public ResponseEntity<?> deleteProduct(@PathVariable int vehicleId)
    {
        return new ResponseEntity<>(vehicleService.deleteProductById(vehicleId), HttpStatus.OK);
    }

    @GetMapping("/product/{vehicleId}")
    public ResponseEntity<?> getVehicleByID(@PathVariable int vehicleId)
    {
        return new ResponseEntity<>(vehicleService.getVehicleByVehicleId(vehicleId), HttpStatus.OK);
    }
}

package com.accenture.training.controller;

import com.accenture.training.schema.Car;
import com.accenture.training.service.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarRoute {
    @Autowired
    private CarServiceImpl carServiceImpl;

    @RequestMapping(value = "/getDetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Car>> getCarDetails() {
        List<Car> listCar = new ArrayList<Car>(carServiceImpl.findAll());

        return new ResponseEntity<List<Car>>(listCar, HttpStatus.OK);
    }
    
    public void getCarById() {
    	
    }
    
    @RequestMapping(value = "/addCar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> addCar(@RequestBody Car car) {
        int count=carServiceImpl.saveCar(car);
        return new ResponseEntity<String>("Car added successfully with model:" + count,HttpStatus.CREATED);
    }
    
    public void updateCar() {
    	
    }
    
    public void deleteCar() {
    	
    }
}

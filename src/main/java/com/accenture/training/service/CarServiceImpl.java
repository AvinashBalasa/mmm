package com.accenture.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.training.entity.CarEntity;
import com.accenture.training.repository.CarDao;
import com.accenture.training.schema.Car;

@Service
public class CarServiceImpl {
    @Autowired
    private CarDao dao;

    public List<Car> findAll() {
        List<Car> list = new ArrayList<Car>();

        Iterable<CarEntity> listEn = dao.findAll();
        for (CarEntity x : listEn) {
            Car car = new Car();
            BeanUtils.copyProperties(x, car);
            list.add(car);
        }
        return list;
    }
    public Integer saveCar(Car car){
        CarEntity carEntity = new CarEntity();
        BeanUtils.copyProperties(car, carEntity);
        CarEntity en=  dao.save(carEntity);
        return en.getId();
    }
    
    
}

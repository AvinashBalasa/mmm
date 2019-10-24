package com.accenture.training.schema;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Car {

	private int id;

    @Size(max = 20, min = 3, message = "{car.name.invalid}")
    @NotEmpty(message = "Please enter name")
    @Pattern(regexp = "[0-9a-zA-Z_]*",message="No spaces and sp chars")
	private String name;
    
    @NotEmpty(message = "Please enter model year")
	private int model;
    
    @NotNull(message = "Please enter cost")
    private Double cost;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
}

package com.accenture.training.entity;

import javax.persistence.*;

@Entity
@Table(name="car_inventory")
public class CarEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private Double cost;
    private int model;

    @Override
	public String toString() {
		return "CarEntity [id=" + id + ", name=" + name + ", cost=" + cost + ", model=" + model + "]";
	}

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

package com.example.test2.model;


import jakarta.persistence.*;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Entity
@Table(name = "person_services")
public class PersonService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "servise_name")
    private String serviceName;

    @Column(name = "service_cost")
    private double serviceCost;

    public PersonService() {

    }

    public PersonService(long id, String serviceName, double serviceCost) {
        this.id = id;
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

    public long getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }
}

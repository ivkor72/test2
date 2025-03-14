package com.example.test2.model;


import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "person_services")
public class Usluga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "servise_name")
    private String serviceName;

    @Column(name = "service_cost")
    private double serviceCost;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_id")
    private List<Zapros> requestsForServices = new ArrayList<>();


    public Usluga() {

    }

    public Usluga(long id, String serviceName, double serviceCost) {
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

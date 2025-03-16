package com.example.test2.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "person_services")
public class Usluga {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Getter
    @Setter
    @Column(name = "servise_name")
    private String serviceName;

    @Getter
    @Setter
    @Column(name = "service_cost", columnDefinition = "DECIMAL(10,2)")
    private BigDecimal serviceCost;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_id")
    private List<Zapros> requestsForServices = new ArrayList<>();


    public Usluga() {

    }

    public Usluga(long id, String serviceName, BigDecimal serviceCost) {
        this.id = id;
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

}

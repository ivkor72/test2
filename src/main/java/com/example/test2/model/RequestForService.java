package com.example.test2.model;

import jakarta.persistence.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
@Transactional
@Entity
@Table(name = "requests_for_servises")
public class RequestForService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "person_id")
    private long personId;

    @Column(name = "service_id")
    private  long serviceId;

    @Column(name = "request_date")
    private Date requestDate;

    public RequestForService(long id, long personId, long serviceId, Date requestDate) {
        this.id = id;
        this.personId = personId;
        this.serviceId = serviceId;
        this.requestDate = requestDate;
    }

    public RequestForService() {

    }

    public long getId() {
        return id;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }
}

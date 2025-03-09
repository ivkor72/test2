package com.example.test2.model;

import jakarta.persistence.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Transactional
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "request_id")
    private long requestId;

    @Column(name = "pay_amount")
    private double payAmount;

    @Column(name = "payment_date")
    private Date paymentDate;

    public Payment(long id, long requestId, double payAmount, Date paymentDate) {
        this.id = id;
        this.requestId = requestId;
        this.payAmount = payAmount;
        this.paymentDate = paymentDate;
    }

    public Payment() {

    }

    public long getId() {
        return id;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}

package com.example.test2.model;

import lombok.Setter;

import javax.persistence.*;


import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Setter
    @Column(name = "request_id")
    private long requestId;

    @Setter
    @Column(name = "pay_amount", columnDefinition = "DECIMAL(10,2)")
    private BigDecimal payAmount;

    @Setter
    @Column(name = "payment_date")
    private Date paymentDate;

    public Payment(long id, long requestId, BigDecimal payAmount, Date paymentDate) {
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

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

}

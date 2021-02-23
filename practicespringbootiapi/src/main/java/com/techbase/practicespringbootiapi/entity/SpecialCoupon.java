package com.techbase.practicespringbootiapi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.techbase.practicespringbootiapi.enums.Type;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class SpecialCoupon{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private Integer status;
    @Column(name = "price")
    private Double price;
    @Column(name = "count")
    private Integer count;

    @Column(name = "start_date")
//    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate startDate;

//    @JsonFormat(pattern="dd-MM-yyyy")
    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private Type type;

    public SpecialCoupon() {
    }

    public SpecialCoupon(Long id, String name, Integer status, Double price, Integer count, LocalDate startDate, LocalDate endDate, Type type) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.price = price;
        this.count = count;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
